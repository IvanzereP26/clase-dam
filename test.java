

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class test
{
    private ClaseDam claseDam1;
    private Alumno alumno1;
    private Alumno alumno2;
    private Alumno alumno3;
    private Alumno alumno4;
    private Alumno alumno5;

    /**
     * Default constructor for test class test
     */
    public test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        claseDam1 = new ClaseDam(5);
        alumno1 = new Alumno("Deian", "6582", 20);
        alumno2 = new Alumno("Moises", "5854", 20);
        alumno3 = new Alumno("Iván", "8556", 20);
        alumno4 = new Alumno("Mario", "7751", 20);
        alumno5 = new Alumno("Alejandro", "9887", 20);
        claseDam1.matricularAlumno(alumno1);
        claseDam1.matricularAlumno(alumno2);
        claseDam1.matricularAlumno(alumno3);
        claseDam1.matricularAlumno(alumno4);
        claseDam1.matricularAlumno(alumno5);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
