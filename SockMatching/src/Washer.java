//���껹�Ǽ����� 
//1.�ȵ�����ȫ������
//2. �ȵ��Լ���queueȫ������

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
