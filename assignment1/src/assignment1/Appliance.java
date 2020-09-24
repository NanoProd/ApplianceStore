//----------------------------------------------------
//Assignment 1
//Question 1
//Written by: Joshua-James Nantel-Ouimet (#40131733)
//----------------------------------------------------

package assignment1;

public class Appliance {

	//attributes
	private String type;
	private String brand;
	private long serialNumber;
	static long numberOfItems = 1000000;
	private double price;
	
	
	//mutator methods
	public void setType(String type) {
		if(type == "Fridge") {
			this.type = "Fridge";
			}
		else if(type == "Air Conditioner") {
			this.type = "Air Conditioner";
		}
		else if(type == "Washer") {
			this.type = "Washer";
		}
		else if(type == "Dryer") {
			this.type = "Dryer";
		}
		else if(type == "Freezer") {
			this.type = "Freezer";
		}
		else if(type == "Stove") {
			this.type = "Stove";
		}
		else if(type == "Dishwasher") {
			this.type = "Dishwasher";
		}
		else if(type == "Water Heater") {
			this.type = "Water Heater";
		}
		else if(type == "Microwave") {
			this.type = "Microwave";
		}
		else {
			System.out.println("Invalid Type");
		}
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	//accessor methods
	public String getType() {
		return type;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public long getSerialNumber() {
		return serialNumber;
	}
	
	public double getPrice() {
		return price;
	}
	
	
	//constructors
	
	//no default value, object must be created with valid attributes
	public Appliance() {
		System.out.println("Cannot initialize this object, must enter valid values");
	}
	
	public Appliance(String type, String brand, double price) {
		//ensure unique serial number
		this.serialNumber = ++numberOfItems;
		this.brand = brand;
		this.price = price;
		//set valid type, ask if can use setter method to clean up code instead
		if(type == "Fridge") {
			this.type = "Fridge";
			}
		else if(type.equalsIgnoreCase("Air Conditioner")) {
			this.type = "Air Conditioner";
		}
		else if(type.equalsIgnoreCase("Washer")) {
			this.type = "Washer";
		}
		else if(type.equalsIgnoreCase("Dryer")) {
			this.type = "Dryer";
		}
		else if(type.equalsIgnoreCase("Freezer")) {
			this.type = "Freezer";
		}
		else if(type.equalsIgnoreCase("Stove")) {
			this.type = "Stove";
		}
		else if(type.equalsIgnoreCase("Dishwasher")) {
			this.type = "Dishwasher";
		}
		else if(type.equalsIgnoreCase("Water Heater")) {
			this.type = "Water Heater";
		}
		else if(type.equalsIgnoreCase("Microwave")) {
			this.type = "Microwave";
		}
		else {
			System.out.println("Invalid Type");
		}
	}
	
	//copy constructor
	public Appliance(Appliance object){
		this.type = object.type;
		this.brand = object.brand;
		this.serialNumber = ++numberOfItems;
		this.price = object.price;
	}
	
	//toString method
	public String toString() {
		return "Appliance Serial # " + serialNumber +
				"\nBrand: " + brand +
				"\nType: " + type + 
				"\nPrice: " + price + "\n";
	}
	
	//static method to return the number of items
	public static long findNumberOfCreatedAppliances() {
		return (numberOfItems - 1000000);
	}
	
	//equals method
	public boolean equals(Appliance object) {
		return this.type == object.type && 
				this.brand == object.brand &&
				this.price == object.price;
	}
	
	//findAppliancesBy method
	public boolean findAppliancesBy(String brandName) {
		if(this.brand.equalsIgnoreCase(brandName)) {
			return true;
		} else {
			return false;
		}
	}
	
	//findCheaperThan method
	public boolean findCheaperThan(double itemPrice) {
		if(this.price < itemPrice) {
			return true;
		} else {
			return false;
		}
	}
	
}
