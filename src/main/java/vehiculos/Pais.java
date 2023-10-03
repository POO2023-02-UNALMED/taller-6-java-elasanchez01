package vehiculos;

import java.util.List;
import java.util.ArrayList;

public class Pais {
  private String nombre;
  private int cantidadVendidos=0;

  private static ArrayList<Pais> listaPaises= new ArrayList<Pais>(); 

  public Pais(String nombre){
    this.nombre=nombre;
    Pais.listaPaises.add(this);
    }

  public static Pais paisMasVendedor(){
  	Pais mayor= listaPaises.get(0);
	for (Pais pais:listaPaises){
		////Continuacion codigo githubdesktop
  }

  public void setNombre(String nombre) {
    this.nombre=nombre;
  }
  
  public String getNombre() {
    return this.nombre;
  }
	
	public void setCantidadVendidos(int num) {
    this.cantidadVendidos=num;
  }
  
	public int getCantidadVendidos() {
    return this.cantidadVendidos;
  }

}
