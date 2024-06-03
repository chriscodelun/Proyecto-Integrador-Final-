import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VectorCelularesNuevos {
    private CelularesNuevos vectorCelularesNuevos[];
    private int n;

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public VectorCelularesNuevos(int tamano) {
        vectorCelularesNuevos = new CelularesNuevos[tamano];
        n = tamano;
    }

    public void capturarCelularesNuevos(String msj) {
        for (int i = 0; i < n; i++) {
            vectorCelularesNuevos[i] = new CelularesNuevos();
        }
    }

    public void mostrarCelularesNuevos() {
        String salida = "";
        for (int i = 0; i < n; i++) {
            salida += vectorCelularesNuevos[i].datosCelNuevos() + "\n";
        }
        JOptionPane.showMessageDialog(null, salida);

        JTextArea area = new JTextArea(10, 30);
        area.setText(salida);
        JScrollPane scroll = new JScrollPane(area);
        JOptionPane.showMessageDialog(null, scroll);

    }
}
