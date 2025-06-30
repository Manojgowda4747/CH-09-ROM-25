class Apartment{
   static int apartmentId = 501;
   static int floorNumber = 3;
   static int totalFloors = 10;
   static int flatNumber = 305;
   static int totalUnits = 60;
   static int occupiedUnits = 52;
   static int monthlyRent = 18000;
   static int maintenanceCharge = 1500;
   static int parkingSlots = 40;
   static int allocatedParking = 35;
   static String apartmentName = "Skyview Residency";
   static String ownerName = "Anjali Mehta";
   static String tenantName = "Rohit Kapoor";
   static String buildingType = "Residential";
   static String flatStatus = "Occupied";
   static String rentStatus = "Paid";
   static String complaintType = "Leaking Faucet";
   static String visitorName = "Neha Verma";
   static String  entryTime = "10:15 AM";
   static String parkingStatus = "Reserved";	
   
   public static void main(String Police[]){
   
   System.out.println("Unique ID for the apartment "+apartmentId);
   System.out.println("Floor where the apartment is located "+floorNumber);
   System.out.println("Total number of floors in the building "+totalFloors);
   System.out.println("Flat/unit number "+flatNumber);
   System.out.println("Total number of apartment units "+totalUnits);
   System.out.println("Units currently occupied "+occupiedUnits);
   System.out.println("Monthly rent amount in local currency "+monthlyRent);
   System.out.println("Monthly maintenance fee "+maintenanceCharge);
   System.out.println("Total available parking spots "+parkingSlots);
   System.out.println("Number of allocated parking slots "+allocatedParking);
   System.out.println("Name of the apartment complex "+apartmentName);
   System.out.println("Owner of the flat "+ownerName);
   System.out.println("Name of the tenant "+tenantName);
   System.out.println("Type of property (Residential, Commercial)"+buildingType);
   System.out.println("Status of the unit "+flatStatus);
   System.out.println(" Rent payment status "+rentStatus);
   System.out.println("Nature of maintenance complaint "+complaintType);
   System.out.println("Name of the guest/visitor "+visitorName);
   System.out.println(" Visitor or staff entry time "+entryTime);
   System.out.println("Status of parking (Available, Reserved) "+parkingStatus);
   
   }
}