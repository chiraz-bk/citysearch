package com.example.chira.citysearchapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class fragment extends Fragment {
    private static final String TAG = "Tab1Fragment";

    private Button btnTEST;

    ListView simpleList;
    String countryList[] = {"Toom Darmstadt","Rossmann Darmstadt","McDonalds Darmstadt","DM Weiterstadt","Saturn Weiterstadt","Rewe Darmstadt","Aldi Süd Darmstadt","Tegut Drmstadt","Rewe Center Weiterstadt","Penny Weiterstadt"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        btnTEST = (Button) view.findViewById(R.id.btnTEST);

        btnTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "hinzugefügt", Toast.LENGTH_SHORT).show();


            }
        });
        Spinner spinner = (Spinner) view.findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getContext(),
                R.array.kategorie, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        simpleList = (ListView)view.findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this.getContext(), R.layout.activity_listview, R.id.textView, countryList);
        simpleList.setAdapter(arrayAdapter);

        return view;
    }
}
