import java.util.Scanner;
public class ProceduralFinal {

	public static void main(String[] args) {
		Scanner Input = new Scanner (System.in);
		
		System.out.println("Hello!");
		System.out.println("Welcome to Java Coffee!");
		System.out.println();
		
		String [] Hot = new String [] {"Cappuccino    ","Spanish Latte    ", "Mocha             ", "Flat White    ","Cinnamon Coffee    ","Exit           "};
		double [] priceHot = new double[]{2.50 , 3.50 , 4.0 , 3.0 , 3.50 , 0};
		
		String [] Cold = new String [] {"Ice Latte       ","Cold Brew      ","Peach Ice Tea  ","Strawberry Ice Tea ","Milkshake          ", "Exit          "};
		double [] priceCold = new double[]{4.50 , 3.50 , 4.0 , 4.0 , 4.50 , 0};
		
		
		String [] Snacks = new String [] {"Turkey Sandwich    ","Chicken Sandwich    ","Veggie Pizaa    ","Ceasar Salad   ","Fries           ","Exit            "};
		double [] priceSnacks = new double[]{3.50 , 3.75 , 4.0 , 3.0 , 1.50 , 0};
		
		String [] Dessert = new String [] {"Cheesecake    ","Brownie       ","Red Velvet Cake    ","Carrot Cake    ","Chocolatee Cookies","Exit                "};
		double [] priceDessert = new double [] {3.0 , 1.0 ,2.50 , 2.50 , 1.0 , 0};
		 
		int quantityHot [] = new int [6];
		int quantityCold [] = new int [6];
		int quantitySnacks[] = new int [6];
		int quantityDessert [] = new int [6];
		int sumHot = 0 ,sumCold = 0,sumSnacks = 0,sumDessert = 0;
		int total = 0;
		
	
		System.out.println("Please choose items from the HOT DRINKS menu :)");
        System.out.println("HOT DRINKS "+"\t\t\tPrice");
        for(int i = 0; i < 6; i++) {
        System.out.println((i + 1)+ "." + Hot[i] + "\t\t" + priceHot[i]);
        }
        	int choiceHot = Input.nextInt();
        	if (choiceHot > 0 && choiceHot < 6) {
        		System.out.println("Enter the amount of "+Hot[choiceHot - 1]);
        	    int amount = Input.nextInt();
        	    quantityHot[choiceHot - 1]+= amount;//adding the value of amount to the element at the index choice-1 in the array and updating the value at that index with the result.
        	}
        	
        System.out.println();
        
        System.out.println("Please choose items from the COLD DRINKS menu :)");
        System.out.println("COLD DRINKS"+"\t\t\tPrice");
        for(int i = 0;i < 6; i++) {
        System.out.println((i + 1)+ "." + Cold[i] + "\t\t" +priceCold[i]);
        }
        	int choiceCold = Input.nextInt();
        	if (choiceCold > 0 && choiceCold < 6) {
        		System.out.println("Enter the amount of " +Cold[choiceCold - 1]);
        		int amount = Input.nextInt();
        		quantityCold[choiceCold - 1]+= amount;
    	}
    	
        	
        System.out.println();
            
        System.out.println("Please choose items from the SNACKS menu :)");
        System.out.println("SNACKS     "+"\t\t\tPrice");
        for(int i = 0;i < 6; i++) {
        System.out.println((i + 1) + "." + Snacks[i] + "\t\t" + priceSnacks[i]);
        }
        	int choiceSnacks = Input.nextInt();
        	if (choiceSnacks > 0 && choiceSnacks < 6) {
        		System.out.println("Enter the amount of "+Snacks[choiceSnacks - 1]);
        		int amount = Input.nextInt();
        		quantitySnacks[choiceSnacks - 1]+= amount;
    	}

            
        System.out.println();
        
        
        System.out.println("Please choose items from the DESSERT menu :)");
        System.out.println("DESSERT    "+"\t\t\tPrice");
        for(int i = 0;i < 6; i++) {
        System.out.println((i + 1)+ "." + Dessert[i] + "\t\t" + priceDessert[i]); 
		}
        	int choiceDessert = Input.nextInt();
        	if(choiceDessert > 0 && choiceDessert < 6) {
        		System.out.println("Enter the amount of "+Dessert[choiceDessert - 1]);
        		int amount = Input.nextInt();
        		quantityDessert[choiceDessert - 1]+= amount;
    	}
    	
    	System.out.println("Order Confirmation:\n");
    	
    	for(int i = 0; i < 6; i++) {
    		if(quantityHot[i]!= 0) {
	             sumHot += quantityHot[i]*priceHot[i];
	             System.out.println(Hot[i]+ " * " + quantityHot[i] + " ="  +quantityHot[i]*priceHot[i]+" JDs");
	             
	        }
    	}
		    
    	for(int i = 0; i < 6; i++) {
	        if(quantityCold[i]!= 0) {
	            sumCold += quantityCold[i]*priceCold[i];
	            System.out.println(Cold[i]+" * "+quantityCold[i]+" ="+quantityCold[i]*priceCold[i]+" JDs");
	              
	        }
    	}
		    
    	for(int i = 0; i < 6; i++) {
    		if(quantitySnacks[i]!= 0) {
    			 sumHot += quantitySnacks[i]*priceSnacks[i];
	             System.out.println(Snacks[i]+" * "+quantitySnacks[i]+" ="+quantitySnacks[i]*priceSnacks[i]+" JDs");
	             
	        }
    	}	
		    
		for(int i = 0; i < 6; i++) {
	         if(quantityDessert[i]!= 0) {
	             sumHot += quantityDessert[i]*priceDessert[i];
	           	 System.out.println(Dessert[i]+" * "+quantityDessert[i]+" ="+quantityDessert[i]*priceDessert[i]+" JDs");
	             
	        }
	   }
		    
	  
	  
	   System.out.println("Would you like to split the bill?ENTER 1 for yes and 0 for no");
	   int answer = Input.nextInt();
	   System.out.println();
	   
	   total = sumHot + sumCold + sumSnacks +sumDessert;
	   
       if (answer == 1) {
    	   System.out.println("How many people will you split the bill with?");
    	   int people = Input.nextInt();
    	   		try {
    	   			total = total / people;
    	   			System.out.println("Your total bill = "+total);
    	   			System.out.println("Thank you!Enjoy!");}
    	   		catch (ArithmeticException e) {
    		   System.err.println(e.getMessage());
    	   		}finally {
        	   System.out.println("end of try/catch code");
    	   		}
       }
       else if (answer == 0){
    	   System.out.println("Your total bill = "+total);
    	   System.out.println("Thank you!Enjoy!");
            
       }
    
	}
      
}
	
