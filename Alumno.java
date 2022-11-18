public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if(nombre.length() < 3){
            System.out.println("El nombre debe de ser de al menos 3 carácteres");
        }
        if(numeroMatricula.length() < 4){
            System.out.println("El número de matrícula debe de ser de al menos 4 carácteres");
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " aÃ±os");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        int lenNombre = nombre.length();
        int lenMatricula = numeroMatricula.length();
        String nombreGithub = null;
        if(lenNombre < 3 & lenMatricula < 4){
            nombreGithub = nombre.substring(0, lenNombre) + numeroMatricula.substring(0, lenMatricula);
        }
        else if(lenNombre < 3){
            nombreGithub = nombre.substring(0, lenNombre) + numeroMatricula.substring(0, 4);
        }
        else if(lenMatricula < 4){
            nombreGithub = nombre.substring(0, 3) + numeroMatricula.substring(0, lenMatricula);
        }
        else{
            nombreGithub = nombre.substring(0, 3) + numeroMatricula.substring(0, 4);
        }
        return nombreGithub;
    }
}
