class TheaterOne{
   static int theaterId ;
   static int totalSeats ;
   static int bookedSeats ;
   static int screenCount ;
   static int showId ;
   static int ticketPrice ;
   static int discountPercent;
   static int showDuration ;
   static String theaterName;
   static String movieTitle;
   static String language;
   static String showTime;
   static String screenType;
   static String customerName ;
   static String seatType ;
   static String bookingStatus ;
   static String paymentMethod ;
   static String staffRole ;
   static String rating ;
   
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
   
    theaterId = 1001;
    totalSeats = 300;
    bookedSeats = 275;
    screenCount = 5;
    showId = 2025;
    ticketPrice = 350;
    discountPercent = 10;
    showDuration = 120;
    theaterName = "CineStar Deluxe";
    movieTitle = "Avengers: Endgame";
    language = "English";
    showTime = "06:30 PM";
    screenType = "IMAX";
    customerName = "Priya Sharma";
    seatType = "Premium";
    bookingStatus = "Confirmed";
    paymentMethod = "Credit Card";
    staffRole = "Projectionist";
    rating = "PG-13"; 
	
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