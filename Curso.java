package tarea14;

public class Curso 
{
    private String nombre;
    private Docente docente[];
    private int contador;

    public Curso(String nombre)
    {
      this.nombre=nombre;
      this.docente=new Docente[2];
      this.contador=0;

    }
    public void ingresarnombre(String nombre)
    {
      this.nombre=nombre;
    }
    public String mostrarNombre()
    {
       return nombre;
    }
    public void ingresarDocente(Docente docente)
    {
      this.docente[this.contador]=docente;
      this.contador++;
    }
   public Docente[]mostrarDocente()
   {
     return docente;
   }
}