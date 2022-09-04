import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(quemarDatos());

    }

    public static LtsEstudiantes quemarDatos(){

        Materias materias = new Materias();
        materias.setEspañol("3.0");
        materias.setMatematicas("3.5");


        Estudiantes estudiantes = new Estudiantes();
        estudiantes.setEdad(14);
        estudiantes.setNombre("Juanma");
        estudiantes.setMaterias(materias);

        Estudiantes estudiantes2 = new Estudiantes();
        estudiantes2.setEdad(9);
        estudiantes2.setNombre("Nicolle");
        estudiantes2.setMaterias(materias);

        List<Estudiantes> listEstudiantes = new ArrayList<>();
        listEstudiantes.add(estudiantes);
        listEstudiantes.add(estudiantes2);

        LtsEstudiantes ltsEstudiantes = new LtsEstudiantes();
        ltsEstudiantes.setColegio("Rufino");
        ltsEstudiantes.setEstudiantes(listEstudiantes);

        return  ltsEstudiantes;
    }
}
