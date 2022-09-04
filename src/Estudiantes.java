public class Estudiantes {

    private Materias materias;
    private String nombre;
    private Integer edad;

    public Estudiantes() {
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "materias=" + materias +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
