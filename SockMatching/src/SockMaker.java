import java.util.*;

public class SockMaker implements Runnable {
	String color; //sock color that this maker produce
	Random rand = new Random(); // for generating a random total sock amount
	int sockTotalAmount; // total socks this maker will produce
	int sockProduced; // socks this maker has produced
	
	
	public SockMaker(String color) { //constructor
		this.color = color;
		sockTotalAmount = rand.nextInt(100) + 1;
		sockProduced = 0;
	}
	
	public void produceOneSock () { 
		sockProduced++;
		
		MatchingOperator.sockQ.add(new SOCK(this.color));
		MatchingOperator.totalSockReceived++;
	}
	
    public void run() {
    	while(sockProduced < sockTotalAmount) {
        	produceOneSock();
            System.out.println(this.color+" Sock: Produced " + sockProduced + " of " + sockTotalAmount +" "+ this.color + " Socks");
    	}
    }
    
    
    
    
   // public static void main(String args[]) {
   //     (new Thread(new SockMaker("red"))).start();
   // }

}
