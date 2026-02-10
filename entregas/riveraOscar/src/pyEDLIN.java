package src;

import java.util.Scanner;

public class pyEDLIN {
    public static void main(String[] args) {
        int lineaActiva = 0;
        String[] lineas = {
            "Bienvenidos al editor EDLIN",
            "Utilice el menu inferior para editar el texto",
            "------",
            "[L] permite definir la línea activa",
            "[E] permite editar la linea activa",
            "[I] permite intercambiar dos lineas",
            "[B] borra el contenido de la linea activa",
            "[D] deshace la última acción realizada",
            "[S] sale del programa",
            ""
        };
        Scanner sc = new Scanner(System.in);

        ImprimirEnConsola(lineaActiva, lineas);
    }

    public static void ImprimirEnConsola(int lineaActiva, String[] lineas) {
        System.out.println("--------------------------------------------------");
        int i = 0;
        do {
        System.out.println(i + ":" + (i == lineaActiva ? "*" : " ") + "| " + lineas[i]);
        i = i + 1;
        } while (i < 10);
        System.out.println("--------------------------------------------------");
        System.out.println("Comandos: [L]inea activa | [E]ditar | [I]ntercambiar | [B]orrar | [D]eshacer | [S]alir");
    }
}