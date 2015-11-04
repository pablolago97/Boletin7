
package boletín.pkg7.ej.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author plago-bergonpazos
 */
public class Peso {
    private float kilos1;
    private float kilos2;
    private String gordo1;
    private String gordo2;
    
public void Peso(float kilos1, float kilos2, String gordo1, String gordo2){
    this.kilos1 = kilos1;
    this.kilos2 = kilos2;
    this.gordo1 = gordo1;
    this.gordo2 = gordo2;
}
public String nombre(){
   String respuesta = JOptionPane.showInputDialog("Introduce el nombre de la persona:");
    return respuesta;
}
public float peso(){
       return (Float.parseFloat(JOptionPane.showInputDialog("Introduce el peso:")));

}
public void calcularPeso(float kilos1, float kilos2, String gordo1, String gordo2){
    if (kilos1 > kilos2){
        JOptionPane.showMessageDialog(null, gordo1+" "+"pesa"+" "+(kilos1-kilos2)+"  "+"mas que"+" "+gordo2);
    }
        else{
                JOptionPane.showMessageDialog(null, gordo2+" "+"pesa"+" "+(kilos2-kilos1)+"  "+"mas que"+" "+gordo1);
                }
        
    }
    
}

