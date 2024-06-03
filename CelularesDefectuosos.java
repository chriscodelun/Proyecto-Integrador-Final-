import javax.swing.JOptionPane;

public class CelularesDefectuosos extends Celulares {
    private String motivo;
    private String nombreDueno;
    
    public CelularesDefectuosos() {
        motivo=JOptionPane.showInputDialog("Ingrese el motivo por el cual el celular esta defectuoso");
        nombreDueno=JOptionPane.showInputDialog("Nombre del dueno del celular defectuoso");  

    }

    public CelularesDefectuosos(String marca, String modelo, String numSerie, String motivo, String nombreDueno) {
        super(marca, modelo, numSerie);
        this.motivo = motivo;
        this.nombreDueno = nombreDueno;
    }

    public CelularesDefectuosos(String motivo, String nombreDueno) {
        this.motivo = motivo;
        this.nombreDueno = nombreDueno;
    }
    public String datosCelDef()
    {
        String datos="";
        datos="Propietario: "+nombreDueno+"\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nNumero de serie: "+getNumSerie()+"\nMotivo de defecto: "+motivo;
        return datos;
    }
    public String getMotivo() {
        return motivo;
    }
    public String getNombreDueno() {
        return nombreDueno;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    } 

    
}