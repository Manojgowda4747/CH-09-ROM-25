class ChessGame{
   static int gameId = 1;
   static int playerId = 5003;
   static int piece = 32;
   static int totalLevels = 50;
   static int playerScore = 8;
   static int highScore = 2200;
   static int enemiesDefeated = 200;
   static int healthPoints = 75;
   static int ammoCount = 50;
   static int coinsCollected = 135;
   static int dailyLogins = 3;
   static int onlinePlayers = 500;
   static String gameName = "Chess";
   static String playerName = "ShadowKnight";
   static String gameGenre = "Action RPG";
   static String gameMode = "Multiplayer";
   static String moves = "Different Moves";
   static String gameStatus = "In Progress";
   static String platform = "PC";
   static String characterClass = "Assassin";
   static Boolean isCheck = true;
   
   public static void main(String Games[]){
   
   System.out.println("Unique identifier for a Chess game "+gameId);
   System.out.println(" Unique ID assigned to a player "+playerId);gf
   System.out.println("How many piece in the game "+piece);
   System.out.println("Total levels in the game "+totalLevels);
   System.out.println("Current score of the player "+playerScore);
   System.out.println("All-time high score "+highScore);
   System.out.println(" Number of enemies defeated "+enemiesDefeated);
   System.out.println("Player’s health value out of 100 "+healthPoints);
   System.out.println("Number of bullets or weapon charges "+ammoCount);
   System.out.println("Total in-game currency collected "+coinsCollected);
   System.out.println("Number of times logged in today "+dailyLogins);
   System.out.println(" Number of players currently online "+onlinePlayers);
   System.out.println("Name of the OOOgame "+gameName);
   System.out.println("Player's chosen username "+playerName);
   System.out.println("Genre or category of the game "+gameGenre);
   System.out.println("Game mode: Single-player, Multiplayer, Co-op, etc "+gameMode);
   System.out.println("Games as Different moves  "+moves);
   System.out.println("Status of the current game session "+gameStatus);
   System.out.println("Platform being used: PC, Xbox, PS5, etc "+platform);
   System.out.println("Player's character or class type "+characterClass);
   System.out.println("is give to the check "+ true);
   
   
   }
}