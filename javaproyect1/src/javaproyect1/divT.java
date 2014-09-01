package javaproyect1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class divT {
	private String listaCiudades;
	private Double listaDistancias; 
	
	public divT(String listaCiudades, Double listaDistancias) {    
	    		this.listaCiudades = listaCiudades;
	    		this.listaDistancias = listaDistancias;

	    		
	    }
	
		@Override
	    public String toString() {
	        return "" + listaCiudades  + " = " + listaDistancias+"\r\n";
	    }


		public Double getDistancias() {
			// TODO Auto-generated method stub
			return listaDistancias;
		}
}
