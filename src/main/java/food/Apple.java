package food;

public class Apple extends Fruit {
	
	private String Name;
	private String description="not set";
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String talkAboutYourself()
	{
		String result = super.talkAboutYourself();
		
		if(description != null) result += description;
		
		return result;
		
		
	}
	
	

}
