package food;

public class Meal {
	
	private Fruit fruit;
	private Meat meat;
	private Dairy dairy;
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public Meat getMeat() {
		return meat;
	}
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	public Dairy getDairy() {
		return dairy;
	}
	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}
	
	public Meal() {}

	public Meal(Fruit f,Meat m,Dairy d)
	{
		this.fruit=f;
		this.meat=m;
		this.dairy=d;
		
	}
	
	public String whatIsInThisMeal() {
		
		String answer ="This meal contains: ";
		
		if(fruit != null) answer += fruit.talkAboutYourself() + "\n";
		if(dairy != null) answer += dairy.talkAboutYourself() + "\n";
		if(meat != null) answer += meat.talkAboutYourself() + "\n";
		return answer;
	}

}
