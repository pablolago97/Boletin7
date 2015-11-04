/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg7.ej.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author plago-bergonpazos
 */
public class Suma {
    
    
    
    
  public double setNum (){
         double num1 ;
        return  (Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número:")));
  }
  
  public double setNum2(){
      double num2 ;
      return (Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número:")));
  }
  
  public void comparar(double num1, double num2){
         JOptionPane.showMessageDialog(null, "La suma es:"+(num1+num2));
     if (num1 >= num2){
                JOptionPane.showMessageDialog(null, "La resta es:"+(num1-num2));
     }
     

    
  }
}
