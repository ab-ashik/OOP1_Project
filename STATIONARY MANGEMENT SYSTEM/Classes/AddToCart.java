package Classes;
import Interfaces.*;
import java.util.Scanner;

public class AddToCart
{
	Product[] pCart = new Product[100];
	
	public void addCart(Product p,int qntty)
	{
		int ck = 0;
		for(int i=0; i<pCart.length; i++)
		{
			if(pCart[i] == null)
			{
				pCart[i] = p;
				pCart[i].setProductQnty(qntty);
				ck = 1;
				break;
			}
		}
		if(ck == 1)
		{
			//totalProducts++;
			System.out.println("\nProduct Is Added To Your Cart Successfully......  ");
		}
		else
		{
			System.out.println("\nCan Not Add The Product To Your Cart..........");
		}
	   
	}
	
	public void RemoveCart(Product p)
	{
		int ck = 0;
		for(int i=0; i<pCart.length; i++)
		{
			if(pCart[i] == p)
			{
				pCart[i]=null;
				ck = 1;
				break;
			}
		}
		if(ck == 1)
		{
			//totalProducts++;
			System.out.println("\nProduct Is Added To Your Cart Successfully......  ");
		}
		else
		{
			System.out.println("\nCan Not Add The Product To Your Cart..........");
		}
	   
	}
	
	
	public void showCart()
	{
		System.out.println("\t /////////////////////////////////////////");
		for(Product p : pCart)
		{
			if(p != null)
			{
				System.out.println("\t Product Name     : "+p.getProductName());
		        System.out.println("\t Product ID       : "+p.getProductId());
		        System.out.println("\t Product Price    : "+p.getProductPrice());
		        System.out.println("\t Product Quantity : "+p.getProductQnty());
				System.out.println();
			}
		}
		System.out.println("\t //////////////////////////////////////////\n");
	}
}