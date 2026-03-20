package entregas.riveraOscar.src.Fraccion;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador){

        this.numerador = numerador;
        this.denominador = denominador;
    }
    public Fraccion(int numero){
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
    
    public Fraccion clonar(){
        return new Fraccion(this);
    }
    
    public void sumar(Fraccion fraccion){
        numerador = (this.numerador * fraccion.denominador) + (this.denominador * fraccion.numerador);
        denominador = this.denominador * fraccion.denominador;
    }
    public void restar(Fraccion fraccion){
        numerador = (this.numerador * fraccion.denominador) - (this.denominador * fraccion.numerador);
        denominador = this.denominador * fraccion.denominador;
    }
    public void multiplicar(Fraccion fraccion){
        numerador *= fraccion.numerador;
        denominador *= fraccion.denominador;
    }
    public void dividir(Fraccion fraccion){
        numerador *= fraccion.denominador;
        denominador *= fraccion.numerador;
    }
    public void potenciar(int exponente){
        numerador = (int) Math.pow(this.numerador, exponente);
        denominador = (int) Math.pow(this.denominador, exponente);
    }

    public boolean esMayor(Fraccion fraccion){
        return (numerador * fraccion.denominador) > (denominador * fraccion.numerador);
    }
    public boolean esMenor(Fraccion fraccion){
        return (numerador * fraccion.denominador) < (denominador * fraccion.numerador);
    }

    public boolean equals(Fraccion fraccion){
        return !this.esMayor(fraccion) && !this.esMenor(fraccion);
    }

    public void mostrar(){
        System.out.println(this.numerador + " / " + this.denominador);
    }
    public void invertir(){
        int temporal = numerador;
        this.numerador = this.denominador;
        this.denominador = temporal;
    }
    public void oponer(){
        this.numerador = -this.numerador;
    }

    public void simplificar(){

    }
    public void calcularMCD(){
        
    }
}