/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg7.ej.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author plago-bergonpazos
 */
public class Positivo {
    private float num;
    
    public void Positivo(){
        this.num = num;
    }
 
    
        public float setNum (){
        float num;
        return (Float.parseFloat(JOptionPane.showInputDialog("Introduce un número :")));
        }
        
        public void compNum(float num){
        
    if (num >= 0){
        JOptionPane.showMessageDialog(null, num+" "+"es positivo");
    }
    
    else  {
        JOptionPane.showMessageDialog(null, num+" "+"es negativo");
    } 
        }
}
    
  

    
    

