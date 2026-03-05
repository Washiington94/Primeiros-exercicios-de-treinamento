import java.awt.*;
import java.awt.event.*;




public class Exemplo19 extends Frame {
	
	
	Button B1;
	Button B2;
	TextField Tx1,Tx2,Tx3;
	Label L1,L2,L3,L4,L5,L6,L7;
	
	public Exemplo19() {
		setTitle("Exercicio Calculo de Juros");
		setResizable(false);
		setSize(500,300);
		setLocation(100,100);
		setBackground(Color.lightGray);
		setLayout(null);
		
		
		L1 = new Label("Digite o valor da compra:");
		L1.setLocation(50,50);
		L1.setSize(150,30);
		
		L2 = new Label("Taxa de Juros ao mês:");
		L2.setLocation(50,70);
		L2.setSize(150,30);
		
		L3 = new Label("Quantidade de Parcelas:");
		L3.setLocation(50,90);
		L3.setSize(150,30);
		
		L4 = new Label("Valor da Parcela:");
		L4.setLocation(50,110);
		L4.setSize(100,30);
		
		L5= new Label("Valor Total R$:");
		L5.setLocation(50,140);
		L5.setSize(85,30);
		
		L6 = new Label("$$");
		L6.setLocation(150,140);
		L6.setSize(200,30);
		
		L7 = new Label("$$");
		L7.setLocation(150,110);
		L7.setSize(350,30);
		
		Tx1 = new TextField("");
		Tx1.setLocation(250,50);
		Tx1.setSize(50,20);
		
		Tx2 = new TextField("");
		Tx2.setLocation(250,70);
		Tx2.setSize(50,20);
		
		Tx3 = new TextField("");
		Tx3.setLocation(250,90);
		Tx3.setSize(50,20);
		
		
		B1 = new Button("CALCULAR");
		B1.setLocation(20,200);
		B1.setSize(200,50);
		B1.setBackground(new Color(150,220,255));
		
		B2 = new Button("SAIR");
		B2.setLocation(280,200);
		B2.setSize(200,50);
		B2.setBackground(new Color(150,220,255));
		
		
		add(L1);
		add(L2);
		add(L3);
		add(L4);
		add(L5);
		add(L6);
		add(L7);
		add(Tx1);
		add(Tx2);
		add(Tx3);
		add(B1);
		add(B2);
		
		ButtonHandler handler = new      
        ButtonHandler();
B1.addActionListener(handler);
B2.addActionListener(handler);
	}
		
		
	
public static void main (String arg[]) {
	
	new Exemplo19().setVisible(true);
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
	 String Num,valor,juros,parcelas;
	 double total,soma = 0;
	 
	
	 
	 
if (e.getActionCommand() == "SAIR")
System.exit(0); 
else 
{	
	
	valor = Tx1.getText();
	parcelas = Tx3.getText();
	juros = Tx2.getText();
	if(Integer.parseInt(parcelas) !=0)
	soma = Double.parseDouble(valor) + Double.parseDouble(juros) /100* Double.parseDouble(valor);
		L6.setText(Double.toString(soma));
	
	

	parcelas = Tx3.getText();
	total = soma / Double.parseDouble(parcelas);
	L7.setText(Double.toString(total));	


		
   
	}
}}}
