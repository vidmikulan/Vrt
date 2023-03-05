public class Greda{
	
	private int dolzinaGrede;
	private String vrstaZemlje;
	private boolean jePognojena;
	
	
	public Greda(){
		
		dolzinaGrede = 0;
		vrstaZemlje = " ";
		jePognojena = false;
		
		
		
	}
	
	public boolean pognojimo(){
		
		jePognojena = true;
		System.out.println("Pognojili ste gredo.");
		
		return true;
		
	}
	
	public boolean zmerimoDolzinoGrede(int d){
		
		if(dolzinaGrede != 0){
			System.out.println("Dolzina je bila ze zmerjena.");
			return false;
		}
		
		dolzinaGrede = dolzinaGrede + d;
		
		System.out.println("Zmerili ste dolzino grede: " + dolzinaGrede);
		return true;
	}
	
	public boolean dolocimoVrstoZemlje(String v){
		
		if (vrstaZemlje != " "){
			System.out.println("Greda je bila ze dolocena");
			return false;
		}
		
		vrstaZemlje = v;
		
		System.out.println("Dolocili ste vrsto zemlje: " + vrstaZemlje);
		return true;
	}
	
}