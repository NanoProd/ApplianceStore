package assignment1;
//----------------------------------------------------
//Assignment 1
//Question 1
//Written by: Joshua-James Nantel-Ouimet (#40131733)
//			  Samaninder Singh (#40133493)	
//----------------------------------------------------

/**
 * This program allows the user to add and delete appliances, search their
 * inventory for specific types of appliances, brands, price, etc.
 * 
 * @author Joshua-James Nantel-Ouimet
 * @author Samaninder Singh
 * @version 1.0
 */

public class Appliance {
	/**
	 * String value representing the appliance type.
	 */
	private String type;
	/**
	 * String value representing the appliance brand.
	 */
	private String brand;
	/**
	 * Long value representing the appliance's serial number.
	 */
	private long serialNumber;
	/**
	 * Long value representing the number of appliances.
	 */
	static long numberOfItems = 1000000L;
	/**
	 * Double value representing the appliance price.
	 */
	private double price;

	/**
	 * Mutator method to set appliance type.
	 * 
	 * @param type New Type
	 */
	// mutator methods
	public void setType(String type) {
		if (type.equalsIgnoreCase("Fridge")) {
			this.type = "Fridge";
		} else if (type.equalsIgnoreCase("Air Conditioner")) {
			this.type = "Air Conditioner";
		} else if (type.equalsIgnoreCase("Washer")) {
			this.type = "Washer";
		} else if (type.equalsIgnoreCase("Dryer")) {
			this.type = "Dryer";
		} else if (type.equalsIgnoreCase("Freezer")) {
			this.type = "Freezer";
		} else if (type.equalsIgnoreCase("Stove")) {
			this.type = "Stove";
		} else if (type.equalsIgnoreCase("Dishwasher")) {
			this.type = "Dishwasher";
		} else if (type.equalsIgnoreCase("Water Heater")) {
			this.type = "Water Heater";
		} else if (type.equalsIgnoreCase("Microwave")) {
			this.type = "Microwave";
		} else {
			System.out.println("Invalid Type");
		}
	}

	/**
	 * Mutator method to set new brand name
	 * 
	 * @param brand  New brand name
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * Mutator method to set new price 
	 * 
	 * @param price New price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	// accessor methods
	/**
	 * returns type of Appliance
	 * 
	 * @return String 
	 */
	public String getType() {
		return type;
	}

	/**
	 * returns Appliance's brand name
	 * @return String
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * returns Appliance serial number
	 * @return long
	 */
	public long getSerialNumber() {
		return serialNumber;
	}

	/**
	 * returns Appliance price
	 * @return double
	 */
	public double getPrice() {
		return price;
	}

	// constructors

	// no default value, object must be created with valid attributes
	/**
	 * Method to prompt user to add valid attributes for the created object.
	 * Cannot create Appliance object without price, type and brand name. 
	 */
	public Appliance() {
		System.out.println("Cannot initialize this object, must enter valid values");
	}

	/**
	 * 
	 * @param type  is a String value representing the appliance type.
	 * @param brand is a long value representing the appliance's serial number.
	 * @param price is a double value representing the appliance price.
	 */
	public Appliance(String type, String brand, double price) {
		// ensure unique serial number
		this.serialNumber = ++numberOfItems;
		this.brand = brand;
		this.price = price;
		// set valid type, ask if can use setter method to clean up code instead
		if (type.equalsIgnoreCase("Fridge")) {
			this.type = "Fridge";
		} else if (type.equalsIgnoreCase("Air Conditioner")) {
			this.type = "Air Conditioner";
		} else if (type.equalsIgnoreCase("Washer")) {
			this.type = "Washer";
		} else if (type.equalsIgnoreCase("Dryer")) {
			this.type = "Dryer";
		} else if (type.equalsIgnoreCase("Freezer")) {
			this.type = "Freezer";
		} else if (type.equalsIgnoreCase("Stove")) {
			this.type = "Stove";
		} else if (type.equalsIgnoreCase("Dishwasher")) {
			this.type = "Dishwasher";
		} else if (type.equalsIgnoreCase("Water Heater")) {
			this.type = "Water Heater";
		} else if (type.equalsIgnoreCase("Microwave")) {
			this.type = "Microwave";
		} else {
			System.out.println("Invalid Type");
		}
	}

	/**
	 * copy constructor
	 * the new object will not have the same serial number.
	 * different object can have same type, price, and brand but not the same serial number. 
	 * @param object Appliance object
	 */
	public Appliance(Appliance object) {
		this.type = object.type;
		this.brand = object.brand;
		this.serialNumber = ++numberOfItems;
		this.price = object.price;
	}

	/**
	 * toString method
	 * will display all of the Appliance attributes on seperate lines
	 */
	public String toString() {
		return "Appliance Serial # " + serialNumber + "\nBrand: " + brand + "\nType: " + type + "\nPrice: " + price
				+ "\n";
	}

	/**
	 * returns the number of items
	 * @return long 
	 */
	public static long findNumberOfCreatedAppliances() {
		return (numberOfItems - 1000000);
	}

	/**
	 * equals method that compares type, brand, and price.
	 * does not compare serial number.
	 * @param object
	 * @return boolean value according to if the objects are the same or not.
	 */
	// equals method
	public boolean equals(Appliance object) {
		return this.type == object.type && this.brand == object.brand && this.price == object.price;
	}

	/**
	 * this method verifies if two Appliances have the same brand name. 
	 * <p>
	 * If used in a loop that goes through every Appliance in an array, it can find all Appliances under
	 * a certain brand name.  
	 * </p>
	 * @param brandName is a String representing the Brand name you are trying to look for
	 * @return boolean value returns true if brand name of object is the same as the parameter brandName
	 */
	// findAppliancesBy method
	public boolean findAppliancesBy(String brandName) {
		if (this.brand.equalsIgnoreCase(brandName)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *  this method verifies if the price of the calling object is lower than the price of parameter itemPrice
	 * <p>
	 *if used in a loop that goes through every Appliance in an array, it can find all Appliances that have a price lower than parameter itemPrice.
	 * </p>
	 * @param itemPrice Item price
	 * @return boolean value returns true if object price is lower than parameter itemPrice.
	 */
	// findCheaperThan method
	public boolean findCheaperThan(double itemPrice) {
		if (this.price < itemPrice) {
			return true;
		} else {
			return false;
		}
	}

}
