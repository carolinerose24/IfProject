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
		askUser();
		//Looooop2();
		//myLooooop();
		//JOptionPane.showMessageDialog(null, myProperties);
	}
	
	
	/**
	 * (this is a java doc) to write API (documentation of how to write/use the code)
	 * The constructor builds the instance of the Controller
	 */
	public IfController()
	{
//		String title111 = JOptionPane.showInputDialog("What is the title of your movie?");
//		String YearReleased111 = JOptionPane.showInputDialog("What year was it released?");
//		String RunTime111 = JOptionPane.showInputDialog("What is the run time of your movie?");
//		String Comedy111 = JOptionPane.showInputDialog("Is your movie a comedy?");

		
		
		myProperties = new Properties("The Man Who Knew Too Little", 1997, 94.0, true );
		//myProperties = new Properties("The Man Who Knew Too Little", 1997, 94.0, true );
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error) //type, variable -- formal parameter
		{
			JOptionPane.showMessageDialog(null, "Put in an integer");
		}
		
		
		return isValid;
	}
	
	
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		try
		{
			Double.parseDouble(maybeDouble); //String to double conversion
			isValid=true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Put in a double");
		}
		return isValid;
	}
	
	private void myLooooop() //demo --can only be called by IfController because is private
	{
		boolean isDone = false; //DEFINE VARIABLES BEFORE LOOP (INITIALIZE)
		int count = 0;
		
		while(!isDone) //THE CONDITION
			//executes for as long as the condition is true--as long as isDone is false => so infinite
		{
			JOptionPane.showMessageDialog(null, "loops?");
			//must eventually change the loop variable to leave it
			//isDone = true;//allows loop to end after one time
			
			count++; //THE INCREMENT
			//count = count +1, count-- => count = count -1
			if (count >= 5)
			{
				isDone = true;
			}
		//oboe- off by one error--fix with a <= OR
		//(for how many times something executes--include 0 when counting how many times something happens)
		
		}
		
		for (int loop=0; loop < 30; loop +=2)
		{
			JOptionPane.showMessageDialog(null, "The loop value is " + loop); //will print 0,2,4,6,8...28 (not 30)
		}
		
		
	}
	
	private void Looooop2()
	{
		int bananacount = 0;
		while (bananacount < 5)
		{
			JOptionPane.showMessageDialog(null, "Press enter to gain a banana. You currently have " + bananacount + " banana(s).");
			bananacount++;
		}
		JOptionPane.showMessageDialog(null, "You have " + bananacount +  " bananas.");

	}
	
	
	private void askUser()
	{
		String answeryes = "yes";
		String responseTitle = JOptionPane.showInputDialog("What is the title?");
//---------------------------------run time------------------------------------------------------
		String responseRT = JOptionPane.showInputDialog("What is the run time?"); //ask
		Properties RunTime = new Properties ();
		
		while (!validDouble(responseRT))//repeat until correctly done
		{
			responseRT = JOptionPane.showInputDialog(null, "Type a VALID number for run time.");
		}
		RunTime.setRunTime(Double.parseDouble(responseRT)); //changing string to double once you have verified it is correct--so you can actually use it
		
//---------------------------------year released------------------------------------------------------
		String responseYR = JOptionPane.showInputDialog("What year was it released?");
		Properties YearReleased = new Properties();
		
		while (!validInt(responseYR))
		{
			responseYR = JOptionPane.showInputDialog("Type a VALID year.");
		}
		YearReleased.setYearReleased(Integer.parseInt(responseYR));
		
//----------------------is comedy-----------------------------------------------------
		String responseIC = JOptionPane.showInputDialog("Is the movie a comedy? (yes/no)");
		if (responseIC.equals(answeryes))
		{
			JOptionPane.showMessageDialog(null, "The title is "+ responseTitle + ". It runs for "+ responseRT + " minutes. It was released in " + responseYR + " . It is a comedy.");//assign
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The title is "+ responseTitle + ". It runs for "+ responseRT + " minutes. It was released in \" + responseYR + \" . It is not a comedy.\"");
		}
		
		
	
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
