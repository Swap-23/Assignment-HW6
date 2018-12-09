class StockHolding 
{
	float purchaseSharePrice; 
	float currentSharePrice;
	int numberOfShares;
	String companyName;
	public StockHolding()
	{
		purchaseSharePrice=0.0f;
		currentSharePrice=0.0f;
		numberOfShares=0;
		companyName=null;
	}
	public StockHolding(float a,float b,int c,String n)
	{
		purchaseSharePrice=a;
		currentSharePrice=b;
		numberOfShares=c;
		companyName=n;
	}
	public float getpurchaseSharePrice()
	{
		return purchaseSharePrice;
	}
	public float getcurrentSharePrice()
	{
		return currentSharePrice;
	}
	public int getnumberOfShares()
	{
		return numberOfShares;
	}
	public String getcompanyName()
	{
		return companyName;
	}
	public float costInDollars()
	{
		float costInDollar= purchaseSharePrice * numberOfShares ;
		return costInDollar;
	}
	public float valueInDollars()
	{
		float valueInDollar= currentSharePrice * numberOfShares ;
		return valueInDollar;
	}
}
