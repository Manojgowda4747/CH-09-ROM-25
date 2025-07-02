class TourismOne{
	
	
	static String mysore = "Mysore Palace";
	static String hampi = "Hampi";
	static String coorg = "Coorg";
	static String chikmagalur = "Chikmagalur";
	static String gokarna = "Gokarna";
	static String jogFalls= "Jog Falls";
	static String badamiCaves = "Badami Caves";
	static String belur = "Belur";	
	static String halebidu = "Halebidu";
	static String shravanabelagola = "Shravanabelagola";
	static String bandipurNationalPark = "Bandipur National Park";
    static String murudeshwar= "Murudeshwar";
	static String udupi= "Udupi";
	static String nandiHills= "Nandi Hills";
	  

static String touristPlaces [] = {mysore, hampi, coorg, chikmagalur, gokarna, jogFalls, badamiCaves, belur, halebidu, bandipurNationalPark, nandiHills,shravanabelagola, udupi,murudeshwar};


public static void main (String places[]){
	
	 System.out.println("the  touristPlaces are");

for( String  touristPlace :   touristPlaces){
		 
		 System.out.println(touristPlace);
   }



}


}