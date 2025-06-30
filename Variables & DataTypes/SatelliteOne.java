class SatelliteOne{
   static int satelliteId;
   static int orbitLevel;
   static int altitudeKm ;
   static int speedKmph ;
   static int weightKg ;
   static int signalStrength;
   static int transmissionRate ;
   static int  batteryLevel; 
   static int temperatureCelsius ;
   static int missionDuration ;
   static String satelliteName ;
   static String missionName ;
   static String orbitType;
   static String  launchVehicle ;
   static String manufacturer ;
   static String missionStatus ;
   static String communicationStatus ;
   static String payloadType ;
   static String controlCenter ;
   static String launchDate ;
   
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
   
   
     satelliteId=101;
     orbitLevel = 3;
     altitudeKm = 35786;
     speedKmph = 28000;
     weightKg = 2500;
     signalStrength = 85;
     transmissionRate = 100;
     batteryLevel = 92;
     temperatureCelsius = -40;
     missionDuration = 365;
     satelliteName = "INSAT-4A";
     missionName = "Gaganyaan Pathfinder";
     orbitType = "Geostationary";
     launchVehicle = "GSLV Mk II";
     manufacturer = "ISRO";
     missionStatus = "Active";
     communicationStatus = "Online";
     payloadType = "Telecommunication";
     controlCenter = "Bangalore Ground Control";
     launchDate = "2023-12-15";
   
   
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