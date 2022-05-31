package Modelo;

// @author samaelhg

public class EjemploObjeto {
    
    private int x;
    private String y;
    public EjemploObjeto(){
        
    }
    public EjemploObjeto(int x){
        this.x = x;
    }
    
    public EjemploObjeto(String y){
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}
