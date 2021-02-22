package week2.hogwarts;

import acm.program.*;


public class Hogwarts extends ConsoleProgram { 
		public void run() { 
			bludger(2001); 
		} 
		private void bludger(int y) {   //2001
			int x = y / 1000; 	//(2001/1000)=2
			int z = (x + y); 	//(2+2001)=2003
			x = quaffle(z, y);        // 1001
			println("bludger: x = " + x + ", y = " + y + ", z = " + z); //1001,2001,2003
		} 
		private int quaffle(int x, int y) {// 2003,2001
			int z = snitch(x + y, y);  //1001 
			 y /= z;                         //  1
			println("quaffle: x = " + x + ", y = " + y + ", z = " + z); //2003,1,1001
			return z;                   //1001
		}
		 private int snitch(int x, int y) { //4004,2001
			y = x / (x % 10); 	 //  (4004/(4004%10))=1001
			println("snitch: x = " + x + ", y = " + y); //4004, 1001
			return y; 					//1001
		} 
	} 


