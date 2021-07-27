package Dominio;

import java.util.ArrayList;



public class Facultad {
    
    private String nombre;
    private ArrayList<directorFacultad> director;
    private ArrayList<Carrera> carreras;
    private ArrayList<Profesor> profesores;

    public Facultad(String nombre, ArrayList<directorFacultad> director, ArrayList<Carrera> carreras, ArrayList<Profesor> profesores) {
        this.nombre = nombre;
        this.director = director;
        this.carreras = carreras;
        this.profesores = profesores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<directorFacultad> getDirector() {
        return director;
    }

    public void setDirector(ArrayList<directorFacultad> director) {
        this.director = director;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
    