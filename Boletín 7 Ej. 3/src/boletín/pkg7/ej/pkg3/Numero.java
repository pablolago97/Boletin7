/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg7.ej.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author plago-bergonpazos
 */
public class Numero {
    
    public float setNum (){
        
        return (Float.parseFloat(JOptionPane.showInputDialog("Introduce un número:")));
        
        }
   public void darNum(float num){
       
            if (num >= 0){
            JOptionPane.showMessageDialog(null, "+");
        }
            else {
            JOptionPane.showMessageDialog(null, "-");
        }
        
   }
}
