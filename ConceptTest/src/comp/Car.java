package comp;

public class Car {

	//attributes OR variables
	private String name;
	private String make = "Khatara Gaadi";
	private String model;
	private double cost;
	
	
	
	
	//methods
	
	int driveMileage(String model){
		
		int totalMileage = 0;
		
		if (model.equalsIgnoreCase("Audi")) {
			totalMileage = 500;
		}
		else if (model.equalsIgnoreCase("Toyota")){
			totalMileage = 600;
		}
		else {
			totalMileage = 700;
		}
		
		return totalMileage;
	}
	
	//Generate getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	//Main method just to test
	public static void main(String[] args) {
		Car audi = new Car();
		audi.setCost(50000);
		audi.setMake("Audi");
		audi.setModel("2017");
		audi.setName("Q5");
		
		
		System.out.println("Audi details as below -");
		System.out.println("Audi cost = "+audi.getCost());
		System.out.println("Audi make = "+audi.getMake());
		System.out.println("Audi model = "+audi.getModel());
		System.out.println("Audi name = "+audi.getName());
		
		
		Car toyota = new Car();
		toyota.setCost(40000);
		toyota.setMake("Toyota");
		toyota.setModel("2016");
		toyota.setName("RAV4");
		
		
		System.out.println("Toyota details as below -");
		System.out.println("Toyota cost = "+toyota.getCost());
		System.out.println("Toyota make = "+toyota.getMake());
		System.out.println("Toyota model = "+toyota.getModel());
		System.out.println("Toyota name = "+toyota.getName());
		
		Car honda = new Car();
		honda.setCost(45000);
		honda.setMake("Honda");
		honda.setModel("2012");
		honda.setName("Pilot");
		
		
		System.out.println("Honda details as below -");
		System.out.println("Honda cost = "+honda.getCost());
		System.out.println("Honda make = "+honda.getMake());
		System.out.println("Honda model = "+honda.getModel());
		System.out.println("Honda name = "+honda.getName());
		
		/*
		 * System.out.println("Audi Mileage = "+audi.driveMileage("audi"));
		 * System.out.println("Toyota Mileage = "+toyota.driveMileage("toyota"));
		 * System.out.println("Honda Mileage = "+honda.driveMileage("Honda"));
		 */
	}

	
}
