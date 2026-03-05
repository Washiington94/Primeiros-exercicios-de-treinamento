package Exemplos_S4;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class Exemplo17 extends Frame
{

	Button B1;
	Button B2;
	Button B3;
	TextField Tx1;
	Label L1,L2,L3,L4,L5,L6;
	int tentativas =0;
	
	public Exemplo17() {
	 
	 setTitle("ADIVINHE O NUMERO ");
	 setResizable(false);
	 setSize(500,300);
	 setLocation(100,100);
	 setBackground(Color.lightGray);
	 setLayout(null);
	 
	 L1 = new Label("ADIVINHE O NUMERO:");
	 L1.setLocation(200,50);
	 L1.setSize(150,30);
	 
	 L2 = new Label("Entre com seu chute:");
	 L2.setLocation(50,90);
	 L2.setSize(150,30);
	 
	 L3 = new Label("É MENOR!");
	 L3.setLocation(270,90);
	 L3.setSize(70,30);
	 
	 L4 = new Label("É MAIOR!");
	 L4.setLocation(270,90);
	 L4.setSize(70,30);
	 
	 L5 = new Label("TENTATIVAS :");
	 L5.setLocation(50,130);
	 L5.setSize(80,30);

	 L6 = new Label("?");
	 L6.setLocation(130,130);
	 L6.setSize(100,30);
	 
	 Tx1 = new TextField("");
	 Tx1.setLocation(200,90);
	 Tx1.setSize(50,20);
	 
	 B1 = new Button("NOVO JOGO");
	 B1.setLocation(15,200);
	 B1.setSize(150,50);
	 
	 B2 = new Button("JOGAR");
	 B2.setLocation(175,200);
	 B2.setSize(150,50);
	 
	 B3 = new Button("SAIR");
	 B3.setLocation(335,200);
	 B3.setSize(150,50);
	 
	 add(L1);
	 add(L2);
	 add(L3);
	 add(L4);
	 add(L5);
	 add(L6);
	 add(Tx1);
	 add(B1);
	 add(B2);
	 add(B3);
 
 
 
	 ButtonHandler handler = new
			 ButtonHandler();
	 B1.addActionListener(handler);
	 B2.addActionListener(handler);
	 B3.addActionListener(handler);
 }
 public static void main (String arg[]) {
		
		new Exemplo17().setVisible(true);
 }
 
 public boolean handleEvent(Event e) {
		
     if (e.id == Event.WINDOW_DESTROY)   
          System.exit(0);                  
     return (super.handleEvent(e));
 }
 


private class ButtonHandler implements        
ActionListener

{

	public void actionPerformed(ActionEvent e)
	{
		
		int Num;
		String numero;
		
		if (e.getActionCommand() == "SAIR")
			 dispose(); 
		else
		{
			Random aleatorio = new Random();
			int valor = aleatorio.nextInt(1001);
		
			numero = Tx1.getText();
			if (Integer.parseInt(numero) > valor) 
			    L3.setText(numero);
				
			else if(Integer.parseInt(numero) < valor) 
			    L4.setVisible(false);
			    
			    tentativas++;
			    L6.setText(String.valueOf(tentativas));	
		
		}
	}
}
}

				
		
		




 
	 

 
		 