package controller;

import javax.swing.JOptionPane;

import model.Properties;

public class IfController
{
	private Properties myProperties;

	/**
	 * This is where the program starts calling methods to run the program.
	 */
	public void start()
	{
//		start1();
		// forPractice();
		// askUser();
		 Looooop2();
		 myLooooop();
	//	 JOptionPane.showMessageDialog(null, myProperties); //THIS WOULD PRINT THE
		// DEFAULT VALUES!!!

	}

	/**
	 * (this is a java doc) to write API (documentation of how to write/use the
	 * code) The constructor builds the instance of the Controller
	 */
	public IfController()
	{
		// String title111 = JOptionPane.showInputDialog("What is the title of your
		// movie?");
		// String YearReleased111 = JOptionPane.showInputDialog("What year was it
		// released?");
		// String RunTime111 = JOptionPane.showInputDialog("What is the run time of your
		// movie?");
		// String Comedy111 = JOptionPane.showInputDialog("Is your movie a comedy?");

		myProperties = new Properties("The Man Who Knew Too Little", 1997, 94.0, true);
		// myProperties = new Properties("The Man Who Knew Too Little", 1997, 94.0, true
		// );
	}

	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;

		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error) // type, variable -- formal parameter
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
			Double.parseDouble(maybeDouble); // String to double conversion
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Put in a double");
		}
		return isValid;
	}

	private void myLooooop() // demo --can only be called by IfController because is private
	{
		boolean isDone = false; // DEFINE VARIABLES BEFORE LOOP (INITIALIZE)
		int count = 0;

		while (!isDone) // THE CONDITION
		// executes for as long as the condition is true--as long as isDone is false =>
		// so infinite
		{
			JOptionPane.showMessageDialog(null, "loops?");
			// must eventually change the loop variable to leave it
			// isDone = true;//allows loop to end after one time

			count++; // THE INCREMENT
			// count = count +1, count-- => count = count -1
			if (count >= 5)
			{
				isDone = true;
			}
			// oboe- off by one error--fix with a <= OR ((loop goes 1 extra or less time))
			// (for how many times something executes--include 0 when counting how many
			// times something happens)

		}

		for (int loop = 0; loop < 30; loop += 2) // can add by anything example +=18
		{
			JOptionPane.showMessageDialog(null, "The loop value is " + loop); // will print 0,2,4,6,8...28 (not 30)
		}

		for (int l = 16; l >= 2; l = (l / 2))
		{
			JOptionPane.showMessageDialog(null, "There are now " + l + " teams.");
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
		JOptionPane.showMessageDialog(null, "You have " + bananacount + " bananas.");

	}

	
	
	private void askUser() // this is the user input
	{
		Properties titleStuff1 = new Properties();

		String answeryes = "yes";
		String responseTitle = JOptionPane.showInputDialog("What is the title?");
		if (responseTitle == null || responseTitle.equals(""))
		{
			JOptionPane.showMessageDialog(null, "You either pressed cancel, the x, or typed nothing!");
			responseTitle = JOptionPane.showInputDialog("What is the title?");
		}
		// ---------------------------------run
		// time------------------------------------------------------
		String responseRT = JOptionPane.showInputDialog("What is the run time?"); // ask

		while (responseRT == null || !validDouble(responseRT))// repeat until correctly done
		{
			responseRT = JOptionPane.showInputDialog(null, "Type a VALID number for run time.");
		}
		if (responseRT == null || responseRT.equals(""))
		{
			JOptionPane.showMessageDialog(null, "You either pressed cancel, the x, or typed nothing!");
			responseRT = JOptionPane.showInputDialog("What is the run time?");
		}
		// ---------------------------------year
		// released------------------------------------------------------
		String responseYR = JOptionPane.showInputDialog("What year was it released?");

		while (responseYR == null || !validInt(responseYR))
		{
			responseYR = JOptionPane.showInputDialog("Type a VALID year.");
		}
		if (responseYR == null || responseYR.equals(""))
		{
			responseYR = JOptionPane.showInputDialog("What year was it released?");
			JOptionPane.showMessageDialog(null, "You either pressed cancel, the x, or typed nothing!");
		}

		// ----------------------is
		// comedy-----------------------------------------------------
		String responseIC = JOptionPane.showInputDialog("Is the movie a comedy? (yes/no)");

		if (responseIC == null || responseIC.equals(""))
		{
			JOptionPane.showMessageDialog(null, "You either pressed cancel, the x, or typed nothing!");
			responseIC = JOptionPane.showInputDialog("Is the movie a comedy? (yes/no)");

		}
		if (responseIC.equals(answeryes))
		{
			boolean responseIC1 = true;
			titleStuff1.setTitle(responseTitle);
			titleStuff1.setRunTime(Double.parseDouble(responseRT)); // changing string to double once you have verified it is correct--so you can
																	// actually use it
			titleStuff1.setYearReleased(Integer.parseInt(responseYR));
			titleStuff1.setIsComedy(responseIC1);
			JOptionPane.showMessageDialog(null, titleStuff1);
			// JOptionPane.showMessageDialog(null, "The title is "+ responseTitle + ". It
			// runs for "+ responseRT + " minutes. It was released in " + responseYR + " .
			// It is a comedy.");//assign
		}
		else
		{
			boolean responseIC1 = false;
			titleStuff1.setTitle(responseTitle);
			titleStuff1.setRunTime(Double.parseDouble(responseRT)); // changing string to double once you have verified it is correct--so you can
																	// actually use it
			titleStuff1.setYearReleased(Integer.parseInt(responseYR));
			titleStuff1.setIsComedy(responseIC1);

			JOptionPane.showMessageDialog(null, titleStuff1);

			// JOptionPane.showMessageDialog(null, "The title is "+ responseTitle + ". It
			// runs for "+ responseRT + " minutes. It was released in " + responseYR + " .
			// It is not a comedy.");
		}

	}

	private void askUser1()
	{
		for (int i = 1; i < 4; i++)
		{

		}
	}

	private void forPractice() //for loop- always a counting loop (like Simon says- do it 3 times)-pass two streets then turn left
	{							//while-go until you reach something (go to end of street then turn left)
		for (int i = 1; i < 4; i++)
		{
			askUser();
		}
	
	
	
	//Analogy-
	//model is what you can see
	//controller-director-not seen in the movie
	//all work goes 

	
	}

	public void start1()
	{
		
		
		
			
		//----------------------------declarations---------------------------------------------
		String Com = "comedy"; 
		String Act = "action"; 
		String Shark = "shark movies";
		
		String MWKTL = "the man who knew too little";
		String MP = "monty python";	
		String Shrek = "shrek";	
		
		String MI = "mission impossible";
		String MFU = "man from uncle";
		String MFU1 = "man for u.n.c.l.e.";
		String DK = "the dark knight";
		
		String MEG = "the megladon";
		String SN = "sharknado";
		String SJ = "santa jaws";
		
				

		//----------------------------if statements---------------------------------------------

		String MovieQuestion = JOptionPane.showInputDialog(null, "What is your favorite movie genre?\n(Comedy, Action, or Shark Movies)");
			

		
		if (MovieQuestion.equals(Com))
		{
			String ComAnswer = JOptionPane.showInputDialog(null, "Which movie do you like the most? \nThe Man Who Knew Too Little, Monty Python, or Shrek");
			if (ComAnswer.equals(MWKTL))
			{
				JOptionPane.showMessageDialog(null, "Was that a tear? How do you people do it? Did you poke yourself in the eye? Or are you thinking right now, 'My Dog...is Dead'?");
			}
			
			if (ComAnswer.equals(MP))
			{
				JOptionPane.showMessageDialog(null, "Help, help, I'm being oppressed!");

			}
			
			if (ComAnswer.equals(Shrek))
			{
				JOptionPane.showMessageDialog(null, "Parfaits are delicious!");

			}
			
			if (!ComAnswer.equals(MWKTL) || !ComAnswer.equals(MP) || !ComAnswer.equals(Shrek))
			{
				JOptionPane.showMessageDialog(null, "You must type in a VALID answer!");
				String ComAnswer1 = JOptionPane.showInputDialog(null, "Which movie do you like the most? \nThe Man Who Knew Too Little, Monty Python, or Shrek");
				ComAnswer = ComAnswer1;
			}
			
		}
		
		if (MovieQuestion.equals(Act))
		{
  		String ActAnswer = JOptionPane.showInputDialog(null, "Which movie do you like the most? \nMission Impossible, Man From U.N.C.L.E., or The Dark Knight?");
			if (ActAnswer.equals(MI))
			{
				JOptionPane.showMessageDialog(null, "This tape/disc will self-destruct in five/ten seconds.");
			}
			
			if (ActAnswer.equals(MFU) || ActAnswer.equals(MFU1))
			{
				JOptionPane.showMessageDialog(null, "Take a left through the window.");

			}
			
			if (ActAnswer.equals(DK))
			{
				JOptionPane.showMessageDialog(null, "Because we have to chase him. Because he's the hero Gotham deserves, but not the one it needs right now, so we'll hunt him. Because he can take it, because he's not a hero. He's a silent guardian, a watchful protector, a Dark Knight.");

			}
			if (!ActAnswer.equals(MI) || !ActAnswer.equals(MFU) || !ActAnswer.equals(MFU1) || !ActAnswer.equals(DK))
			{
				JOptionPane.showMessageDialog(null, "You must type in a VALID answer!");
				String ActAnswer1 = JOptionPane.showInputDialog(null, "Which movie do you like the most? \nMission Impossible, Man From U.N.C.L.E., or The Dark Knight?");
				ActAnswer = ActAnswer1;
			}
		}
		
		if (MovieQuestion.equals(Shark))
		{
	  		String SharkAnswer = JOptionPane.showInputDialog(null, "Which movie do you like the most? \nThe Megladon, Sharknado, or Santa Jaws?");
			if (SharkAnswer.equals(MEG))
			{
				JOptionPane.showMessageDialog(null, "Why don't you just put a tracker on it? Don't you guys ever watch Shark Week?");
			}
			
			if (SharkAnswer.equals(SN))
			{
				JOptionPane.showMessageDialog(null, "I have post traumatic shark disorder.");

			}
			
			if (SharkAnswer.equals(SJ))
			{
				JOptionPane.showMessageDialog(null, "No more sugar cookies for you Santa you're going to eat your words!");

			}
			if (!SharkAnswer.equals(MEG) || !SharkAnswer.equals(SN) || !SharkAnswer.equals(SJ))
			{
				JOptionPane.showMessageDialog(null, "You must type in a VALID answer!");
				String SharkAnswer1 = JOptionPane.showInputDialog(null, "Which movie do you like the most? \\nThe Megladon, Sharknado, or Santa Jaws?");
				SharkAnswer = SharkAnswer1;
			}
		}
		
		
		if (!MovieQuestion.equals(Com) || !MovieQuestion.equals(Act) || !MovieQuestion.equals(Shark))
		{
			JOptionPane.showMessageDialog(null, "You must type in a VALID answer!");
			String MovieQuestion1 = JOptionPane.showInputDialog(null, "What is your favorite movie genre?\n(Comedy, Action, or Shark Movies)");
			MovieQuestion = MovieQuestion1;
		}
	}
}
