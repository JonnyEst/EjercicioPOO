public class Materias {

    private String matematicas;
    private String español;

    public Materias() {
    }

    public String getMatematicas() {
        return matematicas;
    }
    public void setMatematicas(String matematicas) {
        this.matematicas = matematicas;
    }
    public String getEspañol() {
        return español;
    }
    public void setEspañol(String español) {
        this.español = español;
    }

    @Override
    public String toString() {
        return "Materias{" +
                "matematicas='" + matematicas + '\'' +
                ", español='" + español + '\'' +
                '}';
    }
}
