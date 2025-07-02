class CityOne{

static int pinCodeOne = 560001;
static int pinCodeTwo = 570001;
static int pinCodeThree = 575001;
static int pinCodeFour = 580020;
static int pinCodeFive = 590001;
static int pinCodeSix = 580001;
static int pinCodeSeven = 577201;
static int pinCodeEight = 572101;
static int pinCodeNine = 583101;
static int pinCodeTen = 577001;
static int pinCodeEleven = 584101;
static int pinCodeTwelve = 576101;
static int pinCodeThirteen = 577101;

static int pinCodes[] = {pinCodeOne, pinCodeTwo, pinCodeThree, pinCodeFour, pinCodeFive,pinCodeSix, pinCodeSeven, pinCodeEight, pinCodeNine, pinCodeTen,pinCodeEleven, pinCodeTwelve, pinCodeThirteen};

   public static void main(String district[]){
	   
    System.out.println("the  pinCodes are");

             for( int  pinCode :   pinCodes){
		 
		            System.out.println(pinCode);
   }

   
   }

}