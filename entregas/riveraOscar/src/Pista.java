public class Pista {
    private int largoPista = 44;
    private int distanciaMeta = 40;
    private String dibujoCaballo = ";-;'";
    private Console console;

    public Pista() {
        this.console = new Console();
    }

    public void mostrarPista(Caballo[] caballos) {
        System.out.println("-".repeat(largoPista));

        for (Caballo caballo : caballos) {
            for (int j = 0; j < caballo.obtenerPosicion(); j++) {
                System.out.print(" ");
            }
            System.out.println(dibujoCaballo);
        }

        System.out.println("-".repeat(largoPista));
        System.out.println();
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