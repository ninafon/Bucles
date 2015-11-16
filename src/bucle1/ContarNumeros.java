
package bucle1;

import javax.swing.JOptionPane;

public class ContarNumeros {
    int num;
    int cp=0,cn=0,cc=0 ;
    public int pedirNum(){
        num = Integer.parseInt(JOptionPane.showInputDialog(" teclea numero :"));
        return num;
    }
    
   public void contar(){
       for (int i=0;i<5;i++){
         num = pedirNum();
         if(num > 0)
             cp++ ;
         else if(num < 0)
                 cn ++ ;
              else 
                 cc ++ ;    
       }
       // amosamos os resultados fora do bucle
       JOptionPane.showMessageDialog(null, "positivos : "+ cp + " negativos : "+ cn + " ceros : "+ cc );
   } 
    
    
}
