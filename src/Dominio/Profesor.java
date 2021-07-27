package Dominio;

import java.util.ArrayList;

public class Profesor {
    
    private String nombre;
    private ArrayList<Materia> materias;

    public Profesor(String nombre, ArrayList<Materia> materias) {
        this.nombre = nombre;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    
    }
    
}