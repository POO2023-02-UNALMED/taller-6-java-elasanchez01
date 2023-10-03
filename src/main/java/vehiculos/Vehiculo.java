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

  public Vehiculo(){
    Vehiculo.cantidadVehiculos++;
  }
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

  public static int getCantidadVehiculos(){
    return cantidadVehiculos;
  }

  public static void setCantidadVehiculos(int num){
    cantidadVehiculos=num;
  }

  public static String vehiculosPorTipo(){
    return "Automoviles: "+ Automovil.getCantidadAutomoviles() + "\nCamionetas: " Camioneta.getCantidadCamionetas() + "\nCamiones: " + Camion.getCantidadCamiones();
  }

  public void setPlaca(String placa) {
    this.placa=placa
  }

  public String getPlaca(){
    return this.placa;
  }

  public void setPuertas(int num) {
    this.puertas=num
  }

  public String getPuertas(){
    return this.puertas;
  }

  public void setVelocidadMaxima(int num){
    this.velocidadMaxima=num;
  }

  public int getVelocidadMaxima(){
    return this.velocidadMaxima;
  }

  public void setNombre(String nombre){
    this.nombre=nombre;
  }

  public String getNombre(){
    return this.nombre;
  }

  public void setPrecio (int num){
    this.precio=num;
  }

  public int getPrecio(){
    return this.precio;
  }
  
  public void setTraccion(String traccion){
    this.traccion=traccikon;
  }

  public String getTraccion(){
    return this.traccion;
  }

  public void setFabricante(Fabricante fabricante){
    this.fabricante=fabricante;
  }

  public Fabricante getFabricante() {
    return this.fabricante;
  }
  
}
