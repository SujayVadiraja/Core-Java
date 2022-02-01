class Speaker{
	static String speakerName = "boat";
	static int maxVolume = 6;
	static int minVolume;
	static int currentVolume;
	static boolean isConnected;
	
	
	public static void onOrOff(){
		System.out.println("invoked onOrOff");
		if(isConnected == false){
		System.out.println("Speaker is turned On");
		isConnected = true;

		}
	else if(isConnected == true){
		System.out.println("Speaker is turned off");
		isConnected = false;
	}
	System.out.println("onOrOff() ended");
	}
	public static void currentVolume(){
		System.out.println("invoked increaseVolume()");
		if(isConnected==true){
			System.out.println("Speaker is turned on");
			if(currentVolume<maxVolume){
				currentVolume = currentVolume+1;
				System.out.println("The currentVolume is:"+currentVolume);
			}
			else{
				System.out.println("Max volume reached");
			}
		}
		else{
			System.out.println("Gube Speaker is off...");
		}
		System.out.println("increaseVolume() ended");
	}
	public static void decreaseVolume(){
		System.out.println("invoked decreaseVolume()");
		if(isConnected==true){
			System.out.println("Speaker is turned on");
			if(currentVolume>minVolume){
				currentVolume = currentVolume-1;
				System.out.println("The currentVolume is:"+ currentVolume);
			}
			else{
				System.out.println("Min volume reached");
			}
		}
		else{
			System.out.println("Gube Speaker is off...");
		}
		System.out.println("decreaseVolume() ended");
	}
}