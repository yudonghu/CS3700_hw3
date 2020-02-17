import java.util.*;

public class MatchingOperator implements Runnable{
	static Queue<SOCK> sockQ;
	static int totalSockReceived;
	
	public MatchingOperator() {
		sockQ = new LinkedList<>();
		totalSockReceived = 0;
	}
	
    public void run() {

    	while( main.MakerStillAlive ) {
	    	try {
	    		//System.out.println("Matching did" );
	    		
	
	            	Thread.sleep(1);
	        		//System.out.println("maker check " );
	            	
	            	while(sockQ.size() > 0  ) {
	            		
	            		SOCK tempSock = sockQ.remove();
	            		
	            		while( ! ( tempSock.color.contentEquals(sockQ.peek().color)  )) {
	            			sockQ.add(sockQ.remove());
	            		}
	            		
	            		Washer.pairedQ.add(tempSock);
	            		
	                    System.out.println("Matching Thread: Send "+sockQ.remove().color+" Socks to Washer. Total socks "+ totalSockReceived +". Total inside queue "+ sockQ.size() );
	            		
	            		
	            	}
	    		
	    	}catch(Exception e) {
	    		if(main.MakerStillAlive == false) {
		    		System.out.println("Matching dead" + " " +main.MakerStillAlive );
	    			break;
	    			
	    		}
	    		
	    	}

    	}

    }
}
