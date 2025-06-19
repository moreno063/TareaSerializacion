package tareaserializacion;

public class Profesor extends Persona{
    private String materia;
    
    public Profesor(String nombre, int edad, String materia){
        super(nombre, edad);
        this.materia = materia;
    }
    
    @Override 
    public void cumplirDeber(){
        System.out.println(nombre + " enseña " + materia + " como su deber.");
    }
    
    @Override
    public String toString(){
        return super.toString() + ", materia: " + materia;
    }
}
