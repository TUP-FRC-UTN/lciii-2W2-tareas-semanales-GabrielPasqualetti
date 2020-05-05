
package ejercicio2arreglo;


public class Cliente {
    
    private int numeroCliente;
    private String nombreCliente;
    private int antiguedadCliente;
    private String nobmreMascota;
    private int edadMascota;

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getAntiguedadCliente() {
        return antiguedadCliente;
    }

    public void setAntiguedadCliente(int antiguedadCliente) {
        this.antiguedadCliente = antiguedadCliente;
    }

    public String getNobmreMascota() {
        return nobmreMascota;
    }

    public void setNobmreMascota(String nobmreMascota) {
        this.nobmreMascota = nobmreMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public Cliente(int numeroCliente, String nombreCliente, int antiguedadCliente, String nobmreMascota, int edadMascota) {
        this.numeroCliente = numeroCliente;
        this.nombreCliente = nombreCliente;
        this.antiguedadCliente = antiguedadCliente;
        this.nobmreMascota = nobmreMascota;
        this.edadMascota = edadMascota;
    }
    
    public Cliente(){
        numeroCliente = 0;
        nombreCliente = "";
        antiguedadCliente = 0;
        nobmreMascota = "";
        edadMascota = 0;
    }
}
