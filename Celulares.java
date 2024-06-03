import javax.swing.JOptionPane;

public class Celulares  {
    protected String marca;
    protected String modelo;
    protected String numSerie;
    
    public Celulares() {
        marca=JOptionPane.showInputDialog("Ingrese la marca del celular");
        modelo=JOptionPane.showInputDialog("Ingrese el modelo del celular");
        numSerie=JOptionPane.showInputDialog("Ingrese el numero de serie del celular");
    }

    public Celulares(String marca, String modelo, String numSerie) {
        this.marca = marca;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getNumSerie() {
        return numSerie;
    }
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }


    
}