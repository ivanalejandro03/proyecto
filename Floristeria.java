
package parcial3corte;

import javax.swing.JOptionPane;

public class Floristeria {

protected int Cantidad;
protected String FlorRequerida;
protected int PrecioVenta;

    public void  Floristeria(int Cantidad, String FlorRequerida, int PrecioVenta) {
        this.setCantidad(Cantidad);
        this.setFlorRequerida(FlorRequerida);
        this.setPrecioVenta(PrecioVenta);
    }


    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setFlorRequerida(String FlorRequerida) {
        this.FlorRequerida = FlorRequerida;
    }

    public void setPrecioVenta(int PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public String getFlorRequerida() {
        return FlorRequerida;
    }

    public int getPrecioVenta() {
        return PrecioVenta;
    }


}

   