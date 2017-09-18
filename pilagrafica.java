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
public class MenuPrincipal extends javax.swing.JFrame {

    static Object TXTimprimirprimerelemeto;

    /** Creates new form MenuPrincipal */
    public MenuPrincipal() {
        initComponents();
    }
    
    NodoPila Pila = null;
    private void TXTimprimirActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void BTNinsertarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        if(TXTinsertar.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Ingrese un Dato");
        }else{
        String dato = TXTinsertar.getText();
        Pila = NodoPila.insertarPila(Pila, dato);
        TXTinsertar.setText("");           
        JOptionPane.showMessageDialog(null,"Elemento ingresado");
        }
        
    }                                           

    private void BNTbuscarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(TXTbuscar.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"Ingrese Dato a Buscar");
        }else{
        String dato = TXTbuscar.getText();
        NodoPila.buscarPila(Pila, dato);
        TXTbuscar.setText("");  
        
        }

    }                                         

    private void BTNimprimirActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        NodoPila.imprimirPila(Pila);
    }                                           

    private void TXTeliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
       
        Pila=NodoPila.eliminarPila(Pila);
    }                                           

    private void BTNsalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        dispose();
    }                                        

    private void BTNimprimirprimerelementoActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
       
       NodoPila.imprimirprimerelementodelaPila(Pila);
    }    