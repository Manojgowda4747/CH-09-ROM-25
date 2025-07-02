class StockMarketOne{


static String nse = "NSE";
static String bse = "BSE";
static String nyse = "NYSE";
static String nasdaq = "NASDAQ";
static String ftse = "FTSE";
static String dax = "DAX";
static String nikkei = "Nikkei";
static String hangSeng = "Hang Seng";
static String shanghai = "Shanghai";
static String asx = "ASX";

static String stockNames[] = {nse, bse, nyse, nasdaq, ftse,dax, nikkei, hangSeng, shanghai, asx};
   
   public static void main(String Range[]){
   
   System.out.println("stockNames are");
    
	 for( String stockName :   stockNames){
		 
		 System.out.println(stockName);
   }
}


}