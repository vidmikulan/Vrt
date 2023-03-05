import javax.swing.table.*;  

public class DvignjenaGredaTableModel extends DefaultTableModel{
	
	public DvignjenaGredaTableModel() {
		super();
		addColumn("Visina grede");
		addColumn("Vlaga grede");
		
		Object[] vrstica = new Object[]{"Visina", "Vlaga (°C)"};
		
		addRow(vrstica);
	}
	
	public void addDvignjenaGreda(DvignjenaGreda dg){
		Object[] vrstica = new Object[]{dg.getVisinaGrede(), dg.getVlagoGrede()};
		
		addRow(vrstica);
	}
	
}