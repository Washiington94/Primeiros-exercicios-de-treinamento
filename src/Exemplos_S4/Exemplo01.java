package Exemplos_S4;



//Classe: Exemplo01.java
//Primeiro exemplo de criação de frame
//Autor: 
//Data: Agosto/2023

import java.awt.*;
import java.awt.event.*;

public class Exemplo01 extends Frame
{
	public Exemplo01()
	{
		setTitle("Primeiro Frame");
		setResizable(false); // Não altera o tamabi do frame
		setSize(400,300);
		setLocation(100,100);
             //setBounds(100,100,400,300);
		setBackground(Color.yellow);
             // black, blue, cyan, darkGray, gray, lightGray
             // magenta, orange, pínk, red, white, green
	}
	public static void main ( String arg[])
	{
		new Exemplo01().setVisible(true);
	}
     public boolean handleEvent(Event e)
     {
        if (e.id == Event.WINDOW_DESTROY)   // Identifica o evento
           System.exit(0);                  // Encerra a aplicação
        return (super.handleEvent(e));      // Deixa o metodo da super classe
     }
}