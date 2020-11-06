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
	
	public String whatIsInThisMeal() {
		
		String answer ="This meal contains: ";
		
		if(fruit != null) answer += "some fruit ";
		if(dairy != null) answer += "some dairy ";
		if(meat != null) answer += "some meat ";
		return answer;
	}

}
