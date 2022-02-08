class MovieHub{
 
 static int totalTickets = 600;
 static String movies[] = {"GGVV","DJ","Pushpa","RRR"};
 static int ticketPrice = 200;
 static String snacks[] = {"samosa","Pop corn","Juice"};
 static int totalSnacksPrice = 500;
 static int noOfSnacks ;
 static int snackPrice = 50 ;
 static int totalSnacks = 100;
 
 
 
  public static double showTime(int noOfTickets , String movieName , String bookedBy ){
  
    double totalPrice = 0.0 ;
    System.out.println("invoked showTime()");
    System.out.println("arg 1 : No of Tickets :" + noOfTickets);
    System.out.println("arg 2 : Movie Name is :" + movieName);
    System.out.println("arg 3 : Booked By :" + bookedBy);
    
    for(int index = 0; index <= movies.length ; index++){
    	
    	String movie = movies[index];
    	 if(movieName.equals(movie)){
    	 	 System.out.println("movie name matched");
    	 	 
    	 	 if(noOfTickets<= totalTickets){
    	 	 	     System.out.println("no of tickets :" + noOfTickets);
    	 	 	     totalTickets = totalTickets - noOfTickets ;
    	 	 	     System.out.println("The total Tickets Remaining" + totalTickets);
    	 	 	      totalPrice = noOfTickets * ticketPrice ;
    	 	 	      System.out.println("The total Price is:" + totalPrice);
    	 	 }
    	 	 else{
    	 	 	       System.out.println("Ist ticket illa");
    	 	 }
    	 }
    	 else{
    	 	System.out.println("Movie name not found");
    	}
    	 	
    	 	break;
    }
    
    return totalPrice;
    
  }
 


 public static double snackPrice(int noOfSnacks, String snackName, boolean selfService){
 	
 	double totalSnackPrice = 0.0 ;
    System.out.println("invoked buy()");
    System.out.println("arg 1 : Quantity of Snacks :" + noOfSnacks);
    System.out.println("arg 2 : Snack Name is :" + snackName);
    System.out.println("arg 3 : Is SelfService :" + selfService);
    if(selfService==false){
    	System.out.println("Don't Worry Self Service is not there");
    	 }
    	 else{
    	 	  System.out.println("Only Self Service");
    	 }
    	 
  for(int index = 0; index <= snacks.length ; index++){
    	
    	String snack = snacks[index];
    	 if(snackName.equals(snack)){
    	 	 System.out.println("snack name matched");
    	 	 if(noOfSnacks<= totalSnacks){
    	 	 	     System.out.println("no of snacks :" + noOfSnacks);
    	 	 	     totalSnacks = totalSnacks - noOfSnacks ;
    	 	 	     System.out.println("The total Tickets Remaining" + totalSnacks);
    	 	 	      totalSnackPrice = noOfSnacks * snackPrice ;
    	 	 	      System.out.println("The total Price is:" + totalSnackPrice);
    	 	 }
    	 	 else{
    	 	 	       System.out.println("Ist snacks illa");
    	 	 }
    	 }
    	 else{
    	 	System.out.println("Snack name not found");
    	}
    	 	
    	 	break;
    }
    
    return totalSnackPrice;
    
  }
 
}
    	 	 