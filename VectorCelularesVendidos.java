import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class VectorCelularesVendidos {//aqui empieza
    private CelularesVendidos vectorCelularesVendidos[];
    private int n;

public VectorCelularesVendidos(int tamaño )
   {
    vectorCelularesVendidos=new CelularesVendidos[tamaño];
        n=tamaño;
   } 
public void capturarCelularesVendidos()
{
    for(int i=0;i<n;i++)
        {
            vectorCelularesVendidos[i]=new CelularesVendidos();
        }
}

public void mostrarCelularesVendidos()
{
    String salida="";
		for(int i=0;i<n;i++)
		{
			salida+=vectorCelularesVendidos[i].datosCelVendido()+"\n";
		}
        JOptionPane.showMessageDialog(null, salida);
		
		JTextArea area=new JTextArea(10,30);
		area.setText(salida);
		JScrollPane scroll=new JScrollPane(area);
		JOptionPane.showMessageDialog(null,scroll);
}

}