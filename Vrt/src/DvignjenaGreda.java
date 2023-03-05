public class DvignjenaGreda extends Greda implements VlagaGrede{
	
	private int visina;
	private double vlagaGrede;
	
	public DvignjenaGreda(int v, double vg){
		
		visina = v;
		vlagaGrede = vg;
		System.out.println("kreiram dvignjeno gredo visine " + visina + "cm." );
	}
	
	public void povzdigni(int v){
		System.out.print("Gredo smo povzdignili iz " + visina + "cm na ");
		visina = visina + v;
		System.out.print(visina + "cm.");

	}
	
	public String getVisinaGrede(){
		return visina + "cm";
	}
	
	public double getVlagoGrede(){
		return vlagaGrede ;
	}
	
	
	
	
	
}