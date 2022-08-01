package com.clock.demo;

public class clockdemo
{
    public static void main(String[] args)
    {
    	
    clock clock1 = new clock(1,33,33);
    
    for(int i=1;i<=10;i++)
    {
    	clock1.tick();
    	System.out.println(clock1);
    }
    
    
 clock clock2 = new clock(1,30,33);
	
 for(int i=1;i<=10;i++)
 {
 
	 clock2.tickDown();
	 System.out.println(clock2);
	
 }
	

	 
	 // newSeconds=clock2.getSeconds();
	 
	clock1.addClock(clock2);
    
	System.out.println();
	
	clock clock3 =new clock();
    //System.out.println(clock3);
	clock clock4 = new clock();
	
//clock4 = subtractClock()
    
    System.out.println();
    
    }

	
    


}

