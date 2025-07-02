class JiuceShopOne{

static String orange = "Orange";
static String mango = "Mango";
static String apple = "Apple";
static String grape = "Grape";
static String pineapple = "Pineapple";
static String watermelon = "Watermelon";
static String papaya = "Papaya";
static String mosambi = "Mosambi";
static String carrot = "Carrot";
static String pomegranate = "Pomegranate";
static String strawberry = "Strawberry";
static String kiwi = "Kiwi";
static String guava = "Guava";
static String litchi = "Litchi";
static String banana = "Banana";

static String juices[] = {
  orange, mango, apple, grape, pineapple, watermelon, papaya, mosambi,
  carrot, pomegranate, strawberry, kiwi, guava, litchi, banana
};   
   public static void main(String species[]){
	   System.out.println("the  juices are");

for( String  juice :   juices){
		 
		 System.out.println(juice);
   }   
   }
}