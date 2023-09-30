package Classes;
import Interfaces.*;
import java.util.Scanner;

public class Product
{
	//Scanner inn = new Scanner(System.in);
	
	private String productName;
	private String productId;
	private int productPrice;
	private int productQnty;
	
	public void setProductName (String productName) {this.productName = productName;}
	public void setProductId (String productId) {this.productId = productId;}
	public void setProductPrice (int productPrice) {this.productPrice = productPrice;}
	public void setProductQnty (int productQnty) {this.productQnty = productQnty;}
	
	public String getProductName () {return productName;}
	public String getProductId () {return productId;}
	public int getProductPrice () {return productPrice;}
	public int getProductQnty () {return productQnty;}
	
	public void showProductInfo()
	{
		System.out.println("\nProduct Name     : "+productName);
		System.out.println("Product ID       : "+productId);
		System.out.println("Product Price    : "+productPrice);
		System.out.println("Product Quantity : "+productQnty+"\n");
	}
	
	public void increasePrice(int upPrice)
	{
		
		
		if(upPrice>0)
		{
			System.out.println("Previous Price of the product: "+ productPrice);
			System.out.println("The price rate you want to increase: "+ upPrice);
			
			productPrice+=upPrice;
			
			System.out.println("New price of this product is : "+productPrice);
		}

	}
	
	public void decreasePrice(int lowPrice)
	{
		 
		
		if(lowPrice>0)
		{
			System.out.println("Previous Price of the product: "+ productPrice);
			System.out.println("The price rate you want to decrease: "+ lowPrice);
			
			productPrice-=lowPrice;
			
			System.out.println("New price of this product is : "+productPrice);
		}

	}
	
	public void addQnty(int number)
	{
		 
		
		if(number>0)
		{
			System.out.println("Previous Quantity Of The Product: "+ productQnty);
			System.out.println("The Number of Quantity you wanna add : "+ number);
			
			productQnty+=number;
			
			System.out.println("New Quantity Of The Product Is : "+productQnty);
		}

	}
	
/*	public void add(Product pt)
	{
		int ck = 0;
		Product prr = null;
		if(pt!=null)
		{
			prr = pt;
			ck = 1;
		}
				
		
	}
	
	public void remove(Product pt)
	{
		int ck = 0;
		//Product prr=null;
		if(pt!=null)
		{
			pt = null;
			ck = 1;
		}
		
						
		
	}
	*/
	
	public void removeQnty(int number)
	{
		 
		
		if(number>0)
		{
			System.out.println("Previous Quantity Of The Product: "+ productQnty);
			System.out.println("The Number of Quantity You Wanna Remove : "+ number);
			
			productQnty-=number;
			
			System.out.println("New Quantity Of The Product Is : "+productQnty);
		}

	}
	
	
	
	
	
}