package ejercicio6;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class principal extends javax.swing.JFrame {
Stack pila = new Stack();
    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        pila.add(TXTinsertar.getText().toString());
        TXTinsertar.setText("");
        JOptionPane.showMessageDialog(null, "ELEMENTO INSERTADO");
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        TXTimprimirTodo.setText(pila.toString());
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        if (pila.empty() == true) {
           JOptionPane.showMessageDialog(null, "LA COLA ESTA VACIA");
        } else {
            TXTeliminar.setText(pila.pop().toString());
            JOptionPane.showMessageDialog(null, "ELEMENTO ELIMINADO");
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(pila.contains(TXTbuscar.getText())){
            JOptionPane.showMessageDialog(null, TXTbuscar.getText() + " SI SE ENCUENTRA EN LA PILA");
        }else{
            JOptionPane.showMessageDialog(null, TXTbuscar.getText() + " NO SE ENCUENTRA EN LA PILA");
        }
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if (pila.empty() == true) {
           JOptionPane.showMessageDialog(null, "LA COLA ESTA VACIA");
        } else {
            TXTimprimir.setText(pila.peek().toString());
        }
    } 