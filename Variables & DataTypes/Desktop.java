class Desktop{
   static int ramSize=16;
   static int cpuCores=8;
   static int storageCapacity=512;
   static int usbPorts=4;
   static int occupiedUsbPorts=2;
   static int batteryLevel=100;
   static int uptimeHours=5;
   static int cpuUsage=65;
   static int processCount=135;
   static int fanSpeed=1800;
   static String osName="Windows 11 Pro";
   static String userName="admin";
   static String deskTopName="DESKTOP-ABC123";
   static String processOrModel="Intel Core i7-11700k";
   static String manufacturer="Dell";
   static String displayMode="Extended";
   static String systemStatus="Running Smoothly";
   static String storageType="SSD";
   static String antivirusStatus="Up to Date";
   static String taskbarPosition="Bottom";
   
   public static void main(String Desktop[]){
   
   System.out.println("The size of the ram is "+ramSize);
   System.out.println("The cpu coures is "+cpuCores);
   System.out.println("The storage capacity is "+storageCapacity);
   System.out.println("The usb ports in the desktop is "+usbPorts);
   System.out.println("The occupied usb ports in the desktop is "+occupiedUsbPorts);
   System.out.println("The batter level is "+batteryLevel);
   System.out.println("The up time hours is "+uptimeHours);
   System.out.println("The cpu usage in the desktop is "+cpuUsage);
   System.out.println("The process count is "+processCount);
   System.out.println("The fan speed in the desktop is "+fanSpeed);
   System.out.println("The os name is"+osName);
   System.out.println("The user name is"+userName);
   System.out.println("The desktop name is"+deskTopName);
   System.out.println("The process or model of the desktop is "+processOrModel);
   System.out.println("The manufacture company is "+manufacturer);
   System.out.println("The display mode of the desktop is"+displayMode);
   System.out.println("The system status is "+systemStatus);
   System.out.println("The storage type is "+storageType);
   System.out.println("The anti virus status is "+antivirusStatus);
   System.out.println("The task bar position is"+taskbarPosition);
   
   }
}