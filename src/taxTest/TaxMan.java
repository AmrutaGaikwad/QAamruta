package taxTest;

import java.util.HashMap;
import java.util.Scanner;

public class TaxMan {
	
	
	/**
	 * CostEstimator : It estimates the cost of an item after adding the tax value
	 * @param item : Name of the item
	 * @param type : luxury/basic
	 * @param cost : price of the item
	 * @return
	 */
	public float costEstimator(String item, String type, float cost){
		
		HashMap<String, Integer> mapping = new HashMap<String, Integer>(); 
		mapping.put("basic", 1);
		mapping.put("luxury", 9);
		
		float itemCost = cost + (mapping.get(type)*cost)/100;
		return itemCost;
		
	}
	
	/**
	 * isValidInput: checks whether the value entered is valid or not
	 * @param value : true/ false
	 * @return
	 */
	public boolean isValidInput(float value)
	{
		if(value <= 0)
		{
			System.out.println("Invalid! Enter a positive value");
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TaxMan obj = new TaxMan();
		float cost;
		boolean isValid;
		String type;
		
		System.out.println("Please enter the name of the item you would like to buy?(shoe,bag etc.)");
		Scanner in = new Scanner(System.in);
		String itemName = in.nextLine();
		
		do{
			System.out.println("Please enter the type (basic or luxury). you will be prompted again if something else is entered?");
			type = in.nextLine();
		}
		while(!(type.equalsIgnoreCase("basic")||type.equalsIgnoreCase("luxury")));
		
		do{
			
			System.out.println("Please enter the cost of the item?");
			cost = in.nextInt();
			isValid = obj.isValidInput(cost); 
		}
		while(!isValid);
		
		float answer = obj.costEstimator(itemName, type, cost);
		
		System.out.println("The total cost of your item including tax is: "+answer+ "cents");
		
		

	}

}
