//做完还是继续等 
//1.等到工人全部做完
//2. 等到自己的queue全部做完

import java.util.*;

public class Washer implements Runnable {
	static Queue<SOCK> pairedQ;
	
	public Washer() {
		pairedQ = new LinkedList<>();
	}
	
	public void destroyPairedSock() {
		System.out.println("Washer Thread: Destroyed "+pairedQ.remove().color+" socks. "  );
	}
	
	public void run() {
		try{
			Thread.sleep(30);
			while(pairedQ.size()> 0) {
				destroyPairedSock();
			}
		} catch (Exception e) {
			
			
		}
		
		
	}
}
