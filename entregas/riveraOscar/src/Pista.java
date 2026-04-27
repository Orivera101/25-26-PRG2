public class Pista {
    private int largoPista = 44;
    private int distanciaMeta = 40;
    private String dibujoCaballo = ";-;'";
    private Console console;

    public Pista() {
        this.console = new Console();
    }

    public void mostrarPista(Caballo[] caballos) {
        for (int i = 0; i < largoPista; i++) {
            console.write("-");
        }
        console.writeln("");

        for (int i = 0; i < caballos.length; i++) {
            for (int j = 0; j < caballos[i].obtenerPosicion(); j++) {
                console.write(" ");
            }
            console.writeln(dibujoCaballo);
        }

        for (int i = 0; i < largoPista; i++) {
            console.write("-");
        }
        console.writeln("");
    }

    public boolean existeGanador(Caballo[] caballos) {
        for (Caballo caballo : caballos) {
            if (caballo.obtenerPosicion() >= distanciaMeta) {
                return true;
            }
        }
        return false;
    }

    public boolean existeEmpate(Caballo[] caballos) {
        int contadorGanadores = 0;
        for (Caballo caballo : caballos) {
            if (caballo.obtenerPosicion() >= distanciaMeta) {
                contadorGanadores++;
            }
        }
        return contadorGanadores > 1;
    }
}