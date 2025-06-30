class Theater{
   static int theaterId = 1001;
   static int totalSeats = 300;
   static int bookedSeats = 275;
   static int screenCount = 5;
   static int showId = 2025;
   static int ticketPrice = 350;
   static int discountPercent = 10;
   static int showDuration = 120;
   static String theaterName = "CineStar Deluxe";
   static String movieTitle = "Avengers: Endgame";
   static String language = "English";
   static String showTime = "06:30 PM";
   static String screenType = "IMAX";
   static String customerName = "Priya Sharma";
   static String seatType = "Premium";
   static String bookingStatus = "Confirmed";
   static String paymentMethod = "Credit Card";
   static String staffRole = "Projectionist";
   static String rating = "PG-13";
   
   public static void main(String theater[]){
   
   System.out.println("Unique ID for the theater "+theaterId);
   System.out.println("Total number of seats available "+totalSeats);
   System.out.println("Number of seats currently booked "+bookedSeats);
   System.out.println("Number of screens in a multiplex "+screenCount);
   System.out.println("Unique identifier for a particular show "+showId);
   System.out.println("Price of one ticket "+ticketPrice);
   System.out.println(" Discount on ticket (if applicable) "+discountPercent);
   System.out.println("Show duration in minutes "+showDuration);
   System.out.println("Name of the theater "+theaterName);
   System.out.println("Name of the movie/show playing "+movieTitle);
   System.out.println("Language of the film "+language);
   System.out.println("Scheduled start time of the show "+showTime);
   System.out.println("Type of screen (2D, 3D, IMAX, etc.)"+screenType);
   System.out.println("Name of the ticket holder "+customerName);
   System.out.println("Seat category: Regular, Premium, Recliner, etc "+seatType);
   System.out.println("Status of the ticket reservation "+bookingStatus);
   System.out.println(" Method used for payment "+paymentMethod);
   System.out.println("Employee’s job title "+staffRole);
   System.out.println("Age rating for the movie "+rating);
   
   }
}