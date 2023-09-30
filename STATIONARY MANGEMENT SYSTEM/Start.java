import java.lang.*;
import LoginInfo.*;
import Classes.*;
import FileReadWrite.*;

import java.util.Scanner;

public class Start
{
	public static void main(String args[])
	{
		System.out.print  ("\n\n\t XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                           "\t --------------------------------------------------------------------------------------\n" +
                           "\t ---------------------STATIONARY-MANAGEMENT-SYSTEM------------------------------------\n" +
                           "\t --------------------------------------------------------------------------------------\n" +
                           "\t XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\n\n\n");
						   
						   
		System.out.println("\t ===============================================================\n" +
						   "\t --------------------------------------------------------------\n" +
						   "\t ----GROUP NAME : SYSTEM ZOMBIES-------------------------------\n" +
						   "\t --------------------------------------------------------------\n" +
						   "\t ----MEMBERS : 1. ABDULLAH (ID : 20-42754-1)-------------------\n" +
						   "\t --------------2. SAZZAT HOSSAN (ID : 18-37445-1)--------------\n" +
						   "\t --------------3. MD SHAKIB KHAN (ID : 20-41964-1)-------------\n" +
						   "\t --------------4. SAJID HAYDER CHOWDHURY (ID : 20-41967-1)-----\n" +
						   "\t --------------------------------------------------------------\n" +
						   "\t ===============================================================\n");						   
						   
	   
						   
						   
		boolean choice = true;
		Scanner input = new Scanner(System.in);
		Customer customer = new Customer();
		Login l1 = new Login();
		Admin a = new Admin();
		Product prodct = new Product();
		CustomerInfo ci = new CustomerInfo();
		Common cmmn = new Common();
		AddToCart atc = new AddToCart();
		BuyProduct buy = new BuyProduct();
		FileIO filewr = new FileIO();
		//String stringAdd = "";
		
		
		///////////////////////////////////////////////
		Product pr1 = new Product();
		Product pr2 = new Product();
		Product pr3 = new Product();
		Product pr4 = new Product();
		Product pr5 = new Product();
					pr1.setProductName("Scale");  //Stapler Machine,Stapler Pin remover,White Board Marker,
					pr1.setProductId("1111");    //Writing Pad,Gum Bottle,Stamp Pad ink,Paper Weight,Clips & Pins
					pr1.setProductPrice(20);    //Duster,Telephone Diary,Pencil,Eraser,Rubber Stamp,Highlighter,Sharpner,
					pr1.setProductQnty(100);   //Calculator,Keyboard,Monitor,Envelop,Scissors,Desk,
						
					cmmn.addProduct(pr1);
					
		
					pr2.setProductName("Printing Paper");
					pr2.setProductId("5555");
					pr2.setProductPrice(2);
					pr2.setProductQnty(1000);
						
					cmmn.addProduct(pr2);
					
					pr3.setProductName("Writing Pad");
					pr3.setProductId("2222");
					pr3.setProductPrice(20);
					pr3.setProductQnty(100);
						
					cmmn.addProduct(pr3);
					
					pr4.setProductName("Highlighter");
					pr4.setProductId("3333");
					pr4.setProductPrice(15);
					pr4.setProductQnty(200);
						
					cmmn.addProduct(pr4);
					
					pr5.setProductName("White Board Marker");
					pr5.setProductId("4444");
					pr5.setProductPrice(35);
					pr5.setProductQnty(200);
						
					cmmn.addProduct(pr5);
		/////////////////////////////////////////////////
		
		
	
		while(choice==true){
		System.out.println("\n     ***********************************************************************");
        System.out.println("                           WELCOME TO LOGIN PAGE                            ");
        System.out.println("     ************************************************************************");
		
		System.out.println("\n\t Select Your menu : \n");
		System.out.println("\t 1.Admin Menu  ");
		System.out.println("\t 2.Customer Menu  ");
					
		int one = input.nextInt();
		
		boolean ch = true;
		
	if(one == 1)
	{
		
		System.out.println("                   Admin Menu");
		System.out.println("                ================");
					
		boolean b = l1.check();
		
				
		while(b==true){
					
				System.out.println("               Admin Menu");
                System.out.println("            ================");
				System.out.println();
				
				System.out.println("\t 1.Add product            ");
				System.out.println("\t 2.Remove product         ");
				System.out.println("\t 3.Search a product & see details       ");
				System.out.println("\t 4.See Stock              ");
				System.out.println("\t 5.Manage product price   ");
				System.out.println("\t 6.Manage product quantity");
				//System.out.println("\t 7.See user list          ");		
				System.out.println("\t 7.Sell report            ");		
				System.out.println("\t 8.Exit Menu       ");	
				
				System.out.print("\nWhat you wanna do?   ");
			    int two = input.nextInt();
					
  
				if(two == 1)
				{
					System.out.println("\nYou have Selected To Add Product \n");
					System.out.print("Enter Product Name : ");
					String prName = input.next();
					System.out.print("Enter Product ID : ");
					String pId = input.next();
					System.out.print("Enter Product Price: ");
					int pPrice = input.nextInt();
					System.out.print("Enter Product Quantity : ");
				    int pQnty = input.nextInt();
					
					Product pr = new Product();
					pr.setProductName(prName);
					pr.setProductId(pId);
					pr.setProductPrice(pPrice);
					pr.setProductQnty(pQnty);
						
					cmmn.addProduct(pr);
					////////////////////
					
					
				}


				else if(two == 2)
				{	
					System.out.println("\nYou Have Selected To Remove A Product \n");
					System.out.print("Enter the product ID : ");
					String rId = input.next();
						
					cmmn.removeProduct(cmmn.getProduct(rId));
				}
						
					
					
				else if(two == 3)
				{
					System.out.println("\nYou Have Selected To Search A Product \n");
					System.out.print("Enter the product ID : ");
					String sId = input.next();
					cmmn.getProduct(sId).showProductInfo();
					
				}
						
						
				else if(two == 4)
				{
					System.out.println("\nYou Have Selected To See Stock Of Products \n");
					cmmn.showA();
				}
						
						
				else if(two == 5)
				{
					System.out.println("\n\t Select Your menu : \n");
					System.out.println("\t 1.Increase the product price  ");
					System.out.println("\t 2.Decrease the product price  ");
					int inTwo = input.nextInt();
						
					if(inTwo==1)
					{
						Product p = new Product();
						System.out.print("\n\t Enter the product id : ");
						String pid = input.next();
						System.out.print("\t Enter the price yoou want to increase for this product : ");
						int prc = input.nextInt();
						
						cmmn.getProduct(pid).increasePrice(prc);
					}
					
					else if(inTwo == 2)
					{
						Product pp = new Product();
						System.out.print("\n\t Enter the product id : ");
						String pid = input.next();
						System.out.print("\t Enter the price yoou want to increase for this product : ");
						int prc2 = input.nextInt();
						
						cmmn.getProduct(pid).decreasePrice(prc2);
					}
						
				}
					
				else if(two==6)
				{
						
					System.out.println("\n\t Select Your menu : \n");
					System.out.println("\t 1.Add product quantity  ");
					System.out.println("\t 2.Remove product quantity  ");
					int inTwo2 = input.nextInt();
						
					if(inTwo2==1)
					{
						System.out.print("\n\t Enter the product id : ");
						String qId = input.next();
						System.out.print("\t Enter the number of quantity you wanna add : ");
						int qntyAdd = input.nextInt();
							
						cmmn.getProduct(qId).addQnty(qntyAdd);
					}
						
					else if (inTwo2==2)
					{
						System.out.print("\n\t Enter the product id : ");
						String qId = input.next();
						System.out.print("\t Enter the number of quantity you wanna remove : ");
						int qntyRemove = input.nextInt();
							
						cmmn.getProduct(qId).removeQnty(qntyRemove);
					}
				}
				
				else if(two == 7)
				{
					System.out.println("\n\t You have selected to show the Sales Report : \n");
						
					filewr.readSales();
				}
				
				else if(two==8)
				{
					System.out.println("\nExiting The Menu...............\n");
					b = false;
				}
				
				
					
					
			}
					
						
				  
	}
	
		
	    else if(one == 2)
	    {
			
			
			while(ch == true){
		    System.out.println("                 Customer Menu");
		    System.out.println("              ====================");
			
			System.out.println("\n\t Select Your menu : \n");
		    System.out.println("\t 1.Log In To Existing Account ");
		    System.out.println("\t 2.Creat New Account  ");
		    System.out.println("\t 3.Exit Menu  ");
			
			int cOne = input.nextInt();
			
			if(cOne == 1)
			{
				System.out.println("\n\t You have selected to log-in to existing account : ");
				boolean cTwo = l1.userLogin();
				
				if(cTwo == true)
				{
					while(true){
					System.out.println("                 Customer Menu");
					System.out.println("              ====================");
				    System.out.println();
				
					System.out.println("\t 1.See available products  ");
					System.out.println("\t 2.See own inforamtion     ");
					System.out.println("\t 3.Change delivery Address ");
					System.out.println("\t 4.Add to cart             ");
					System.out.println("\t 5.See cart list             ");
					System.out.println("\t 6.Buy product             ");
					//System.out.println("\t 7.See History             ");				
					System.out.println("\t 7.Go Back                 ");	
				
					System.out.print("\nWhat you wanna do?   ");
					int cThree = input.nextInt();
					
					if(cThree == 1)
					{
						
						System.out.println("\n\t You have selected to see available products : ");
						cmmn.showC();
					}
					
					else if(cThree == 2)
					{
						System.out.println("\n\t You have selected to see own inforamtion : \n");
						l1.info();
					}
					
					else if(cThree == 3)
					{
						System.out.println("\n\t You have selected to change delivery address : \n");
						
						System.out.print("\t Enter Your New Region : ");
						String region = input.next();
						ci.setRegRegion(region);
			
						System.out.print("\t Enter Your New City : ");
						String city = input.next();
						ci.setRegCity(city);
						
						System.out.print("\t Enter Your New Area : ");
						String area = input.next();
						ci.setRegArea(area);
						
						System.out.print("\t Enter Your New Address : ");
						String addrs = input.next();
						ci.setRegAddress(addrs);
						
						System.out.println("\nYour New Address Is : "+addrs+", "+area+", "+city+", "+region+"\n");
					}
					
					else if(cThree == 4)
					{
						System.out.println("\n\t You have selected to add products to cart : \n");
						
						System.out.print("Enter the product id : ");
						String cId = input.next();
						
						System.out.print("Enter the quantity : ");
						int cQntty = input.nextInt();
						
						atc.addCart(cmmn.getProduct(cId),cQntty);
					}
					
					else if(cThree == 5)
					{
						System.out.println("\n\t You have selected to show the list of your cart : \n");
						
						atc.showCart();
					}
					
					else if(cThree == 6)
					{
						int pay6=0;
						int bill=0;
						
						
						System.out.println("\n\t You have selected to buy product from our shop : \n");
						
						System.out.print("\t Enter the product id : ");
						String buyId = input.next();
						
						System.out.print("\t Enter the quantity : ");
						int buyQntty = input.nextInt();
						int qntyLimit = cmmn.getProduct(buyId).getProductQnty();
						
						if(buyQntty<=qntyLimit)
						{    
 							boolean chh = true;
							boolean chh2 = true;
							
							
							bill = buy.addToBuy(cmmn.getProduct(buyId),buyQntty);
							while(chh2 == true)
							{
								String buyId2="";
							int buyQntty2=0;
							int qntyLimit2=0;
							int bill2=0;
							
							while(chh ==true)
							{
							
							
							 
							
							System.out.print("\t \nDo you wanna add anything (y/n)? : ");
							String c = input.next();
							
							
							if(c.charAt(0) == 'y'|| c.charAt(0) == 'Y')
							{
								System.out.print("\n\t Enter the product id : ");
						         buyId2 = input.next();
						
						        System.out.print("\t Enter the quantity : ");
						         buyQntty2 = input.nextInt();
						         qntyLimit2= cmmn.getProduct(buyId2).getProductQnty();
								
								bill2 = buy.addToBuy(cmmn.getProduct(buyId2),buyQntty2);
								 
							}
							
							else
							{chh=false;}
								
							}
							   //System.out.print("Your Total Price is : ");
								
								int pay = bill+bill2;
								
								System.out.println("\t /////////////////////////////////////////\n");
								System.out.println("\t Your total price is : "+pay+"\n");
								System.out.println("\t //////////////////////////////////////////\n");
								
								ci.deliveryAddress();
								
				     System.out.println("\t ===================================\n" +
										"\t ----DELIVERY FEE :-----------------\n" +
										"\t ----1.INSIDE DHAKA  : 50 BDT------\n" +
										"\t ----2.OUTSIDE DHAKA : 100 BDT-----\n" +
										"\t ===================================\n");

								System.out.print("What you wanna do : ");
								int option = input.nextInt();
								if(option == 1)
								{
									int pay2 = pay + 50;
									System.out.println("\n\t YOUR TOTAL PAYMENT WITH DELIVERY FEE IS : "+pay2+" BDT\n");
								}
								else
								{
								    int pay3 = pay+100;
									System.out.println("\n\t YOUR TOTAL PAYMENT WITH DELIVERY FEE IS : "+pay3+" BDT\n");
									pay6 = pay3;
								}
					System.out.println("\t ==========================\n" +
										"\t ----PAYMENT METHOD :-----\n" +
										"\t ----1.BKASH--------------\n" +
										"\t ----2.ROCKET-------------\n" +
										"\t =========================\n");
										
								System.out.print("What you wanna do? : ");
								int option2 = input.nextInt();
								
								if(option2==1)
								{
									
									System.out.println("\n\t ============================================= ");
									System.out.println("\t     SEND YOUR PAYMENT TO. BKASH: 01X-XXXXXXXX");
									System.out.println("\t   =============================================\n");
								}
								else
								{
									System.out.println("\n\t ============================================= ");
									System.out.println("\t     SEND YOUR PAYMENT TO. ROCKET: 01X-XXXXXXXX");
									System.out.println("\t   =============================================\n");
								}
								
								chh2 = false;
							}
							filewr.writeSales("Quatity : "+buyQntty+" of"+" Product ID : "+buyId+" is sold."+"\n"+"Total bill is : "+pay6+"\n");
						}
						else
							System.out.println("\t \nThere is less quantity for this product right now.\n");
					}
					
					
					else if(cThree == 7)
					{
						System.out.println("\nGoing Back....................\n");
						break;
					}
				  }
				}
				
				
			}
			
			   else if(cOne == 2)
			   {
					System.out.println("\n\t You have selected to creat new account : ");
					l1.resgistraion();
			   }
			   else if(cOne == 3)
			   {
				  ch = false; 
			   }
			}
		
	    }
				
  }
		
 }
 
}


		
	


