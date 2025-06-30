class Stadium{
   static  int stadiumId = 101;
   static  int totalSeats = 50000;
   static  int occupiedSeats = 42000;
   static  int availableSeats = totalSeats - occupiedSeats;
   static  int gateCount = 8;
   static  int securityPersonnel = 120;-
   static  int restrooms = 30;
   static  int foodStalls = 45;
   static  int eventDuration = 180;
   static  int eventStartHour = 18;
   static  String stadiumName = "National Arena";
   static  String eventName = "Championship Final";
   static  String homeTeam = "City FC";
   static  String awayTeam = "United FC";
   static  String eventType = "Football Match";
   static  String seatType = "VIP";
   static  String announcerName = "Ravi Malhotra";
   static  String weatherStatus = "Clear";
   static  String entryGate = "Gate 3";
   static  String matchStatus = "In Progress";

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