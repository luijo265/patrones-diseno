package pruebasx;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
        TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio

        BigDecimal tope = BigDecimal.ONE;
        BigDecimal diasReclamos = BigDecimal.TEN;

        System.out.println(tope.subtract(diasReclamos));

        TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo); //Mostramos en pantalla el tiempo de ejecución en milisegundos

    }

}
