

package boletín.pkg7.ej.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author plago-bergonpazos
 */
public class Numeros {
    private float n1;
    private float n2;
    private float n3;

public void Numeros(float n1, float n2, float n3){
this.n1 = n1;
this.n2 = n2;
this.n3 = n3;
}

public float introduce (){
    return (Float.parseFloat(JOptionPane.showInputDialog("Introduce un numero:")));
    
}
public void calculaMayor(float n1, float n2, float n3){
    if (n1 > n2 && n1 > n3){
        JOptionPane.showMessageDialog(null, n1+" "+"es el número mayor.");
    }
        else if (n2 > n1 && n2 > n3){
                JOptionPane.showMessageDialog(null, n2+" "+"es el número mayor.");
                }
        else {
            JOptionPane.showMessageDialog(null, n3+" es el número mayor.");
           
    }
}
}

