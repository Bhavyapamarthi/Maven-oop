package com.mavdemo.newyrgift;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
    	 int nc,ch,cw,sw,i,tot=0,j=0;
         System.out.println("Enter no.of children: ");
         Scanner in =new Scanner(System.in);
         nc=in.nextInt();
         int choco[] =new int [nc];
         String choconame[] =new String [nc];
         for(i=0;i<nc;i++)
         {
         	System.out.println("Enter Sweet or Candy \nFor Sweet press 1 & for Candy press 0");
         	ch=in.nextInt();
         	if(ch==1)
         	{
         		Scanner sc =new Scanner(System.in);
         		System.out.println("Enter Sweet name:");
         		String sn=sc.nextLine();
         		System.out.println("Enter Sweet wt:");
         		sw=sc.nextInt();
         		tot=tot+sw;
         		Sweets obsweet= new Sweets();
         		obsweet.sweets(sn, sw);
         		
         	}
         	else if(ch==0)
         	{
         		Scanner sc1 =new Scanner(System.in);
         		System.out.println("Enter Candy name:");
         		String cn=sc1.nextLine();
         		System.out.println("Enter Candy wt:");
         		cw=sc1.nextInt();
         		tot=tot+cw;
         		choconame[i]=cn;
         		choco[i]=cw;
         	}
         	else
         	{
         		System.out.println("Invalid entry...Enter again\n");
         		
         	}
         	
         }
         for(i=0;i<nc;i++)
         {
         	for(j=i+1;j<nc;j++)
         	{
         		if(choco[i]>choco[j])
         		{
         			int temp=choco[i];
         			choco[i]=choco[j];
         			choco[j]=temp;
         			String temp1=choconame[i];
         			choconame[i]=choconame[j];
         			choconame[j]=temp1;
         			
         		}
         	}
         }
         System.out.println("chocolates after sorting:");
        for(i=0;i<nc;i++)
         {
         	if(choconame[i]!=null)
         	 System.out.println(choconame[i]);
      
         }
         		       
         System.out.println("Total weight of gift is "+tot);
     }
     public static class Gifts
     {
     	public static void Giftweight(int numb)
     	{ 
     		int weight=numb;
     	}
     	
     }
     public static class Sweets extends Gifts
     {
     	public void sweets(String name,int weight)
     	{

     		Gifts.Giftweight(weight);
     		String sweetname=name;
     		
     	}
     	
     }
     public static class Candies extends Gifts
     {

     	public void candies(String name,int weight)
     	{
     		String choc=name;
     		Gifts.Giftweight(weight);
     	}
       
    }
}
