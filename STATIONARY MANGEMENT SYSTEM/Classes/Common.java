package Classes;
import Interfaces.*;

public class Common
{
	private Product [] prdcts = new Product[100];
	
	public void addProduct(Product p)
	{
		int ck = 0;
		for(int i=0; i<prdcts.length; i++)
		{
			if(prdcts[i] == null)
			{
				prdcts[i] = p;
				ck = 1;
				break;
			}
		}
		if(ck == 1)
		{
			//totalProducts++;
			System.out.println("\nProduct Is Added Successfully......  ");
		}
		else
		{
			System.out.println("Can Not Add The Product");
		}
	   
	}
	
	public void removeProduct(Product p)
	{
		int ck = 0;
		for(int i=0; i<prdcts.length; i++)
		{
			if(prdcts[i] == p)
			{
				prdcts[i] = null;
				ck = 1;
				break;
			}
		}
		if(ck == 1)
		{
			System.out.println("\nProduct is Removed\n");
		}
		else{System.out.println("Can Not Remove The Product");}
	}
	
	public void showA()
	{
		System.out.println("\t /////////////////////////////////////////");
		for(Product p : prdcts)
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
	
	
	public void showC()
	{
		System.out.println("\t /////////////////////////////////////////");
		for(Product pp : prdcts)
		{
			if(pp!=null)
			{
				System.out.println("\t Product Name     : "+pp.getProductName());
		        System.out.println("\t Product ID       : "+pp.getProductId());
		        System.out.println("\t Product Price    : "+pp.getProductPrice());
		        //System.out.println("\t Product Quantity : "+pp.getProductQnty());
				System.out.println();
				//System.out.println("HEY MAN HEY,WHY YOU ARE NOT SHOWING THE CONTENT.");
				
			}
			//else
		       //{System.out.println("HEY MAN HEY,WHAT'S WRONG!!!WHY YOU ARE NOT SHOWING THE CONTENT.");}
		}
		
		
		
		System.out.println("\t //////////////////////////////////////////\n");
	}
	
	
	
	
	
	public Product getProduct(String productId)
	{
		Product p = null;
		
		for(int i=0; i<prdcts.length; i++)
		{
			if(prdcts[i] != null)
			{
				if(prdcts[i].getProductId().equals(productId))
				{
					p = prdcts[i];
					break;
				}
			}
		}
		if(p != null)
		{
			//System.out.println("\nSearched Product Is Found\n");
		}
		else
		{
			System.out.println("\nSearched Product Is Not Found\n");
		}
		return p;
	}
	
	
	

}