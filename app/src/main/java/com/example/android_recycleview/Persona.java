package com.example.android_recycleview;

public class Persona {
    private String Nombre;
    private String Telefono;

    public Persona(String nombre, String telefono) {
        Nombre = nombre;
        Telefono = telefono;
    }

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String newNombre){
        this.Nombre = newNombre;
    }

    public String getTelefono(){
        return Telefono;
    }

    public void  setTelefono(String newTelefono){
        this.Telefono = newTelefono;
    }

}
