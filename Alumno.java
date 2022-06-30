package tarea14;

public class Alumno extends Persona 
{
   private int codigo;
   private Curso curso[];
   private int contador;
      
   public Alumno(String nombre,String apellido,Integer dni,Integer fechaNacimiento,Integer anActual)
   {
     super(nombre,apellido,dni,fechaNacimiento,anActual);
     this.curso=new Curso[2];
     this.contador=0;
   } 
   public void ingresarCodigo(int codigo)
  {
    this.codigo=codigo;  
  }
  public int mostrarCodigo()
  {
    return codigo;
  }
  public void ingresarCurso(Curso curso)
    {
      this.curso[this.contador]=curso;
      this.contador++;
    }
   public Curso[]mostrarCurso()
   {
     return curso;
   }
  public String toString()
  {
    return ("\nnombres: "+this.mostrarNombre()+ 
    "\nApellidos: " +this.mostrarApellido()+
    "\nDni:  "+this.mostrarDni()+
    "\nAnio De Nacimiento.: "+this.mostrarFechaNacimiento());
  }
  @Override
  public  Integer calcularEdad()
  {
    return this.anActual - this.fechaNacimiento;
  }


}
