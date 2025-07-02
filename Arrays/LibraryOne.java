class LibraryOne{

static String bhagavathGeeta = "Bhagavathgeeta";
static String wingsOfFire = "Wings Of Fire";
static String ramayana = "Ramayana";
static String ignitedMinds = "Ignited Minds";
static String theSecretOfLeadership = "The Secret of Leadership";
static String youCanWin = "You Can Win";
static String stayHungryStayFoolish = "Stay Hungry Stay Foolish";
static String theHabitOfWinning = "The Habit of Winning";

static String bookNames[] = {bhagavathGeeta, wingsOfFire, ramayana,ignitedMinds,theSecretOfLeadership, youCanWin, stayHungryStayFoolish, theHabitOfWinning};   
   public static void main(String name[]){
   
   System.out.println("bookNames are");

       for( String  bookName  :   bookNames){
		 
		 System.out.println(bookName);

    }
   }
  }