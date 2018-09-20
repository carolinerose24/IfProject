package model;

public class Properties
{

	//----------------------------Data Members--------------------------------(Declaration Section)
	//Also called instance variable
	//These are special and get a 'Default' value
	//All numbers => 0
	//All booleans => false
	//All Objects => null
	
	
	private String Title;
	private int YearReleased;
	private double RunTime;
	private boolean IsComedy;
	
	/**
	 * Default constructor for after the fact customization.
	 * (Don't know the info yet)
	 * Initializing data members with 'bad' values to be changed.
	 */
	public Properties()//CONSTRUCTOR ONLY NEED THE DEFAULT ONE.
	{
		Title = "Monty Python and the Holy Grail";
		YearReleased = 1969;
		RunTime = 91.0;
		IsComedy = true;
	}
	
	/**
	 * Better Constructor when I know info for the Properties object. THIS IS WHY YOU HAVE 2 CONSTRUCTORS IN THE MODEL.
	 * @param Title
	 * @param YearReleased
	 * @param RunTime
	 * @param IsComedy
	 */
	public Properties(String Title, int YearReleased, double RunTime, boolean IsComedy)
	{
		this.Title = Title;
		this.YearReleased = YearReleased;
		this.RunTime = RunTime;
		this.IsComedy = IsComedy;
	}
	
	
	//----------------------------Getters------------------------------------------

	public String getTitle()
	{
		return Title;
	}
	public int getYearReleased()
	{
		return YearReleased;
	}
	public double getRunTime()
	{
		return RunTime;
	}
	public boolean getIsComedy()
	{
		return IsComedy;
	}
	
	//--------------------------Setters--------------------------------------------
	
	public void setTitle(String Title)
	{
		this.Title = Title; 
	}
	
	public void setYearReleased(int YearReleased)
	{
		this.YearReleased = YearReleased; 
	}
	
	public void setRunTime(double RunTime)
	{
		this.RunTime = RunTime; 
	}
	
	public void setIsComedy(boolean IsComedy)
	{
		this.IsComedy = IsComedy; 
	}
	
	
	public String toString()
	{
//		if (IsComedy == false)
//		{
			String description = "Your movie is called " + Title + ". It runs for " + RunTime + " minutes. It was released in " + YearReleased + ".";

//		}
//		else
//		{
//			String description = "Your movie is called " + Title + ". It runs for " + RunTime + " minutes. It was released in " + YearReleased + ".";
//
//		}

		return description;
	}
	
	
}
