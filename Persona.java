package tarea14;

public abstract class Persona 
{
    protected String nombre;
    protected String apellido;
    protected Integer dni;
    protected Integer fechaNacimiento;
    protected Integer anActual;
    
    
    public Persona(String nombre,String apellido,Integer dni,Integer fechaNacimiento ,Integer anActual)
    {
        this.nombre=nombre;
        this.apellido= apellido;
        this.dni=dni;
        this.fechaNacimiento=fechaNacimiento;
        this.anActual=anActual;
        
        
    }
    protected String mostrarNombre()
    {
       return nombre;  
    }
    protected String mostrarApellido()
    {
        return apellido;
    }
    protected Integer mostrarDni()
    {
       return dni;  
    }
    protected Integer mostrarFechaNacimiento()
    {
        return fechaNacimiento;
    
    }
    protected Integer mostrarAnActual()
    {
       return anActual;  
    }
    public abstract Integer calcularEdad();

      
    
    
}