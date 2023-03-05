import javax.swing.*;
import java.awt.event.*;
public class Vrt extends JFrame implements ActionListener{
	
	private JPanel povrsina;
	private JButton dodajJButton;
	private JTextField visinaGredePolje,vlagaGredePolje;
	private JTable tabela;
	private DvignjenaGredaTableModel modelTabele;
	
	private JButton spremeniButton;
	private JTextField spremeniVisinoPolje, spremeniVlagoPolje,stSpremembePolje;
	
	public static void main(String[] args){
		
		Vrt v = new Vrt("Vrt dvignjenih gred");
		
	}
	
	public Vrt(String s){
		super(s);
		
		povrsina = new JPanel();
		dodajJButton = new JButton("Dodaj Gredo");
		/////////////
		spremeniButton = new JButton("Spremeni gredo");
		////////////
		visinaGredePolje = new JTextField(32);
		vlagaGredePolje = new JTextField(8);
		
		/////////////////
		spremeniVisinoPolje = new JTextField(14);
		spremeniVlagoPolje = new JTextField(5);
		stSpremembePolje = new JTextField(3);
		////////////////
		
		
		modelTabele = new DvignjenaGredaTableModel();
		tabela = new JTable(modelTabele);
		
		dodajJButton.addActionListener(this);
		spremeniButton.addActionListener(this);
		
		add(povrsina);
		povrsina.add(new JLabel("Visina grede"));
		povrsina.add(visinaGredePolje);
		povrsina.add(new JLabel("vlaga grede"));
		povrsina.add(vlagaGredePolje);
		povrsina.add(dodajJButton);
		/////////////////
		povrsina.add(new JLabel("St. Polja "));
		povrsina.add(stSpremembePolje);
		povrsina.add(new JLabel("spremeni visino grede"));
		povrsina.add(spremeniVisinoPolje);
		povrsina.add(new JLabel("spremeni vlago grede"));
		povrsina.add(spremeniVlagoPolje);
		povrsina.add(spremeniButton);
		////////////////
		povrsina.add(tabela);
		
		setVisible(true);
		setSize(750,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.println("Ustvarjam objekt Vrt");
		
	}
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == dodajJButton){
			try {
			modelTabele.addDvignjenaGreda(new DvignjenaGreda(Integer.parseInt(visinaGredePolje.getText()),Double.parseDouble(vlagaGredePolje.getText())));
			}
			catch(Exception e){
				System.out.println("Napaka pri vpisu v tabelo: " + e);
			}
		}
		if (ae.getSource() == spremeniButton){
			try{
				int st = Integer.parseInt(stSpremembePolje.getText());
				int visina = Integer.parseInt(spremeniVisinoPolje.getText());
				double vlaga = Double.parseDouble(spremeniVlagoPolje.getText());
				
				
				tabela.setValueAt(visina,st,0);
				tabela.setValueAt(vlaga,st,1);
			}
			catch(Exception e){
				System.out.println("Napaka pri spremembi vpisa v tabelo: " + e);
			}
		}
	}
	
}