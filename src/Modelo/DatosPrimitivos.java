package Modelo;

// @author samaelhg

import org.github.jamm.MemoryMeter;

public class DatosPrimitivos {
    public DatosPrimitivos(){}
    
    public void mostrarDatosPrimitivos(MemoryMeter a){
        //STRING
        String dato0 = "";
        System.out.println("String vacio: "+a.measureDeep(dato0)+" bits");
        dato0 = "ABC";
        System.out.println("String lleno: "+a.measureDeep(dato0)+" bits");
        //BYTE
        byte dato1 = 0;
        System.out.println("byte vacio: "+a.measureDeep(dato1)+" bits");
        dato1 = 2;
        System.out.println("byte lleno: "+a.measureDeep(dato1)+" bits");
        //SHORT
        short dato2 = 0;
        System.out.println("short vacio: "+a.measureDeep(dato2)+" bits");
        dato2 = 3;
        System.out.println("short lleno: "+a.measureDeep(dato2)+" bits");
        //INT
        int dato3 = 0;
        System.out.println("int vacio: "+a.measureDeep(dato3)+" bits");
        dato3 = 50;
        System.out.println("int lleno: "+a.measureDeep(dato3)+" bits");
        //LONG
        long dato4 = 0;
        System.out.println("long vacio : "+a.measureDeep(dato4)+" bits");
        dato4 = 236;
        System.out.println("long lleno : "+a.measureDeep(dato4)+" bits");
        //FLOAT
        float dato5 = 0;
        System.out.println("float vacio: "+a.measureDeep(dato5)+" bits");
        dato5 = 11;
        System.out.println("float lleno: "+a.measureDeep(dato5)+" bits");
        //DOUBLE
        double dato6 = 0;
        System.out.println("double vacio: "+a.measureDeep(dato6)+" bits");
        dato6 = 33;
        System.out.println("double lleno: "+a.measureDeep(dato6)+" bits");
        //BOOLEAN
        boolean dato7 = false;
        System.out.println("boolean vacio: "+a.measureDeep(dato7)+" bits");
        dato7 = true && false || true;
        System.out.println("boolean lleno: "+a.measureDeep(dato7)+" bits");
        char dato8 = 0;
        System.out.println("char vacio: "+a.measureDeep(dato8)+" bits");
        dato8 = 'A';
        System.out.println("char lleno: "+a.measureDeep(dato8)+" bits");
    }
}
