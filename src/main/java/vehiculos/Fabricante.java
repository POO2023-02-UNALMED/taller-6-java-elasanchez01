package vehiculos;
import java.util.List;
import java.util.ArrayList;

public class Fabricante {
  private String nombre;
  private Pais pais;
  private int cantidadFrabricados=0;

  public Fabricante(String nombre, Pais pais){
    this.nombre = nombre;
    this,pais = pais;
  }

  public void fabricar() {
    this.cantidadFabricados++;
    this.pais.setCantidadVendidos(this.pais.getCantidadVendidos()+1);
  }
}
