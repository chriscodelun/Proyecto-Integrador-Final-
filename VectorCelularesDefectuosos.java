import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VectorCelularesDefectuosos {
    private CelularesDefectuosos vectorCelularesDefectuosos[];
    private int n;
    
    public VectorCelularesDefectuosos(int tamano)
    {
        vectorCelularesDefectuosos=new CelularesDefectuosos[tamano];
        n=tamano;
    }
    
    public void capturarCelularesDefectuosos()
    {
        for(int i=0;i<n;i++)
        {
            vectorCelularesDefectuosos[i]=new CelularesDefectuosos();
        }
    }
    public void mostrarCelularesDefectuosos()
	{
        String salida="";
		for(int i=0;i<n;i++)
		{
			salida+=vectorCelularesDefectuosos[i].datosCelDef()+"\n";
		}
        JOptionPane.showMessageDialog(null, salida);
		
		JTextArea area=new JTextArea(10,30);
		area.setText(salida);
		JScrollPane scroll=new JScrollPane(area);
		JOptionPane.showMessageDialog(null,scroll);
		
	}
    public void cambiarMotivoCelDef()
    {
        String motivo = JOptionPane.showInputDialog("Ingrese el numero de serie del celular al que le cambiara el motivo de defecto");
        for (int i = 0; i < n; i++) {
            if (motivo.equalsIgnoreCase(vectorCelularesDefectuosos[i].getNumSerie())) {
                String nuevoMotivo = JOptionPane.showInputDialog("Ingrese el nuevo motivo");
                vectorCelularesDefectuosos[i].setMotivo(nuevoMotivo);
            }

        }
    }

    
}
