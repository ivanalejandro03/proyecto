
package parcial3corte;

import javax.swing.JOptionPane;


public class Main {
public static void main(String[]args){
    int x = Integer.parseInt(JOptionPane.showInputDialog(null," ¿Desea comprar? opcion 1 Rosas opcion 2 Girasoles "));
    switch(x){
       case 1:
         Rosa uno=new Rosa();
         uno.CapturardatosR();
         uno.MostrardatosR();
         break;
       case 2:
        girasol dos=new girasol();
        dos.pedirdatosG();
        dos.MostrarDatosG();
    }
       
        
    
}
        
}
