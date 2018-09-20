package model;

public class Properties
{

	//----------------------------Data Members--------------------------------
	private String Title;
	private int YearReleased;
	private double RunTime;
	private boolean IsComedy;
	
	
	public Properties()
	{
		
	}
	
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
		String description = "Your movie is called " + Title + ". It runs for " + RunTime + " minutes. It was released in " + YearReleased + ".";
		
		
		return description;
	}
	
	
}
