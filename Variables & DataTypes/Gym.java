class Gym{
   static int memberId=101;
   static int trainerId = 2001;
   static int age = 28;
   static int heightCm = 175;
   static int weightKg = 72;
   static int sessionsPerWeek = 5;
   static int totalMembers = 150;
   static int machinesAvailable = 25;
   static int  treadmills = 6;
   static  int monthlyFee = 1500;
   static  int caloriesBurned = 350;
   static  int workoutDuration = 60;
   static   String memberName = "Rahul Verma";
   static  String membershipType = "Premium";
   static   String trainerName = "Anita Sharma";
   static  String healthStatus = "Good";
   static  String paymentStatus = "Paid";
   static   String lockerStatus = "Occupied";
   static   String equipmentUsed = "Elliptical";
   static  String scheduleTime = "7:00 AM";
   
   public static void main(String Gym[]){
   
   System.out.println(" Unique ID assigned to a gym member "+memberId);
   System.out.println("Unique ID for a gym trainer "+trainerId);
   System.out.println("Member’s age "+age);
   System.out.println("The height is being measured in "+heightCm);
   System.out.println("Member’s weight in kilograms "+weightKg);
   System.out.println("Number of sessions member attends weekly "+sessionsPerWeek);
   System.out.println("otal registered members "+totalMembers);
   System.out.println("Number of available workout machines "+machinesAvailable);
   System.out.println(" Number of treadmills in the gym "+treadmills);
   System.out.println("Monthly membership fee in currency"+monthlyFee);
   System.out.println("Calories burned in a session "+caloriesBurned);
   System.out.println(" Workout duration in minutes "+workoutDuration);
   System.out.println("Member’s full name "+memberName);
   System.out.println("Type of membership "+membershipType);
   System.out.println("Name of the personal trainer "+trainerName);
   System.out.println("General health condition of the member "+healthStatus);
   System.out.println(" Whether the member has paid the fee "+paymentStatus);
   System.out.println("Whether a locker is in use or free "+lockerStatus);
   System.out.println("Equipment used in the session "+equipmentUsed);
   System.out.println(" Scheduled time for the session "+scheduleTime);
   
   }
}