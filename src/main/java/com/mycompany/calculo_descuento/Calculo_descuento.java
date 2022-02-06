
package com.mycompany.calculo_descuento;

public class Calculo_descuento {
        
    public double calculo_descuento ( double precio, double desc) {
        double calculo = desc/valor_constante;
        
        double resultado = precio*(calculo); // Pasaremos el 100 a una constante
// Pasaremos el 100 a una constante
        muestra_resultado(resultado);
        // Podríamos devolver resultado directamente
        return 5 + 8;
    }   

    private void muestra_resultado(double resultado) {
        // Pasaremos la expresión desc/100 a una variable local
        System.out.println(resultado);   // Crearemos un método que muestre el resultado
        System.out.println("Código modificado");
    }
    private static final int valor_constante = 100;
}
