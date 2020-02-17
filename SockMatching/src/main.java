
public class main {
	static boolean MakerStillAlive = true; 

	public static void main(String args[]) {
	    
	  //  (new Thread(new SockMaker("red"))).start();
	   // (new Thread(new SockMaker("green"))).start();

		(new Thread(new MatchingOperator())).start();
		(new Thread(new Washer())).start();
		
	    //Thread blue = new Thread( new SockMaker("Blue") ) ;
	    Thread red = new Thread( new SockMaker("Red") ) ;
	   // Thread green = new Thread( new SockMaker("Green") ) ;
	    Thread orange = new Thread( new SockMaker("Orange") ) ;
	    
	    //blue.start();
	    red.start();
	   // green.start();
	    orange.start();
	    
	    //while(blue.isAlive() || red.isAlive() || green.isAlive() || orange.isAlive() ) {
	    while( red.isAlive() ||  orange.isAlive() ) {
	    	MakerStillAlive = true;
	    }
	    		
			//System.out.println("here" + MatchingOperator.sockQ.size() );
	}
}