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
          NodoPila temporal = Pila;

        if (NodoPila.pilaVacia(temporal)) {
            System.out.println("La Cola no contiente elementos..");
            JOptionPane.showMessageDialog(null,"La Cola no contiente elementos.." );
        } else {
            int numeroElemento = 0;
            while (temporal != null) {
                System.out.printf("\nImprimiento elemento Nro. %d: %s \n", numeroElemento, temporal.dato);
                MenuPrincipal.TXTimprimir.setText(MenuPrincipal.TXTimprimir.getText() + temporal.dato + "-");
                numeroElemento++;
                temporal = temporal.enlace;
            }
        }
    }

    
    public static void buscarPila(NodoPila Pila, String datoBusqueda){
       NodoPila temporal = Pila;
        if (NodoPila.pilaVacia(temporal)) {
            System.out.println("La pila no contiente elementos..");
            JOptionPane.showMessageDialog(null,"La pila no contiente elementos.." );
        } else {
            int numeroElemento = 0;
            while (temporal != null) {
                if (datoBusqueda.equals(temporal.dato)) {
                System.out.println("El elemento si se encuentra en la pila.");
                JOptionPane.showMessageDialog(null,"El elemento si se encuentra en la pila." );
                 
                    break;
                }else{
                          System.out.println("El elemento" + datoBusqueda.toUpperCase() +" no se encuentra en la pila."); 
                           JOptionPane.showMessageDialog(null,"El elemento " + datoBusqueda.toUpperCase() + " no se encuentra en la Pila." );
                          break;
                            }
                }
                numeroElemento++;
                temporal = temporal.enlace;
               
            }
        }
    
    
    public static NodoPila insertarPila(NodoPila Pila, String dato){
   NodoPila nodoNuevo = new NodoPila(dato);
        if (NodoPila.pilaVacia(Pila)) {
            Pila = nodoNuevo;
        } else {
            NodoPila anterior = new NodoPila();
            NodoPila temporal = Pila;
            while (temporal != null) {
                anterior = temporal;
                temporal = temporal.enlace;
                
            }
            System.out.println("Elemento ingresado");
            anterior.enlace = nodoNuevo;
        }
        return Pila;
    }
    

    
    public static NodoPila eliminarPila(NodoPila Pila){
         if (NodoPila.pilaVacia(Pila)) {
            System.out.println("La pila no contiente elementos..");
            JOptionPane.showMessageDialog(null,"La pila no contiente elementos.." );
            return Pila;
        }
        System.out.println("Se ha eliminado del tope de la pila");
        JOptionPane.showMessageDialog(null,"Se ha eliminado del tope de la pila" );
        Pila = Pila.enlace;
        return Pila;
    }
    public static boolean pilaVacia(NodoPila Pila){
        if (Pila==null)
            return true;
        return false;
    }
    public static void imprimirprimerelementodelaPila(NodoPila Pila) {
    NodoPila temporal = Pila;
        NodoPila primero = temporal;

        if (NodoPila.pilaVacia(temporal)) {
            System.out.println("La pila no contiente elementos..");
            JOptionPane.showMessageDialog(null,"La pila no contiente elementos.." );
        } else {
            int numeroElemento = 0;
            while (temporal != null) {
                if(temporal == primero){
                System.out.printf("\nImprimiento el inicio elemento Nro. %d: %s \n", numeroElemento, temporal.dato);
                MenuPrincipal.TXTimprimir.setText(temporal.dato);
                }
                numeroElemento++;
                temporal = temporal.enlace;
            }
        }
    }
}
