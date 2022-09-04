import java.util.List;

public class LtsEstudiantes {

    private List<Estudiantes> estudiantes;
    private String colegio;

    public LtsEstudiantes() {
    }

    public List<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    @Override
    public String toString() {
        return "LtsEstudiantes{" +
                "estudiantes=" + estudiantes +
                ", colegio='" + colegio + '\'' +
                '}';
    }
}
