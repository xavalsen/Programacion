package ordenarporcampo;

public class Persona {
    
    public static enum Atributo{
        NOMBRE, EDAD, DNI
    }
    private String nombre;
    private int edad;
    
    public Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    @Override
    public String toString() {
      return  String.format("%s %d%n", getNombre(), getEdad());
 
 }
}
