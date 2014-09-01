package javaproyect1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.io.*;

public class init {
	
	static void escTxt(String nombre, String texto) throws IOException
	{
		String txtexiste = "";
		File f = new File("c://javaProyect/");
		//crea la ruta si no existe
		f.mkdirs();
		
		File[] ficheros = f.listFiles();
		for (int i = 0; i < ficheros.length; i++) {
			txtexiste="c://javaProyect/"+ ficheros[i].getName();
		}
		if(txtexiste.equals("")){
			File f_txt = new File("c://javaProyect/"+nombre+".txt");
		}
			FileWriter	wa = new FileWriter("c://javaProyect/"+nombre+".txt",true);
			BufferedWriter bwa = new BufferedWriter(wa);
			PrintWriter wra = new PrintWriter(bwa);	
			
			wra.write("");//escribimos en el archivo inicio
			wra.append(texto+"\r\n");//escribimos en el archivo despues
			
			wra.close();
			bwa.close();
	}
	
	
    public static void main(String[] args){
        System.out.println("Iniciando..");
        double time_start, time_end;
        time_start = System.currentTimeMillis();
        
        try {
			escTxt("Solucion","Iniciando Proceso!!"+"\r\n");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        //Random rnd = new Random(111);
        List<ciudad> lista = new ArrayList<ciudad>();
        
        //for (int i=0; i < 10; i++)
         /*
        lista.add(new ciudad(1,3600,2300));
        lista.add(new ciudad(2,3100,3300));
        lista.add(new ciudad(3,4700,5750));
        lista.add(new ciudad(4,5400,5750));
        lista.add(new ciudad(5,5608,7103));
        lista.add(new ciudad(6,4493,7102));
        lista.add(new ciudad(7,3600,6950));
        lista.add(new ciudad(8,3100,7250));
        lista.add(new ciudad(9,4700,8450));
        lista.add(new ciudad(10,5400,8450));
        lista.add(new ciudad(11,5610,10053));
        lista.add(new ciudad(12,4492,10052));
        lista.add(new ciudad(13,3600,10800));
        lista.add(new ciudad(14,3100,10950));
        lista.add(new ciudad(15,4700,11650));
        lista.add(new ciudad(16,5400,11650));
        lista.add(new ciudad(17,6650,10800));
        lista.add(new ciudad(18,7300,10950));
        lista.add(new ciudad(19,7300,7250));
        lista.add(new ciudad(20,6650,6950));
        lista.add(new ciudad(21,7300,3300));
        lista.add(new ciudad(22,6650,2300));
        lista.add(new ciudad(23,5400,1600));
        lista.add(new ciudad(24,8350,2300));
        lista.add(new ciudad(25,7850,3300));
        lista.add(new ciudad(26,9450,570));
        lista.add(new ciudad(27,10150,5750));
        lista.add(new ciudad(28,10358,7103));
        lista.add(new ciudad(29,9243,7102));
        lista.add(new ciudad(30,8350,6950));
        lista.add(new ciudad(31,7850,7250));
        lista.add(new ciudad(32,9450,8450));
        lista.add(new ciudad(33,10150,8450));
        lista.add(new ciudad(34,10360,10053));
        lista.add(new ciudad(35,9242,10052));
        lista.add(new ciudad(36,8350,10800));
        lista.add(new ciudad(37,7850,10950));
        lista.add(new ciudad(38,9450,11650));
        lista.add(new ciudad(39,10150,1650));
        lista.add(new ciudad(40,11400,10800));
        lista.add(new ciudad(41,12050,10950));
        lista.add(new ciudad(42,12050,7250));
        lista.add(new ciudad(43,11400,6950));
        lista.add(new ciudad(44,12050,3300));
        lista.add(new ciudad(45,11400,2300));
        lista.add(new ciudad(46,10150,1600));
        lista.add(new ciudad(47,13100,2300));
        lista.add(new ciudad(48,12600,3300));
        lista.add(new ciudad(49,14200,5750));
        lista.add(new ciudad(50,14900,5750));
        lista.add(new ciudad(51,15108,7103));
        lista.add(new ciudad(52,13993,7102));
        lista.add(new ciudad(53,13100,6950));
        lista.add(new ciudad(54,12600,7250));
        lista.add(new ciudad(55,14200,8450));
		lista.add(new ciudad(56,14900,8450));
        lista.add(new ciudad(57,15110,10053));
        lista.add(new ciudad(58,13992,10052));
        lista.add(new ciudad(59,13100,10800));
        lista.add(new ciudad(60,12600,10950));
        lista.add(new ciudad(61,14200,11650));
        lista.add(new ciudad(62,14900,11650));
        lista.add(new ciudad(63,16150,10800));
        lista.add(new ciudad(64,16800,10950));
        lista.add(new ciudad(65,16800,7250));
        lista.add(new ciudad(66,16150,6950));
        lista.add(new ciudad(67,16800,3300));
        lista.add(new ciudad(68,16150,2300));
        lista.add(new ciudad(69,14900,1600));
        lista.add(new ciudad(70,19800,800));
        lista.add(new ciudad(71,19800,10000));
        lista.add(new ciudad(72,19800,11900));
        lista.add(new ciudad(73,19800,12200));
        lista.add(new ciudad(74,200,12200));
        lista.add(new ciudad(75,200,1100));
        lista.add(new ciudad(76,200,800));
            //System.out.println("Mostrando la lista: "+lista);
        */
        lista.add(new ciudad(1,3600,2300));
        lista.add(new ciudad(2,3100,3300));
        lista.add(new ciudad(3,4700,5750));
        lista.add(new ciudad(4,5400,5750));
        lista.add(new ciudad(5,5608,7103));
        lista.add(new ciudad(6,4493,7102));
        lista.add(new ciudad(7,3600,6950));
        lista.add(new ciudad(8,3100,7250));
        lista.add(new ciudad(9,4700,8450));
        lista.add(new ciudad(10,5400,8450));
        lista.add(new ciudad(11,5610,10053));
        lista.add(new ciudad(12,4492,10052));
        lista.add(new ciudad(13,3600,10800));
        lista.add(new ciudad(14,3100,10950));
        lista.add(new ciudad(15,4700,11650));
        lista.add(new ciudad(16,5400,11650));
        lista.add(new ciudad(17,6650,10800));
        lista.add(new ciudad(18,7300,10950));
        lista.add(new ciudad(19,7300,7250));
        lista.add(new ciudad(20,6650,6950));
        lista.add(new ciudad(21,7300,3300));
        lista.add(new ciudad(22,6650,2300));
        lista.add(new ciudad(23,5400,1600));
        lista.add(new ciudad(24,8350,2300));
        lista.add(new ciudad(25,7850,3300));
        lista.add(new ciudad(26,9450,5750));
        lista.add(new ciudad(27,10150,5750));
        lista.add(new ciudad(28,10358,7103));
        lista.add(new ciudad(29,9243,7102));
        lista.add(new ciudad(30,8350,6950));
        lista.add(new ciudad(31,7850,7250));
        lista.add(new ciudad(32,9450,8450));
        lista.add(new ciudad(33,10150,8450));
        lista.add(new ciudad(34,10360,10053));
        lista.add(new ciudad(35,9242,10052));
        lista.add(new ciudad(36,8350,10800));
        lista.add(new ciudad(37,7850,10950));
        lista.add(new ciudad(38,9450,11650));
        lista.add(new ciudad(39,10150,11650));
        lista.add(new ciudad(40,11400,10800));
        lista.add(new ciudad(41,12050,10950));
        lista.add(new ciudad(42,12050,7250));
        lista.add(new ciudad(43,11400,6950));
        lista.add(new ciudad(44,12050,3300));
        lista.add(new ciudad(45,11400,2300));
        lista.add(new ciudad(46,10150,1600));
        lista.add(new ciudad(47,13100,2300));
        lista.add(new ciudad(48,12600,3300));
        lista.add(new ciudad(49,14200,5750));
        lista.add(new ciudad(50,14900,5750));
        lista.add(new ciudad(51,15108,7103));
        lista.add(new ciudad(52,13993,7102));
        lista.add(new ciudad(53,13100,6950));
        lista.add(new ciudad(54,12600,7250));
        lista.add(new ciudad(55,14200,8450));
        lista.add(new ciudad(56,14900,8450));
        lista.add(new ciudad(57,15110,10053));
        lista.add(new ciudad(58,13992,10052));
        lista.add(new ciudad(59,13100,10800));
        lista.add(new ciudad(60,12600,10950));
        lista.add(new ciudad(61,14200,11650));
        lista.add(new ciudad(62,14900,11650));
        lista.add(new ciudad(63,16150,10800));
        lista.add(new ciudad(64,16800,10950));
        lista.add(new ciudad(65,16800,7250));
        lista.add(new ciudad(66,16150,6950));
        lista.add(new ciudad(67,16800,3300));
        lista.add(new ciudad(68,16150,2300));
        lista.add(new ciudad(69,14900,1600));
        lista.add(new ciudad(70,19800,800));
        lista.add(new ciudad(71,19800,1000));
        lista.add(new ciudad(72,19800,11900));
        lista.add(new ciudad(73,19800,12200));
        lista.add(new ciudad(74,200,12200));
        lista.add(new ciudad(75,200,1100));
        lista.add(new ciudad(76,200,800));
        
        PermutacionesIterator iter = new PermutacionesIterator(lista);
        double id = 0;
        
       List<divT> listaT = new ArrayList<divT>();
       // double menor=0;
        double mayor=99999999999999999.9999999;
        String []x = null;
        while (iter.hasNext()){
            TspSol sol = new TspSol(id, iter.next());
            x= sol.toString().split(" = ");
           // System.out.println("valores: "+Double.parseDouble(x[1].trim()));
            
            if (Double.parseDouble(x[1].trim()) <= mayor){
            	mayor=Double.parseDouble(x[1].trim());
            	System.out.println("tour más óptimo temporal: "+mayor+"\r\n"+x[0]);	
            	//listaT.add( new divT(x[0],Double.parseDouble(x[1].trim())) );
            	try {
        			escTxt("Solucion","tour más óptimo temporal: "+mayor+"\r\n"+x[0]);
        		} catch (IOException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
            }
           
            id++;
            
        }
        try {
			escTxt("Solucion","tour más óptimo: "+mayor+"\r\n"+x[0]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        time_end = System.currentTimeMillis();
        
        
        /*
        Comparator<divT> comparador =  new Comparator<divT>() {
  	      public int compare( divT a, divT b ) {
  	          int resultado = Integer.compare( (int) Math.floor( a.getDistancias()), (int) Math.floor(b.getDistancias()));
  	          if ( resultado != 0 ) { return resultado; }
			return resultado;
  	    
  	      	}
  	      };
  	     */
       System.out.println("La Cantidad de Permutaciones, para #"+lista.size()+" ciudades, son: "+id);
       
       
      //Collections.sort(listaT,comparador);
      //System.out.println("lista ordenada con los óptimos Temporales: "+"\r\n"+listaT);
       /*
       try {
    	
		escTxt("Solucion","Las Soluciones Odenadas desde la Ruta más Óptima hasta las más Larga"+"\r\n"+listaT);
	   } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
      */
       //time_end2 = System.currentTimeMillis();
       
       try {
      		escTxt( "Solucion","La Cantidad de Permutaciones, para #"+lista.size()+" ciudades, son: "+id +"\r\n"+"\r\n"+
      				"El tiempo que tardaron las permutaciones es: "+( time_end - time_start )/1000 +" Segundos"+"\r\n");
      	   } catch (IOException e) {
      		// TODO Auto-generated catch block
      		e.printStackTrace();
      	   }
       System.out.println("El tiempo que tardaron las permutaciones es "+ ( time_end - time_start )/1000 +" Segundos");
       System.out.println("..Fin"); 
        
    }
}
