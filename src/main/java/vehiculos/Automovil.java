package vehiculos;

public class Automovil extends Vehiculo {
  private int puestos;
  private static int cantidadAutomoviles = 0

  public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
    super(placa, 4, 100, nombre, precio, "FWD", fabricante);
    this.puestos = puestos;
    cantidadAutomoviles++;
  }
  
}
