class StadiumOne{
   static  int stadiumId ;
   static  int totalSeats ;
   static  int occupiedSeats ;
   static  int availableSeats ;
   static  int gateCount ;
   static  int securityPersonnel ;
   static  int restrooms ;
   static  int foodStalls ;
   static  int eventDuration ;
   static  int eventStartHour ;
   static  String stadiumName ;
   static  String eventName ;
   static  String homeTeam ;
   static  String awayTeam ;
   static   String eventType ;
   static  String seatType ;
   static  String announcerName ;
   static  String weatherStatus ;
   static  String entryGate ;
   static  String matchStatus ;
   
   
   public static void main(String Stadium[]){
   
   
   System.out.println("Unique ID for the stadium."+stadiumId);
   System.out.println("Total seating capacity"+totalSeats);
   System.out.println(" Number of seats currently filled "+occupiedSeats);
   System.out.println("Calculate how many seats are left "+availableSeats);
   System.out.println("Number of gates for entry/exit "+gateCount);
   System.out.println("Number of security staff on duty "+securityPersonnel);
   System.out.println(" Total restrooms in the stadium "+restrooms);
   System.out.println(" Number of food stalls open "+foodStalls);
   System.out.println("Event duration in minutes "+eventDuration);
   System.out.println("Start time in 24-hour format "+eventStartHour);
   System.out.println("Name of the stadium. "+stadiumName);
   System.out.println(" Name of the current event "+eventName);
   System.out.println("Name of the home team "+homeTeam);
   System.out.println("Name of the visiting team "+awayTeam);
   System.out.println("Type of event taking place."+eventType);
   System.out.println(" Seat category: Regular, VIP, Box, etc. "+seatType);
   System.out.println(" Name of the event announcer "+announcerName);
   System.out.println(" Current weather condition at stadium. "+weatherStatus);
   System.out.println("Designated gate for a section "+entryGate);
   System.out.println("Real-time status of the match "+matchStatus);
   
   
      stadiumId = 101;
      totalSeats = 50000;
      occupiedSeats = 42000;
      availableSeats = totalSeats - occupiedSeats;
      gateCount = 8;
      securityPersonnel = 120;
      restrooms = 30;
      foodStalls = 45;
      eventDuration = 180;
      eventStartHour = 18;
      stadiumName = "National Arena";
      eventName = "Championship Final";
      homeTeam = "City FC";
      awayTeam = "United FC";
       eventType = "Football Match";
      seatType = "VIP";
      announcerName = "Ravi Malhotra";
      weatherStatus = "Clear";
      entryGate = "Gate 3";
      matchStatus = "In Progress";
	  
	System.out.println("Unique ID for the stadium."+stadiumId);
   System.out.println("Total seating capacity"+totalSeats);
   System.out.println(" Number of seats currently filled "+occupiedSeats);
   System.out.println("Calculate how many seats are left "+availableSeats);
   System.out.println("Number of gates for entry/exit "+gateCount);
   System.out.println("Number of security staff on duty "+securityPersonnel);
   System.out.println(" Total restrooms in the stadium "+restrooms);
   System.out.println(" Number of food stalls open "+foodStalls);
   System.out.println("Event duration in minutes "+eventDuration);
   System.out.println("Start time in 24-hour format "+eventStartHour);
   System.out.println("Name of the stadium. "+stadiumName);
   System.out.println(" Name of the current event "+eventName);
   System.out.println("Name of the home team "+homeTeam);
   System.out.println("Name of the visiting team "+awayTeam);
   System.out.println("Type of event taking place."+eventType);
   System.out.println(" Seat category: Regular, VIP, Box, etc. "+seatType);
   System.out.println(" Name of the event announcer "+announcerName);
   System.out.println(" Current weather condition at stadium. "+weatherStatus);
   System.out.println("Designated gate for a section "+entryGate);
   System.out.println("Real-time status of the match "+matchStatus);
   
   }
}