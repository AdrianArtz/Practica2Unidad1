package Modelo;

// @author samaelhg

import org.github.jamm.MemoryMeter;

public class Arreglos {
    public Arreglos(){}
    
    public void mostrarArregloString(MemoryMeter a){
        String[] arregloString = new String[10];
        //VACIO
        System.out.println("Arreglo de String con tamaño de " + arregloString.length + " vacio ocupa una memoria de: " + a.measureDeep(arregloString)+" bits");

        //LLENANDO
        arregloString[0] = "Hola";
        System.out.println("Arreglo de String con tamaño de " + arregloString.length + " en la posicion "+0+" ocupa una memoria de: " + a.measureDeep(arregloString[0])+" bits");
        arregloString[1] = "";
        System.out.println("Arreglo de String con tamaño de " + arregloString.length + " en la posicion "+1+" ocupa una memoria de: " + a.measureDeep(arregloString[1])+" bits");
        arregloString[4] = "ADRIAN HERNANDEZ";
        System.out.println("Arreglo de String con tamaño de " + arregloString.length + " en la posicion "+4+" ocupa una memoria de: " + a.measureDeep(arregloString[4])+" bits");
        arregloString[9] = "UNL - Universidad Nacional de Loja";
        System.out.println("Arreglo de String con tamaño de " + arregloString.length + " en la posicion "+9+" ocupa una memoria de: " + a.measureDeep(arregloString[9])+" bits");

        //LLENO
        System.out.println("Arreglo de String con tamaño de " + arregloString.length + " lleno ocupa una memoria de: " + a.measureDeep(arregloString)+" bits");
    }
    
    public void mostrarArregloInt(MemoryMeter a){
        int[] arregloEntero = new int[5];
        //VACIO
        System.out.println("Arreglo de int con tamaño de " + arregloEntero.length + " vacio ocupa una memoria de: " + a.measureDeep(arregloEntero)+" bits");
        
        //LLENANDO
        arregloEntero[2] = 7;
        System.out.println("Arreglo de int con tamaño de " + arregloEntero.length + " en la posicion "+2+" ocupa una memoria de: " + a.measureDeep(arregloEntero[2])+" bits");
        arregloEntero[4] = 88;
        System.out.println("Arreglo de int con tamaño de " + arregloEntero.length + " en la posicion "+4+" ocupa una memoria de: " + a.measureDeep(arregloEntero[4])+" bits");
        //LLENO
        System.out.println("Arreglo de int con tamaño de " + arregloEntero.length + " lleno ocupa una memoria de: " + a.measureDeep(arregloEntero)+" bits");
    }
    
    public void mostrarArregloDouble(MemoryMeter a){
        Double[] arreglo= new Double[3];
        //VACIO
        System.out.println("Arreglo de Double con tamaño de " + arreglo.length + " vacio ocupa una memoria de: " + a.measureDeep(arreglo)+" bits");

        //LLENANDO
        arreglo[0] = 25.2;
        System.out.println("Arreglo de Double con tamaño de " + arreglo.length + " en la posicion "+0+" ocupa una memoria de: " + a.measureDeep(arreglo[0])+" bits");
        arreglo[1] = 356.254;
        System.out.println("Arreglo de Double con tamaño de " + arreglo.length + " en la posicion "+1+" ocupa una memoria de: " + a.measureDeep(arreglo[1])+" bits");
        

        //LLENO
        System.out.println("Arreglo de Double con tamaño de " + arreglo.length + " lleno ocupa una memoria de: " + a.measureDeep(arreglo)+" bits");
    }

    public void mostrarArregloChar(MemoryMeter a){
        char[] arreglo= new char[6];
        //VACIO
        System.out.println("Arreglo de Char con tamaño de " + arreglo.length + " vacio ocupa una memoria de: " + a.measureDeep(arreglo)+" bits");

        //LLENANDO
        arreglo[4] = 'E';
        System.out.println("Arreglo de Char con tamaño de " + arreglo.length + " en la posicion "+4+" ocupa una memoria de: " + a.measureDeep(arreglo[4])+" bits");
        arreglo[5] = 'r';
        System.out.println("Arreglo de Char con tamaño de " + arreglo.length + " en la posicion "+5+" ocupa una memoria de: " + a.measureDeep(arreglo[5])+" bits");
        

        //LLENO
        System.out.println("Arreglo de Char con tamaño de " + arreglo.length + " lleno ocupa una memoria de: " + a.measureDeep(arreglo)+" bits");
    }
    
    public void mostrarArregloBoolean(MemoryMeter a){
        boolean[] arreglo= new boolean[2];
        //VACIO
        System.out.println("Arreglo de Boolean con tamaño de " + arreglo.length + " vacio ocupa una memoria de: " + a.measureDeep(arreglo)+" bits");

        //LLENANDO
        arreglo[0] = true;
        System.out.println("Arreglo de Boolean con tamaño de " + arreglo.length + " en la posicion "+0+" ocupa una memoria de: " + a.measureDeep(arreglo[0])+" bits");
        arreglo[1] = false;
        System.out.println("Arreglo de Boolean con tamaño de " + arreglo.length + " en la posicion "+1+" ocupa una memoria de: " + a.measureDeep(arreglo[1])+" bits");
        
        //LLENO
        System.out.println("Arreglo de Boolean con tamaño de " + arreglo.length + " lleno ocupa una memoria de: " + a.measureDeep(arreglo)+" bits");
    }
}
