
package parcial3corte;

import javax.swing.JOptionPane;


public class girasol extends Rosa{
protected String TamañoDelTallo;

    public void girasol(String TamañoDelTallo, int color, String NombreCientifico, int Cantidad, String FlorRequerida, int PrecioVenta) {
        super.Rosa(color, NombreCientifico, Cantidad, FlorRequerida, PrecioVenta);
        this.TamañoDelTallo = TamañoDelTallo;
    }


 public void pedirdatosG(){
        color=Integer.parseInt(JOptionPane.showInputDialog("¿De que color desea sus flores?"));
        Cantidad =Integer.parseInt(JOptionPane.showInputDialog("inserte la cantida de flores que requiere"));
        FlorRequerida=JOptionPane.showInputDialog("inserte el tipo de flor que desea");
        PrecioVenta=Integer.parseInt(JOptionPane.showInputDialog("inserte el valor de cada flor"));
        TamañoDelTallo=JOptionPane.showInputDialog("¿De que tamaño desea el tallo?: 1 Largo ,2 Medio, 3 Corto");
    }
    public void MostrarDatosG(){
        MostrardatosR();
        JOptionPane.showMessageDialog(null,"el girasol lo eligio de tallo " +  TamañoDelTallo );  

    }
}
