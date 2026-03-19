package vistas.fraccion; 

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador){

        this.numerador = numerador;
        this.denominador = denominador;
    }
    public Fraccion(double numero){
        this.numerador = numero;
        this.denominador = 1;
    }
    public Fraccion(Fraccion fraccion){
        this.numerador = fraccion.numerador;
        this.denominador = fraccion.denominador;
    }
    public Fraccion(){
        this.numerador = 0;
        this.denominador = 1;
    }
    
    public Fraccion clonar(){}
    
    public void sumar(Fraccion fraccion){}
    public void restar(Fraccion fraccion){}
    public void multiplicar(Fraccion fraccion){}
    public void dividir(Fraccion fraccion){}
    public void potenciar(int exponente){}

    public boolean esMayor(Fraccion fraccion){}
    public boolean esMenor(Fraccion fraccion){}

    public boolean equals(Fraccion fraccion){}

    public void mostrar(){}
    public void invertir(){}
    public void oponer(){}
}