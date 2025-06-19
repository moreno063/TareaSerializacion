
package tareaserializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
    ArrayList<Persona> personas = new ArrayList<>();
    
    personas.add(new Estudiante("Antonio", 19, "Ingenieria de sistemas"));
    personas.add(new Profesor("Luis", 45, "Programacion"));
    
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Personas.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(personas);
            out.close();
            System.out.println("Registro guardado exitosamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("Personas.ser");
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            ArrayList<Persona> personasCargadas = (ArrayList<Persona>) in.readObject();
            in.close();
            for (Persona p : personasCargadas){
                System.out.println(p);
                p.cumplirDeber();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            }
    }
}
