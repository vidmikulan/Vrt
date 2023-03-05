public class ToplaGreda extends Greda{
	
	private boolean jeOdprta;
	
	public ToplaGreda(){
		
		jeOdprta = false;
		
	}
	
	public boolean odpri(){
		if(!jeOdprta){
			jeOdprta = true;
			
			
			System.out.println("Odprli smo toplo gredo.");
			return true;
		}
		else {
			
			System.out.println("Topla greda je ze odprta");
			return false;
		}
	}
	public boolean zapri(){
		if(jeOdprta){
			jeOdprta = false;
			
			
			System.out.println("zaprli smo toplo gredo.");
			return true;
		}
		else {
			
			System.out.println("Topla greda je ze zaprta");
			return false;
		}
	}
	
}