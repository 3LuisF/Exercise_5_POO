package ejercicio_5_instruc;
import java.lang.Math;
public class Ejercicio_5_instruc {
    public static void main(String[] args) {
    double Suma = 0;
    double X = 20;
    Suma = Suma+ X;
    double Y = 40;
    X =  X + Math.pow(Y,2);
    Suma = Suma+(X/Y);
    System.out.println("EL VALOR DE LA SUMA ES: "+Suma);
    }
    
}
