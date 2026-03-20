package entregas.riveraOscar.src.Fraccion;

public class Cliente {
    public static void main(String[] args){

        Fraccion f1 = new Fraccion(1, 2);
        Fraccion f2 = new Fraccion(6, 8);

        f1.mostrar();
        f1.sumar(f2);
        f1.mostrar();

        Fraccion f3 = new Fraccion(5);
        System.out.println("¿Es f3 mayor a f2? " + f3.esMayor(f2));
        System.out.println("¿Es f3 igual a f1? " + f3.equals(f1));
    }
}