class Projector{
    static int brightness=3500;
	static int maxBrightness=5000;
	static int resolutionWidth=1920;
	static int hdmiPorts=2;
	static int currentVolume=20;
static int maxVolume=100;
	static int lampLife=2000;
	static int lampHours=950;
	static int temperature=70;
	static String projectModel="Epson EX3260";
	static String powerMode="Eco";
	static String inputLabel="HDMI 2";
	static String statusMessage="Projector is warming up..";
	static String warningMessage="Replace lamp soon";
	static String resolution="resolutionWidth";
	static String brand="Epson";
	static String currentMode="Presentation";
	static String colorMode="Dynamic";
	static int idleTime=15;
	public static void main(String projector[]){
	System.out.println("The projector brightness is "+brightness);
	System.out.println("The projector maximum brightness is "+maxBrightness);
	System.out.println("The projector resolution width is "+resolutionWidth);
	System.out.println("The projector hdmi ports is "+hdmiPorts);
	System.out.println("The projector current volume is "+currentVolume);
	System.out.println("The maximum volume of the projector is "+maxVolume);
	System.out.println("The life of the lamp is "+lampLife);
    System.out.println("The projector lamp hours is "+lampHours);
	System.out.println("The temperature of the projector is "+temperature);
	System.out.println("The projector model is "+projectModel);
	System.out.println("The power mode of the projector is "+powerMode);
	System.out.println("The input label of the projector is "+inputLabel);
	System.out.println("The status message of the projector is "+statusMessage);
	System.out.println("The warning message of the projector is"+warningMessage);
	System.out.println("The projector resolution is"+resolution);
	System.out.println("The brand of the projector is "+brand);
	System.out.println("The current mode of the projector is"+currentMode);
	System.out.println("The color mode of the projector is "+colorMode);
	System.out.println("The idle time of the projector is"+idleTime);

}
}