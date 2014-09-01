package javaproyect1;


/**
 *
 * @author admin
 */
public class ciudad {
    private Double ide; // identidad
    private int x;
    private int y;
    
    
    public ciudad(double i, int x,int y){
        this.ide = i;
        this.x = x;
        this.y = y;
        
    }

    public Double getIde() {
        return ide;
    }

    public void setIde(Double ide) {
        this.ide = ide;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
    		return "C:" + this.ide + " (" + this.x +","+ this.y +")";
    	
    }
    
    public double distancia(ciudad a){
        return Math.sqrt(Math.pow(this.x-a.getX(),2)+Math.pow(this.y - a.getY(),2));
    }
    
    
}

