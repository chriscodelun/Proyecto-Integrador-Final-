import javax.swing.JOptionPane;

public class CelularesNuevos extends Celulares {
    private double precio;
    private String fechaIngreso;

    public CelularesNuevos() {
        boolean ban = true;
        fechaIngreso = JOptionPane.showInputDialog("Fecha de ingreso del celular");
        while (ban) {
            try {
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del celular"));
                ban = false;
            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Vuelva a ingresar el precio (solo valores numericos)");
            }

        }
    }

    public String datosCelNuevos() {
        String datos="Fecha de Ingreso: "+fechaIngreso+"\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nNumero de serie: "+getNumSerie()+"\nPrecio de compra: "+precio;
        return datos;
        //return "Fecha de ingreso: "+fechaIngreso + "\nPrecio de compra: " + precio;
    }

    public CelularesNuevos(double precio, String fechaIngreso) {
        this.precio = precio;
        this.fechaIngreso = fechaIngreso;
    }

    public CelularesNuevos(String marca, String modelo, String numSerie, double precio, String fechaIngreso) {
        super(marca, modelo, numSerie);
        this.precio = precio;
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

}
