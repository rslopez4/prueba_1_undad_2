package Dominio;

import java.util.ArrayList;

public class Universidad {
    
    private String nombre;
    private ArrayList<Facultad> facultades;

    public Universidad(String nombre, ArrayList<Facultad> facultades) {
        this.nombre = nombre;
        this.facultades = facultades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Facultad> getFacultades() {
        return facultades;
    }

    public void setFacultades(ArrayList<Facultad> facultades) {
        this.facultades = facultades;
    }
    
    
}
