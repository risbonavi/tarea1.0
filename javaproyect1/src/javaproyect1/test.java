package javaproyect1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test {
	
	
	public static int menor(int [] num){
        int iMenor = 0;
        for(int i=1;i<num.length;i++){
            if(num[i]<num[iMenor])
                iMenor = i;
        }
        return num[iMenor];
    }
	 public static void main(String[] args){
		  List<Persona> personas = new ArrayList<>(Arrays.asList(
                  new Persona("Oscar", 34, "Alta", "Mexico", "Zacatecas"),
                  new Persona("Oscar", 34, "Alta", "Mexico", "Mexico"),
                  new Persona("Aaron", 23, "Alta", "España", "Cordoba"),
                  new Persona("Pepe", 22, "Alta", "Albania", "Tirana"),
                  new Persona("Rodri", 23, "Alta", "España", "Cordoba"),
                  new Persona("Juan", 23, "Baja", "España", "Vitoria"),
                  new Persona("Rodri", 23, "Alta", "España", "Jaen")
              ));
  Comparator<Persona> comparador =  new Comparator<Persona>() {
      public int compare( Persona a, Persona b ) {
    	  int resultado = Integer.compare( a.getedad(), b.getedad());
          if ( resultado != 0 ) { return resultado; }
          
          //resultado = comparaPrioridad( a.prioridad(), b.prioridad() );
          //if ( resultado != 0 ) { return resultado; }
          
          resultado = a.pais().compareTo(b.pais()); 
          if ( resultado != 0 ) { return resultado; }
          
          resultado = a.ciudad().compareTo(b.ciudad()); 
          if ( resultado != 0 ) { return resultado; }
          
          resultado = a.nombre().compareTo(b.nombre());
          return resultado;
      }
  };
  System.out.printf( "Antes: %s%n", personas );
  Collections.sort(personas,  comparador );
  System.out.printf( "Despues: %s%n",  personas );
}
}
class Persona {
private String nombre;
private int edad;
private String prioridad;
private String pais;
private String ciudad;
public Persona(String nombre, int edad, String prioridad, String pais, String ciudad ) {
  this.nombre = nombre;
  this.edad = edad;
  this.prioridad = prioridad;
  this.pais = pais;
  this.ciudad = ciudad;
}
public String toString() {
  return String.format("%s (%d). %s. Ubicación: %s, %s%n", nombre, edad, prioridad,  ciudad, pais);
}
//en realidad deberían ser : getEdad(), getNombre() etc. 
public int getedad() { return edad; }
public String nombre() { return nombre; }
public String pais() { return pais; }
public String ciudad() { return ciudad; }
}