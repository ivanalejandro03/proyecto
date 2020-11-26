
package parcial3corte;

import javax.swing.JOptionPane;


public class Rosa extends Floristeria{
protected int color;
protected String NombreCientifico;

    public void  Rosa(int color, String NombreCientifico, int Cantidad, String FlorRequerida, int PrecioVenta) {
        super.Floristeria(Cantidad, FlorRequerida, PrecioVenta);
        this.color = color;
        this.NombreCientifico = NombreCientifico;
    }

    
    public void CapturardatosR(){
        color=Integer.parseInt(JOptionPane.showInputDialog("¿De que color desea sus flores?"));
        Cantidad =Integer.parseInt(JOptionPane.showInputDialog("inserte la cantida de flores que requiere"));
        FlorRequerida=JOptionPane.showInputDialog("inserte el tipo de flor que desea");
        PrecioVenta=Integer.parseInt(JOptionPane.showInputDialog("inserte el valor de cada flor"));
    }
   public void MostrardatosR(){
        JOptionPane.showMessageDialog(null,"el costo de su compra es:" + Cantidad*PrecioVenta);
         JOptionPane.showMessageDialog(null,"Su flor cientificamente se denomina"+ NombreCientifico);
    }

}

