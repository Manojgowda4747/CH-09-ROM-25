class ShoppingMall{
   static int mallId = 101;
   static int numberOfShops = 120;
   static int customerCount = 4500;
   static int floorCount = 5;
   static int parkingSlots = 800;
   static int occupiedSlots = 675;
   static int shopId = 305;
   static int employeeCount = 750;
   static int dailyFootfall = 10000;
   static int totalSalesToday = 450000;
   static int itemPrice = 1200;
   static int discountPercent = 15;
   static int rating = 4;
   static String mallName = "City Square Mall";
   static String shopName = "Tech World Electronics";
   static String shopCategory = "Electronics";
   static String customerName = "Amit Raj";
   static String paymentStatus = "Paid";
   static String floorName = "Second Floor";
   static String eventToday = "Fashion Sale Expo";
   
   public static void main(String Mall[]){
   
   System.out.println("Unique ID for the shopping mall "+mallId);
   System.out.println(" Total number of shops in the mall "+numberOfShops);
   System.out.println(" Current number of visitors in the mall "+customerCount);
   System.out.println("Number of floors in the mall "+floorCount);
   System.out.println("Total number of parking slots "+parkingSlots);
   System.out.println("Number of parking slots in use "+occupiedSlots);
   System.out.println(" Unique shop identifier "+shopId);
   System.out.println("Number of staff working in the mall "+employeeCount);
   System.out.println("Number of people entering the mall per day "+dailyFootfall);
   System.out.println("Total amount in sales today (currency unit) "+totalSalesToday);
   System.out.println("Price of a specific item "+itemPrice);
   System.out.println("Discount offered on a product "+discountPercent);
   System.out.println(" Shop rating out of 5 "+rating);
   System.out.println(" Name of the shopping mall "+mallName);
   System.out.println(" Name of a particular shop "+shopName);
   System.out.println(" Category/type of the shop "+shopCategory);
   System.out.println("Name of a mall visitor "+customerName);
   System.out.println(" Payment completion status "+paymentStatus);
   System.out.println("Label for the floor "+floorName);
   System.out.println(" Name of the special event being held "+eventToday);
   
   }
}