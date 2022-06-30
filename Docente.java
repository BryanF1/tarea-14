package tarea14;

public class Docente extends Persona
{
    private  String especialidad;
        
    public Docente(String nombre,String apellido,Integer dni,Integer fechaNacimiento,Integer anActual)
    {
       super(nombre,apellido,dni,fechaNacimiento,anActual);
    } 
   public void ingresarEspecialidad(String especialidad)
   {
      this.especialidad= especialidad;  
   }
   public String mostrarEspecialidad()
   {
      return especialidad;
   }
   public String toString()
   {
      return this.mostrarNombre()+ " " 
      +this.mostrarApellido()+" "
      +this.mostrarDni()+" "
      +this.mostrarFechaNacimiento()+" "
      +this.mostrarAnActual();
   }
   @Override
   public  Integer calcularEdad()
   {
      return this.anActual - this.fechaNacimiento;
   }
}
