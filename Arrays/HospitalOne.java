class HospitalOne{

static String drDivakar = "Dr. Divakar";
static String drSpoorthi = "Dr. Spoorthi";
static String drPushpavathi = "Dr. Pusphavathi";
static String drLohith = "Dr. Lohith";
static String drAnanthrameGowda = "Dr. AnanthrameGowda";
static String drPrisha = "Dr. Prisha";
static String drAmbaika = "Dr. Ambaika";
static String drManojGowda = "Dr. ManojGowda";
static String drSpandana = "Dr. Spandana";
static String drRagamma = "Dr. Ragamma";

static String doctorNames[] = {drDivakar, drSpoorthi, drPushpavathi, drLohith, drAnanthrameGowda,drPrisha, drAmbaika, drManojGowda, drSpandana, drRagamma};   
   public static void main(String specilist[]){
   
   System.out.println("doctorNames are");
   for( String  doctorName :   doctorNames){
		 
		 System.out.println(doctorName);
   }
}


}