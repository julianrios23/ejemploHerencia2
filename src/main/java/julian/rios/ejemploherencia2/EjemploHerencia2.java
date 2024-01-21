package julian.rios.ejemploherencia2;

/**
 *
 * @author Julian Rios
 */
public class EjemploHerencia2 {

    public static void main(String[] args) {

        Auto miAuto = new Auto("Toyota", "Corolla", 2023, 4);
        
        miAuto.cerrarPuertas();
        
        miAuto.acelerar();
        
        miAuto.frenar();
        
        miAuto.abrirPuertas();
    }
}
/*
En este ejemplo, la clase Vehiculo es la superclase o clase padre, y la clase Auto es la 
subclase o clase hija. La subclase hereda todos los atributos y métodos públicos o protegidos 
de la superclase, y puede añadir sus propios atributos y métodos.

En este caso, la clase Vehiculo tiene tres atributos: marca, modelo y anio, y dos métodos: 
acelerar y frenar. La clase Auto hereda estos atributos y métodos y añade su propio atributo 
puertas y dos métodos: abrirPuertas y cerrarPuertas.
*/