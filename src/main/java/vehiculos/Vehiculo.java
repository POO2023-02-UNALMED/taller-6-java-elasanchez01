package vehiculos;

public class Vehiculo {
  private String placa;
  private int puertas;
  private int velocidadMaxima;
  private String nombre;
  private int precio;
  private int peso;
  private String traccion;
  private Fabricante fabricante;
  private static int CantidadVehiculos = 0;

  public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
    this.placa = placa;
    this.puertas=puertas;
    this.velocidadMaxima=velocidadMaxima;
    this.nombre=nombre;
    this.precio=precio;
    this.peso=peso;
    this.traccion=traccion;
    this.fabricante=fabricante;
    this.fabricante.fabricar();
    Vehiculo.cantidadVehiculos++;
      		   	  
  }
}
