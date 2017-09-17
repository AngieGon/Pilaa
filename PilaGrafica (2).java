import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void Menu(){
        System.out.println("\n\n\t\t\t=========Menú Manejo Pila=============");
        System.out.println("\t\t\t=                                    =");
        System.out.println("\t\t\t= 1- Insertar elemento               =");
        System.out.println("\t\t\t= 2- Eliminar elemento               =");
        System.out.println("\t\t\t= 3- Buscar elemento                 =");
        System.out.println("\t\t\t= 4- Imprimir pila                   =");
        System.out.println("\t\t\t= 5- Imprimir primer elemento        =");
        System.out.println("\t\t\t= 6- Salir                           =");
        System.out.println("\t\t\t======================================");
        System.out.print("\t\t\tIngrese Opcion: ");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        NodoPila Pila=null;
        Scanner teclado=new Scanner(System.in);
        int opcion;
        String dato;
        
        do{
            Menu();
            opcion=teclado.nextInt();
            switch(opcion){
			case 1: System.out.println("Escriba el dato a guardar en la pila: ");
                                dato=teclado.nextLine();
                                dato=teclado.nextLine();
                                Pila=NodoPila.insertarPila(Pila, dato);
			        break;
			case 2: Pila=NodoPila.eliminarPila(Pila);
			        break;
                                
                                
			case 3: System.out.println("Escriba el dato a Buscar en la pila: ");
                                dato=teclado.nextLine();
                                dato=teclado.nextLine();
                                NodoPila.buscarPila(Pila, dato);
			        break;
                                
                            
			case 4:NodoPila.imprimirPila(Pila);
			        break;
                                
                                
			case 5: NodoPila.imprimirprimerelementodelaPila(Pila);
			        break;
                                
                                
                        case 6: 
			        break;
                            }
        }while(opcion!=6);
        
        
    
    }
    
}