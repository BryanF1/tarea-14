package tarea14;

public class Main{
    public static void main (String args[]) 
    {
        Docente docente=new Docente
        ("Evans", "Ramirez", 98912734, 1991,2022);
        docente.ingresarEspecialidad 
        ("matematico");
        Docente docente2=new Docente
        (" Juan", "villa Lobo  ", 9192746 ,  1990, 2022);
        docente2.ingresarEspecialidad
        ("Fisica");
        
        Curso cursoHistoria = new Curso("Historia");
        cursoHistoria.ingresarDocente(docente);
        cursoHistoria.ingresarDocente(docente2);
        
        Curso cursoAlgebra = new Curso("Algebra");
        cursoAlgebra.ingresarDocente(docente);
        cursoAlgebra.ingresarDocente(docente2);
        
        Alumno alumno=new Alumno
        ("Bryan", "Rojas", 9612834, 1999,2022);
        alumno.ingresarCurso(cursoHistoria);
        alumno.ingresarCurso(cursoAlgebra);
        alumno.ingresarCodigo(123894698);
        
        Matricula matricula = new Matricula(123435);
        matricula.ingresarAlumno(alumno);
        for (Alumno a: matricula.mostrarAlumno()) 
        {
            System.out.println();
            System.out.println(alumno.toString());
            System.out.println("codigo De Matricula: "+matricula.mostrarCodigo());
            System.out.println("edad: "+alumno.calcularEdad());
            System.out.println("Codigo:"+alumno.mostrarCodigo());
            for (Curso c : a.mostrarCurso()) {
                System.out.println();
                System.out.println("Curso: " + c.mostrarNombre());

               
                    for (Docente d : c.mostrarDocente()) {
                      System.out.println(d.toString());
                      System.out.println("edad: " +d.calcularEdad());
                      System.out.println("especialidad:"+ d.mostrarEspecialidad());
                  }
              }
        }   
    }
}
