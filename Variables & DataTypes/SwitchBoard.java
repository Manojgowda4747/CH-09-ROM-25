class SwitchBoard{
   static int switchNumber=2;
   static int maxSwitches=10;
   static int defaultChannel=1;
   static int timeOut=30;
   static int voltageLevel=220;
   static String switchLabel="Power";
   static String command="Start";
   static String status="Online";
   static String userInput="Switch3";
   static String logEntry="Switch 3 activated";
   static int signalStrength=85;
   static int activeChannel=2;
   static int emergencyCode=991;
   static int retryCount=0;
   static String defaultMessage="Awaiting command...";
   static String alertMessage="System Overload detected....";
   static String switchType="Toggle";
 
   public static void main(String Switch[]){
   
   System.out.println("The number of the switch number is "+switchNumber);
   System.out.println("The maximum switches in the switch number is "+maxSwitches);
   System.out.println("The default channel in switch number is "+defaultChannel);
   System.out.println("The switch board time out is "+timeOut);
   System.out.println("The voltage level in switch board is "+voltageLevel);
   System.out.println("The label in the switch board is "+switchLabel);
   System.out.println("The command of the switch board is "+command);
   System.out.println("The status of the switch board is "+status);
   System.out.println("The input from the user is switch board is "+userInput);
   System.out.println("The log entry of the switch board is "+logEntry);
   System.out.println("The signal strenght is "+signalStrength);
   System.out.println("The active channel in switch board is "+activeChannel);
   System.out.println("The emergency code in the switch board is "+emergencyCode);
   System.out.println("The retry count in the switch board is "+retryCount);
   System.out.println("The default message in switch board is "+defaultMessage);
   System.out.println("The alert message in switch board is "+alertMessage);
   System.out.println("The switch type in switch board is "+switchType);
   
   
   
   
   
   }



}