package tarea14;

public class Matricula 
{
    private int codigo;
    private Alumno alumno[];
    private int contador;
    
    public Matricula(int codigo) 
    {
        this.codigo=codigo;
        this.contador=0;
        this.alumno = new Alumno[1];
    }

   public void ingresarCodigo(int codigo)
   {
     this.codigo=codigo;
   }
   public int mostrarCodigo()
   {
     return codigo;
   }
   public void ingresarAlumno(Alumno alumno)
   {
     this.alumno[this.contador++]=alumno;

   }
  public Alumno[] mostrarAlumno()
  {
      return alumno;
  }
  
}
