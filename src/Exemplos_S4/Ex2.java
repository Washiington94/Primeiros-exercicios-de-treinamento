package Exemplos_S4;
import java.awt.*;
import java.awt.event.*;


public class Ex2 extends Frame {

Label L1,L2,L3,L4;
TextField Tx1,Tx2;
Button B1,B2,B3;
List Li;

 static String lista[] = new String[50];
	{
			
	}

public Ex2() {

setTitle("USO DO LIST");
setResizable(false);
setSize(500,500);
setLocation(100,100);
setBackground(Color.YELLOW);
setLayout(null);


L1 = new Label("CADASTRAMENTOD DE LIVROS");
L1.setLocation(50,50);
L1.setSize(200,30);

 L2 = new Label("Titulo");
 L2.setLocation(50,90);
 L2.setSize(70,30);

 L3 = new Label("Paginas");
 L3.setLocation(50,130);
 L3.setSize(70,30);

 L4 = new Label("Livros");
 L4.setLocation(50,170);
 L4.setSize(150,30);

 Li = new List(5, false);
 Li.setLocation(50,200);
 Li.setSize(300,150);
       
         

 B1 = new Button("ADICIONAR");
 B1.setLocation(50,400);
 B1.setSize(100,50);

 B2 = new Button("LISTAR");
 B2.setLocation(200,400);
 B2.setSize(100,50);

 B3 = new Button("SAIR");
 B3.setLocation(350,400);
 B3.setSize(100,50);

 Tx1 = new TextField("");
 Tx1.setLocation(150,90);
 Tx1.setSize(150,30);

 Tx2 = new TextField("");
 Tx2.setLocation(150,130);
 Tx2.setSize(150,30);  

 add(L1);
 add(L2);
 add(L3);
 add(L4);
 add(B1);
 add(B2);
 add(B3);
 add(Tx1);
 add(Tx2);
 add(Li);

 ButtonHandler handler = new
 ButtonHandler();
 B1.addActionListener(handler);
 B2.addActionListener(handler);
 B3.addActionListener(handler);
}





public static void main(String[] args) {

new Ex2().setVisible(true);

}
public boolean handleEvent(Event e)
{
if (e.id == Event.WINDOW_DESTROY)
System.exit(0);
return(super.handleEvent(e));
}

public class ButtonHandler implements ActionListener
{

	public void actionPerformed(ActionEvent e) {
		int Num;
		String tit,livros,paginas;



		if (e.getActionCommand() == "SAIR")
			System.exit(0);
		
		if (e.getActionCommand() == "LISTAR") {
			for(int i=0;i<50;i++) {
				if(lista[i] == null) {
					break;
				}
	
					
					Li.addItem(lista[i]);}
			}
				
			
		
		
		if (e.getActionCommand() == "ADICIONAR"){

			tit = (Tx1.getText());
			paginas = (Tx2.getText());
		
				 for(int i=0;i<=50;i++) {
						
						lista[i] = Tx1.getText() + " " + Tx2.getText();
						i++;
				 }}}}}
				
		
			
				
			 
			 
		
				
		
				
			



