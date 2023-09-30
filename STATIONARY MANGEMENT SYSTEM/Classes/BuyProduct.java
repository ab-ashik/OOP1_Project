package Classes;
import Interfaces.*;
import java.util.Scanner;

public class BuyProduct
{
	Product[] pBuy = new Product[100];
	 int payment;
	
	public int addToBuy(Product p,int qntty)
	{
		int ck = 0;
		for(int i=0; i<pBuy.length; i++)
		{
			if(pBuy[i] == null)
			{
				pBuy[i] = p;
				pBuy[i].setProductQnty(qntty);
				ck = 1;
				int price = pBuy[i].getProductPrice();
				int quantity = pBuy[i].getProductQnty();
				payment =(price*quantity);
				break;
			}
			 
		}
		if(ck == 1)
		{
			//totalProducts++;
			System.out.println("\n\t Product Is Proceed To Buy......  \n");
			return payment;
		}
		else
		{
			System.out.println("\nCan Not Buy The Product..........\n");
		}
	   return 0;
	}
	
	public void showBuyHistory()
	{
		System.out.println("\t /////////////////////////////////////////");
		for(Product p : pBuy)
		{
			if(p != null)
			{
				System.out.println("\t Product Name     : "+p.getProductName());
		        System.out.println("\t Product ID       : "+p.getProductId());
		        //System.out.println("\t Product Price    : "+p.getProductPrice());
		       System.out.println("\t Product Quantity : "+p.getProductQnty());
				System.out.println();
			}
		}
		System.out.println("\t //////////////////////////////////////////\n");
	}
	

