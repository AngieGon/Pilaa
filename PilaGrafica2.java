import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class NodoPila {

    

   
    String dato;
    NodoPila enlace;
    
    public NodoPila(){
        
        dato="";
        enlace=null;
    }
    
    public NodoPila(String dato){
        this.dato=dato;
        enlace=null;
    }
    
    public static void imprimirPila(NodoPila Pila){
           NodoPila temporal=Pila;
        if(NodoPila.pilaVacia(temporal))
            System.out.println("La pila no contiente elementos..");
        else{
            int numeroElemento=0;
            while(temporal!=null)
            {
                System.out.printf("\nImprimiento elemento Nro. %d: %s \n",numeroElemento,temporal.dato);
                numeroElemento++;
                temporal=temporal.enlace;
            }
        }
    }
    
    public static void buscarPila(NodoPila Pila, String datoBusqueda){
        NodoPila temporal=Pila;
        if(NodoPila.pilaVacia(temporal))
            System.out.println("La pila no contiente elementos..");
        else{
            int numeroElemento=0;
            while(temporal!=null)
            {
                if(datoBusqueda.equals(temporal.dato))
                {
                    System.out.printf("\nEl elemento %s esta en la posición: %d de la pila \n",datoBusqueda,numeroElemento);
                    break;
                }else{
                    System.out.println("Elemento no encontrado");
                    break;
             
                }
                }
                numeroElemento++;
                temporal=temporal.enlace;
                
            }
    }
    
    
    public static NodoPila insertarPila(NodoPila Pila, String dato){
        NodoPila nodoNuevo=new NodoPila(dato);
        if(NodoPila.pilaVacia(Pila))
          Pila=nodoNuevo;
        else
        {
            nodoNuevo.enlace=Pila;
            Pila=nodoNuevo;
        }
        System.out.println("\"Elemento insertado\"");
        return Pila;
    }
    
    public static NodoPila eliminarPila(NodoPila Pila){
        if (NodoPila.pilaVacia(Pila))
        {
            System.out.println("La pila no tiene elementos");
            return Pila;
        }
        System.out.println("Se elimino el elemento " + Pila.dato);
        Pila = Pila.enlace;
        return Pila;
    }

    public static boolean pilaVacia(NodoPila Pila){
        if (Pila==null)
            return true;
        return false;
    }
    public static void imprimirprimerelementodelaPila(NodoPila Pila) {
           NodoPila temporal=Pila;
        if(NodoPila.pilaVacia(temporal))
            System.out.println("La pila no contiente elementos..");
        else{
            int numeroElemento=0;
            while(temporal!=null)
            {
                System.out.printf("\nImprimiento elemento Nro. %d: %s \n",numeroElemento,temporal.dato);
                //numeroElemento++;
                //temporal=temporal.enlace;
            break;
            }
        } 
    }
}