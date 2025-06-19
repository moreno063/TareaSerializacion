package tareaserializacion;

import java.io.Serializable;

public abstract class Persona implements Deberes, Serializable {
    protected String nombre;
    protected int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }  
}
