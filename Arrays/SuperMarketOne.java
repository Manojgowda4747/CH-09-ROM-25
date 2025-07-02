
class SuperMarketOne{


static String vanilla = "Vanilla";
static String chocolate = "Chocolate";
static String strawberry = "Strawberry";
static String butterscotch = "Butterscotch";
static String mango = "Mango";
static String blackCurrant = "Black Currant";
static String pistachio = "Pistachio";
static String cookiesAndCream = "Cookies & Cream";
static String caramel = "Caramel";
static String coffee = "Coffee";

static String iceCreams[] = {vanilla, chocolate, strawberry, butterscotch, mango,blackCurrant, pistachio, cookiesAndCream, caramel, coffee};


static String dior = "Dior";
static String chanel = "Chanel";
static String fogg = "Fogg";
static String axe = "Axe";
static String yardley = "Yardley";
static String wildStone = "Wild Stone";
static String parkAvenue = "Park Avenue";
static String engage = "Engage";
static String denver = "Denver";
static String skinn = "Skinn";

static String perfumes[] = {dior, chanel, fogg, axe, yardley,wildStone, parkAvenue, engage, denver, skinn};


static String rice = "Rice";
static String wheatFlour = "Wheat Flour";
static String sugar = "Sugar";
static String salt = "Salt";
static String tea = "Tea";
static String lentils = "Lentils";
static String oil = "Oil";
static String spices = "Spices";
static String soap = "Soap";
static String toothpaste = "Toothpaste";

static String groceries[] = {rice, wheatFlour, sugar, salt, tea,lentils, oil, spices, soap, toothpaste};

static String lipstick = "Lipstick";
static String foundation = "Foundation";
static String faceWash = "Face Wash";
static String moisturizer = "Moisturizer";
static String eyeliner = "Eyeliner";
static String nailPolish = "Nail Polish";
static String blush = "Blush";
static String compact = "Compact";
static String concealer = "Concealer";
static String kajal = "Kajal";

static String cosmetics[] = {lipstick, foundation, faceWash, moisturizer, eyeliner,nailPolish, blush, compact, concealer, kajal};


    public static void main(String things[]){
		
		
	
	System.out.println("the iceCreams are:");
	for( String  iceCream:   iceCreams){
		 
		 System.out.println(iceCream);
   }
	
	System.out.println("the perfumes are:");
	for( String  perfume :   perfumes){
		 
		 System.out.println(perfume);
   }

	System.out.println("the groceries are:");
	for( String  grocerie :   groceries){
		 
		 System.out.println(grocerie);
   }
	
	System.out.println("the cosmetics are:");
	for( String  cosmetic :   cosmetics){
		 
		 System.out.println(cosmetic);
   }





     }







}