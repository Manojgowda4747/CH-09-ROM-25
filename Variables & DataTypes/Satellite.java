class Satellite{
   static int satelliteId=101;
   static int orbitLevel = 3;
   static int altitudeKm = 35786;
   static int speedKmph = 28000;
   static int weightKg = 2500;
   static int signalStrength = 85;
   static int transmissionRate = 100;
   static int  batteryLevel = 92;
   static int temperatureCelsius = -40;
   static int missionDuration = 365;
   static String satelliteName = "INSAT-4A";
   static String missionName = "Gaganyaan Pathfinder";
   static String orbitType = "Geostationary";
   static String  launchVehicle = "GSLV Mk II";
   static String manufacturer = "ISRO";
   static String missionStatus = "Active";
   static String communicationStatus = "Online";
   static String payloadType = "Telecommunication";
   static String controlCenter = "Bangalore Ground Control";
   static String launchDate = "2023-12-15";
   
   public static void main(String Police[]){
   
   System.out.println("Unique ID for the satellite "+satelliteId);
   System.out.println("Orbit level (LEO = 1, MEO = 2, GEO = 3)"+orbitLevel);
   System.out.println("Altitude of the satellite in kilometers "+altitudeKm);
   System.out.println("Speed in kilometers per hour "+speedKmph);
   System.out.println("Weight of the satellite "+weightKg);
   System.out.println("Signal strength in percentage "+signalStrength);
   System.out.println(" Data transmission rate in Mbps"+transmissionRate);
   System.out.println("Battery level of the satellite "+batteryLevel);
   System.out.println("Temperature in space in Celsius "+temperatureCelsius);
   System.out.println("Mission duration in days "+missionDuration);
   System.out.println("Name of the satellite "+satelliteName);
   System.out.println(" Name of the mission "+missionName);
   System.out.println("Type of orbit (LEO, MEO, GEO, Polar) "+orbitType);
   System.out.println(" Name of the rocket used for launch "+launchVehicle);
   System.out.println("Organization that built the satellite "+manufacturer);
   System.out.println("Current mission status "+missionStatus);
   System.out.println("Satellite communication status "+communicationStatus);
   System.out.println("Type of payload onboard "+payloadType);
   System.out.println("Primary monitoring station "+controlCenter);
   System.out.println("Date of satellite launch "+launchDate);
   
   }
}