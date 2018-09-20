package controller;

import javax.swing.JOptionPane;

import model.Properties;

public class IfController
{
	private Properties myProperties;
	
	/**
	 * This is where the program starts calling methods to run the program.
	 */
	public void start ()
	{
		JOptionPane.showMessageDialog(null, myProperties);
	}
	
	
	/**
	 * (this is a java doc) to write API (documentation of how to write/use the code)
	 * The constructor builds the instance of the Controller
	 */
	public IfController()
	{
		myProperties = new Properties("The Man Who Knew Too Little", 1997, 94.0, true );
	}
	
	
	
	
	
	
	
	
//	public void start1()
//	{
//		
//		
//		String MovieQuestion = JOptionPane.showInputDialog(null, "What is your favorite movie genre?\n(Comedy, Action, or Romance)");
//		
//		//----------------------------declarations---------------------------------------------
//		String Com = "comedy"; 
//		String Act = "action"; 
//		String Rom = "romance";
//		
//		String MWKTL = "the man who knew too little";
//		String MP = "monty python";	
//		String Shrek = "shrek";	
//
//		//----------------------------if statements---------------------------------------------
//
//		
//		
//		if (MovieQuestion.equals(Com))
//		{
//			String ComAnswer = JOptionPane.showInputDialog(null, "Which movie do you like the most? \nThe Man Who Knew Too Little, Monty Python, or Shrek");
//			if (ComAnswer.equals(MWKTL))
//			{
//				JOptionPane.showMessageDialog(null, "You are a classy individual.");
//			}
//			
//			if (ComAnswer.equals(MP))
//			{
//				JOptionPane.showMessageDialog(null, "You have an interesting sense of humor.");
//
//			}
//			
//			if (ComAnswer.equals(Shrek))
//			{
//				JOptionPane.showMessageDialog(null, "You have a childish sense of humor.");
//
//			}
//			
//		}
//		
//		if (MovieQuestion.equals(Act))
//		{
//			String ActAnswer = JOptionPane.showInputDialog(null, "Which movie do you like the most? \nMission Impossible, ");
//			if (ActAnswer.equals(MWKTL))
//			{
//				JOptionPane.showMessageDialog(null, "You are a classy individual.");
//			}
//			
//			if (ActAnswer.equals(MP))
//			{
//				JOptionPane.showMessageDialog(null, "You have an interesting sense of humor.");
//
//			}
//			
//			if (ActAnswer.equals(Shrek))
//			{
//				JOptionPane.showMessageDialog(null, "You have a childish sense of humor.");
//
//			}
//		}
//		
//		if (MovieQuestion.equals(Rom))
//		{
//			
//		}
//
//		
//		
//		
//		
//	}




}
