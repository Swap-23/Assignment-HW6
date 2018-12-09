class ForeignStockHolding extends StockHolding
{
	float conversionFactor;
	public ForeignStockHolding(float a,float b,int c, String n,float d)
	{
		super(a,b,c,n);
		conversionFactor = d;
	}
	public float getconversionFactor()
	{
		return conversionFactor ;
	}
	public float costInDollars()
	{
		float costInDollar= getpurchaseSharePrice() * getnumberOfShares() * conversionFactor ;
		return costInDollar;
	}
	public float valueInDollars()
	{
		float valueInDollar= getcurrentSharePrice() * getnumberOfShares() * conversionFactor ;
		return valueInDollar;
	}
}
