import javax.swing.JOptionPane;

public class CelularesVendidos extends Celulares{
    private String fechaVenta;
    private double precioVenta;
    
    public CelularesVendidos() {
        boolean ban=true;
        fechaVenta=JOptionPane.showInputDialog("Ingrese la fecha de la venta del celular");
        while (ban) {
            try{
                precioVenta=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de venta: "));
                ban=false;
            }catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Vuelva a ingresar el precio,(solo valores numericos)");
            }
        }

    }
    public CelularesVendidos(String fechaVenta, double precioVenta) {
        this.fechaVenta = fechaVenta;
        this.precioVenta = precioVenta;
    }
    public CelularesVendidos(String marca, String modelo, String numSerie, String fechaVenta, double precioVenta) {
        super(marca, modelo, numSerie);
        this.fechaVenta = fechaVenta;
        this.precioVenta = precioVenta;
    }
    public String datosCelVendido()
    {
        String datos="Fecha de venta: "+fechaVenta+"\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nNumero de serie: "+getNumSerie()+"\nPrecio de venta: "+precioVenta;
        return datos;
        //return "Fecha de venta: "+fechaVenta+"\nPrecio de venta: "+precioVenta;
    }

    
}
