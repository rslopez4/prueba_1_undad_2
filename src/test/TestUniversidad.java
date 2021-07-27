package Test;

import Dominio.Estudiante;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class TestUniversidad {
    
        static Scanner entrada = new Scanner(System.in);
        
        public static void main(String[] args) {
            
        
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        int op;
        //llenaEstudiante(estudiantes);

        //if(op==1){
          //  Collections.sort(estudiantes);
        //}else{
         //   Collections.sort(estudiantes, Collections.reverseOrder());
        //}        
        //Curso curso = new Curso(1, "Curso A", estudiantes);
        //System.out.println(curso.getNombre());
        //imprime(estudiantes);       
    }
    
        
        public static void llenaEstudiante(ArrayList<Estudiante> e) {
        String nombre;
        for (int i = 1;;) {
            System.out.print("Presione cualquier tecla o Digite <<0>> para salir:  ");
            nombre = entrada.nextLine();
            if ("0".equals(nombre)) {
                break;
            } else {
                entrada.nextLine();
                System.out.print("Nombre: ");
                nombre = entrada.nextLine();
                e.add(new Estudiante(nombre));
            }
        }
        }
}