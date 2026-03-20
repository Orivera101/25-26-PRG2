package entregas.riveraOscar.src.Fraccion;

public class Cliente {
    public static void main(String[] args){
        Fraccion f1 = new Fraccion(1, 2);
        Fraccion f2 = new Fraccion(6, 8);

        f1.mostrar();
        f1.sumar(f2);
        f1.mostrar();
    }
}