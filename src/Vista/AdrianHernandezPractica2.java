package Vista;

//@author samaelhg
import Controlador.ListaEnlazada;
import Exception.PosicionException;
import Modelo.Arreglos;
import Modelo.DatosPrimitivos;
import Modelo.EjemploObjeto;
import java.util.ArrayList;
import java.util.List;
import org.github.jamm.MemoryMeter;

public class AdrianHernandezPractica2 {

    public static void main(String[] args) throws PosicionException {
        MemoryMeter a = MemoryMeter.builder().build();
        //DATOS PRIMITIVOS
        System.out.println("==========================================");
        System.out.println("=============DATOS PRIMITIVOS=============");
        System.out.println("==========================================");
        DatosPrimitivos datosPrimitivos = new DatosPrimitivos();
        datosPrimitivos.mostrarDatosPrimitivos(a);
        System.out.println("==========================================");
        System.out.println("=================ARREGLOS=================");
        //ARREGLOS
        Arreglos arreglos = new Arreglos();
        System.out.println("==========================================ARREGLO TIPO STRING================");
        arreglos.mostrarArregloString(a);
        System.out.println("==========================================ARREGLO TIPO INT===================");
        arreglos.mostrarArregloInt(a);
        System.out.println("==========================================ARREGLO TIPO DOUBLE================");
        arreglos.mostrarArregloDouble(a);
        System.out.println("==========================================ARREGLO TIPO CHAR==================");
        arreglos.mostrarArregloChar(a);
        System.out.println("==========================================ARREGLO TIPO BOOLEAN===============");
        arreglos.mostrarArregloBoolean(a);
        System.out.println("==========================================");
        System.out.println("=================LISTAS=================");
        //LISTA ENLAZADA
        System.out.println("==========================================LISTA ENLAZADA===============");
        mostrarListaEnlazada(a);
        //LIST
        System.out.println("==========================================LISTA===============");
        mostrarLista(a);

    }
    public static void mostrarListaEnlazada(MemoryMeter a) throws PosicionException{
        ListaEnlazada<EjemploObjeto> listaObjeto = new ListaEnlazada<>();
        //VACIO
        System.out.println("Lista Enlazada con tamaño de " + listaObjeto.getSize() + " vacio ocupa una memoria de: " + a.measureDeep(listaObjeto)+" bits");
        
        //LLENANDO
        for (int i = 0; i < 25; i++) {
            switch (listaObjeto.getSize()) {
                case 10:
                    listaObjeto.insertarCabecera(new EjemploObjeto(25));
                    System.out.println("Lista Enlazada con tamaño de " + listaObjeto.getSize() + " en la posicion "+i+" ocupa una memoria de: " + a.measureDeep(listaObjeto.obtenerDato(i))+" bits");
                    break;
                case 20:
                    listaObjeto.insertarCabecera(new EjemploObjeto("Hola como estas"));
                    System.out.println("Lista Enlazada con tamaño de " + listaObjeto.getSize() + " en la posicion "+i+" ocupa una memoria de: " + a.measureDeep(listaObjeto.obtenerDato(i))+" bits");
                    break;
                default:
                    listaObjeto.insertarCabecera(new EjemploObjeto());
                    System.out.println("Lista Enlazada con tamaño de " + listaObjeto.getSize() + " en la posicion "+i+" ocupa una memoria de: " + a.measureDeep(listaObjeto.obtenerDato(i))+" bits");
                    break;
            }
        }
        //LLENO
        System.out.println("Lista Enlazada con tamaño de " + listaObjeto.getSize()+ " lleno ocupa una memoria de: " + a.measureDeep(listaObjeto)+" bits");
    }
    public static void mostrarLista(MemoryMeter a){
        List <EjemploObjeto> lista = new ArrayList<>();
        //VACIO
        System.out.println("Lista con tamaño de " + lista.size() + " vacio ocupa una memoria de: " + a.measureDeep(lista)+" bits");

        //LLENANDO
        for (int i = 0; i < 25; i++) {
            switch (lista.size()) {
                case 19:
                    lista.add(i, new EjemploObjeto(25));
                    System.out.println("Lista con tamaño de " + lista.size() + " en la posicion "+i+" ocupa una memoria de: " + a.measureDeep(lista.get(i))+" bits");
                    break;
                case 23:
                    lista.add(i, new EjemploObjeto("Adrian Hernández"));
                    System.out.println("Lista con tamaño de " + lista.size() + " en la posicion "+i+" ocupa una memoria de: " + a.measureDeep(lista.get(i))+" bits");
                    break;
                default:
                    lista.add(i, new EjemploObjeto());
                    System.out.println("Lista con tamaño de " + lista.size() + " en la posicion "+i+" ocupa una memoria de: " + a.measureDeep(lista.get(i))+" bits");
                    break;
            }
        }

        //LLENO
        System.out.println("Lista con tamaño de " + lista.size()+ " lleno ocupa una memoria de: " + a.measureDeep(lista)+" bits");
    }
}
