package tareaserializacion;

public class Estudiante extends Persona {
    private String carrera;
    
    public Estudiante(String nombre, int edad, String carrera){
        super(nombre, edad);
        this.carrera = carrera;
    }
    @Override
    public void cumplirDeber(){
        System.out.println(nombre + " estudia " + carrera + " como su deber.");
    }
    @Override 
    public String toString(){
        return super.toString() + ", Carrera: " + carrera;
    }
}
