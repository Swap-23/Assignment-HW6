import java.io.*;

public class ImplementStock 
{	
	static void displayAscending(StockHolding array[])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=1;j<array.length;j++)
			{
				if(array[j].companyName.compareTo(array[j-1].companyName)<0)
				{
					StockHolding temp;
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
		System.out.println("Display Stock in Ascending Order by Name");
		for(int i=0; i<array.length; i++)
		{
			System.out.println("Company Name : "+array[i].companyName);
			System.out.println("Purchase Share Price : "+array[i].purchaseSharePrice);
			System.out.println("Current Share Price : "+array[i].currentSharePrice);
			System.out.println("Number of Shares : "+array[i].numberOfShares);
			System.out.println();
		}
	}
	
	//display foreign stock in descending order
	static void displayDescending(ForeignStockHolding array[])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=1;j<array.length;j++)
			{
				if(array[j].companyName.compareTo(array[j-1].companyName)>0)
				{
					ForeignStockHolding temp;
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
		System.out.println("Display Stock in Descending Order by Name");
		for(int i=0; i<array.length; i++)
		{
			System.out.println("Company Name : "+array[i].companyName);
			System.out.println("Purchase Share Price : "+array[i].purchaseSharePrice);
			System.out.println("Current Share Price : "+array[i].currentSharePrice);
			System.out.println("Number of Shares : "+array[i].numberOfShares);
			System.out.println("Conversion Rate: "+ array[i].conversionFactor);
			System.out.println();
		}
	}
	
	static void displayMinValue (ForeignStockHolding array[])
	{
		//temp object of Foreign stock holding for minimum value 
		ForeignStockHolding temp = array[0];		
		
		for(int i=0;i<array.length;i++)
		{
			if(temp.valueInDollars() > array[i].valueInDollars())
			{
				temp = array[i];
			}
		}
		System.out.println("Minimum Value of Stock: ");
		System.out.println("Company Name : "+temp.companyName);
		System.out.println("Purchase Share Price : "+temp.purchaseSharePrice);
		System.out.println("Current Share Price : "+temp.currentSharePrice);
		System.out.println("Number of Shares : "+temp.numberOfShares);
		System.out.println("Conversion Rate: "+ temp.conversionFactor);
		System.out.println();
	}
	static void displayMaxValue(ForeignStockHolding array[])
	{
		//temporary object of Foreign stock holding for max profitable stock 
		ForeignStockHolding temp = array[0];		
		
		for(int i=0;i<array.length;i++)
		{
			if((temp.valueInDollars()-temp.costInDollars()) < (array[i].valueInDollars()-temp.costInDollars()))
			{
				temp = array[i];
			}
		}
		System.out.println("Maximum Profitable Stock: ");
		System.out.println("Company Name : "+temp.companyName);
		System.out.println("Purchase Share Price : "+temp.purchaseSharePrice);
		System.out.println("Current Share Price : "+temp.currentSharePrice);
		System.out.println("Number of Shares : "+temp.numberOfShares);
		System.out.println("Conversion Rate: "+ temp.conversionFactor);
		System.out.println();
	}
	
	static void displayMinProfitable(ForeignStockHolding array[])
	{
		//temporary object of Foreign stock holding for minimum profitable stock 
		ForeignStockHolding temp = array[0];		
		
		for(int i=0;i<array.length;i++)
		{
			if((temp.valueInDollars()-temp.costInDollars()) > (array[i].valueInDollars()-temp.costInDollars()))
			{
				temp = array[i];
			}
		}
		System.out.println("Minimum Profitable Stock: ");
		System.out.println("Company Name : "+temp.companyName);
		System.out.println("Purchase Share Price : "+temp.purchaseSharePrice);
		System.out.println("Current Share Price : "+temp.currentSharePrice);
		System.out.println("Number of Shares : "+temp.numberOfShares);
		System.out.println("Conversion Rate: "+ temp.conversionFactor);
		System.out.println();
	}
	
	static void displayMaxProfitable(ForeignStockHolding array[])
	{
		//temporary object of Foreign stock holding for max profitable stock 
		ForeignStockHolding temp = array[0];		
		
		for(int i=0;i<array.length;i++)
		{
			if((temp.valueInDollars()-temp.costInDollars()) < (array[i].valueInDollars()-temp.costInDollars()))
			{
				temp = array[i];
			}
		}
		System.out.println("Maximum Profitable Stock: ");
		System.out.println("Company Name : "+temp.companyName);
		System.out.println("Purchase Share Price : "+temp.purchaseSharePrice);
		System.out.println("Current Share Price : "+temp.currentSharePrice);
		System.out.println("Number of Shares : "+temp.numberOfShares);
		System.out.println("Conversion Rate: "+ temp.conversionFactor);
		System.out.println();
	}
	

	static void displayAscending(ForeignStockHolding array[])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=1;j<array.length;j++)
			{
				if(array[j].companyName.compareTo(array[j-1].companyName)<0)
				{
					ForeignStockHolding temp;
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
	//print ascending order by company name
		System.out.println("Display Stock in Ascending Order by Name");
		for(int i=0; i<array.length; i++)
		{
			System.out.println("Company Name : "+array[i].companyName);
			System.out.println("Purchase Share Price : "+array[i].purchaseSharePrice);
			System.out.println("Current Share Price : "+array[i].currentSharePrice);
			System.out.println("Number of Shares : "+array[i].numberOfShares);
			System.out.println("Conversion Rate: "+ array[i].conversionFactor);
			System.out.println();
		}
	}
	
	
	static void displayInSortedValueOrder(ForeignStockHolding array[])

	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=1;j<array.length;j++)
			{
				if(array[j].valueInDollars() < array[j-1].valueInDollars())
				{
					ForeignStockHolding temp;
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
	//print ascending order 
		System.out.println("Display Stock in Ascending Order by value");
		for(int i=0; i<array.length; i++)
		{
			System.out.println("Company Name : "+array[i].companyName);
			System.out.println("Purchase Share Price : "+array[i].purchaseSharePrice);
			System.out.println("Current Share Price : "+array[i].currentSharePrice);
			System.out.println("Number of Shares : "+array[i].numberOfShares);
			System.out.println("Conversion Rate: "+ array[i].conversionFactor);
			System.out.println();
		}
	}
	
	
	public static void main(String[] args)throws IOException 
	{
		//Array of StockHolding class
		StockHolding stockHoldingArray[] = new StockHolding[3];
		
		stockHoldingArray[0] = new StockHolding(2.30f, 4.50f, 40, "XYZ limited");
		stockHoldingArray[1] = new StockHolding(12.19f, 10.56f, 90, "ABC Pvt Limited");
		stockHoldingArray[2] = new StockHolding(45.10f, 49.51f, 210, "United States Limited");
		
		//Display in Ascending order
		displayAscending(stockHoldingArray);
		
		//Array of ForeignStockHolding
		ForeignStockHolding [] 	foreignStockHolding = new ForeignStockHolding[3];
		
		foreignStockHolding[0] = new ForeignStockHolding(2.30f, 4.50f, 40, "XYZ limited", 0.94f);
		foreignStockHolding[1] = new ForeignStockHolding(12.19f, 10.56f, 90, "ABC Pvt Limited", 1.10f);
		foreignStockHolding[2] = new ForeignStockHolding(45.10f, 49.51f, 210, "United States Limited", 1.25f);
		
		//Display in descending order
		displayDescending(foreignStockHolding);
		
		BufferedReader BR_Object=new BufferedReader(new InputStreamReader(System.in));
		int noOfStocks;
		System.out.println("Enter no of Stock less than 9");
		noOfStocks = Integer.parseInt(BR_Object.readLine());
		
		//Array according to user requirements
		ForeignStockHolding userStockHolding[] = new ForeignStockHolding[noOfStocks];
	
		float purchareprice, currentprice, conv_rate = 0.0f;
		int nos;
		String name;
		
		for(int i=0; i < noOfStocks; i++)
		{
			System.out.println("Enter details for Stock "+(i+1)+" : ");
			System.out.print("Enter Purchase Rate : ");
			purchareprice = Float.parseFloat(BR_Object.readLine());
			System.out.print("Enter Current Rate : ");
			currentprice= Float.parseFloat(BR_Object.readLine());
			System.out.print("Enter no of Shares : ");
			nos = Integer.parseInt(BR_Object.readLine());
			System.out.print("Enter Company Name : ");
			name = BR_Object.readLine();
			
			char typeOfStock;
			System.out.println("1. Enter 'S' for Stock Holding \n2. Enter 'F' for Foreign Stock Holding");
			typeOfStock =(char)BR_Object.read();
			String S1=BR_Object.readLine();
		
			//If stock is of StockHolding then conversion rate is 1 else we take input from user
			if(typeOfStock == 'S')
			{
				conv_rate = 1.0f;
			}
			if(typeOfStock == 'F')
			{
				System.out.print("Enter the conversion rate for Foreign Stock : ");
				conv_rate = Float.parseFloat(BR_Object.readLine());	
			}
			
			//initialize the stock type as per user requirement
			userStockHolding[i] = new ForeignStockHolding(purchareprice, currentprice, nos, name, conv_rate);
		    System.out.println("\n");
		}
		
		int c;
			System.out.println("1) Display stock information with the lowest value\n" + 
					"2) Display stock with the highest value\n" + 
					"3) Display the most profitable stock\n" + 
					"4) Display the least profitable stock\n" + 
					"5) List all stocks sorted by company name (A-Z)\n" + 
					"6) List all stocks sorted from the lowest value to the highest value\n" + 
					"7) Exit\n"+
				    "Enter your choice : ");
		
		//variable for choice
		c = Integer.parseInt(BR_Object.readLine());
		
		switch(c)
		{
		case 1 :{
			displayMinValue(userStockHolding);
			break;
		}
		case 2 : {
			displayMaxValue(userStockHolding);
			break;
		}
		case 3 :{
			displayMaxProfitable(userStockHolding);
			break;
		}
		case 4 : {
			displayMinProfitable(userStockHolding);
			break;
		}
		case 5 : {
			displayAscending(userStockHolding);
			break;
		}
		case 6 :{
			displayInSortedValueOrder(userStockHolding);
			break;
		}
	   // default : { System.out.println("Wrong choice.\nEnter your choice : ");
	    //           choice = Integer.parseInt(BR_Object.readLine());
	    }
	                
	    }
		}
	
				


