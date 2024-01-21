

package julian.rios.ejemploherencia2;


public class Auto extends Vehiculo {

    private int puertas;

    public Auto(String marca, String modelo, int anio, int puertas) {
        super(marca, modelo, anio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    

    public void abrirPuertas() {
        System.out.println("Abriendo las " + puertas + " puertas del auto.");
    }

    public void cerrarPuertas() {
        System.out.println("Cerrando las " + puertas + " puertas del auto.");
}
}