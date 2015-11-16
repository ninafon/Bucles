
package bucle1;

import javax.swing.JOptionPane;

public class Bucle1 {

 
    public static void main(String[] args) {
      String res;
     
     do{
     ContarNumeros obx = new ContarNumeros();    
     obx.contar();
    res=  JOptionPane.showInputDialog(" outra execución :");
     }while(res.equalsIgnoreCase("si") );
    }
    
}
