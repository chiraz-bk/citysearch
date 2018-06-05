package com.example.chira.citysearchapp;

public class detail {
String name;
String adresse ;
String tel;
String fax;
String ofzeit;
public detail(){
}
public detail(String name, String adresse,String tel,String fax,String ofzeit){
    this.name = name;
    this.adresse=adresse;
    this.tel=tel;
    this.fax=fax;
    this.ofzeit=ofzeit;

}
public String show(){
    return name + "\nAdresse: "+adresse+"\ntel.:"+tel+"\nfax.:"+fax+"\nöffnungszeit: \n"+ofzeit;
}
}
