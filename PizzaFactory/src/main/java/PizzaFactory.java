import java.io.*;
import java.util.Scanner;
class PizzaFActory
{
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	int BALANCE = 0;int flag;int ac=0,rt=0;
	void begin()throws IOException
	{
		System.out.println("WELCOME TO PIZZA HUT! ");
		System.out.println("**********************");
		System.out.println(" Hello! Customer");
		System.out.println("****************");
		System.out.println("What type of pizza you want to order?");
		System.out.println("The Menu is");
		System.out.println("******");
		System.out.println("1) pizza");
		System.out.println("2) Sides");

		System.out.println("**************");
		System.out.println("TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER! ");
			int order= sc.nextInt();
			switch (order)
			{
				case 1:System.out.println("you choosed pizza");
					pizza();
					break;
				case 2:System.out.println("you choosed Sides");
					Sides();
					break;
				default : System.out.println("Wrong Entry");
			}
		System.out.println("_________");
	}
	void pizza()throws IOException
	{
		char c;
		int vpiz[] = {0,150,200,325,175,375,475,160,290,340};

		int nvpiz[] ={0,190,325,425,210,370,500,220,380,525};

		System.out.println("1) veg?");
		System.out.println("2) non-veg?");
		int nv=sc.nextInt();
		switch (nv)
		{
			case 1:
				System.out.println(" ****** THE MENU ****** ");
				System.out.println(" VEG PIZZA ");
				System.out.println(" PRICE ");
				System.out.println(" _______ ");

				System.out.println("1.Deluxe Veggie: (Regular: Rs. 150 )");
				System.out.println("2.Deluxe Veggie: (Medium: Rs. 200 )");
				System.out.println("3.Deluxe Veggie: (Large: Rs. 325)");

				System.out.println("4.Cheese and corn: (Regular: Rs. 175 )");
				System.out.println("5.Cheese and corn: (Medium: Rs. 375 )");
				System.out.println("6.Cheese and corn: (Large: Rs. 475 )");

				System.out.println("7.Paneer Tikka: (Regular: Rs. 160 )");
				System.out.println("8.Paneer Tikka: (Medium: Rs. 290 )");
				System.out.println("9.Paneer Tikka: (Large: Rs. 340)");

				System.out.println(" ***** THE END ******* ");
				System.out.println("TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER! ");
				int choice1 = Integer.parseInt(br.readLine());
				System.out.println("How many do you want?");
				int h=Integer.parseInt(br.readLine());
				crust();
				Toppingsv();
				for(int i=0;i<10;i++)
				{
					if(choice1==i)
					{
						System.out.println("RS." + vpiz[i]*h);
						BALANCE += vpiz[i]*h;
						flag+=1;
					}
				}
				break;
			case 2:
				System.out.println(" ******* THE MENU ****** ");
				System.out.println(" NON-VEG ");
				System.out.println(" PRICE ");
				System.out.println(" ______ ");

				System.out.println("1.Non-Veg Supreme: (Regular: Rs 190)");
				System.out.println("2.Non-Veg Supreme: (Medium: Rs 325)");
				System.out.println("3.Non-Veg Supreme: (Large: Rs 425)");

				System.out.println("4.Chicken Tikka: (Regular: Rs 210 )");
				System.out.println("5.Chicken Tikka: (Medium: Rs 370)");
				System.out.println("6.Chicken Tikka: (Large: Rs 500)");

				System.out.println("7.Pepper Barbecue Chicken (Regular: Rs 220)");
				System.out.println("8.Pepper Barbecue Chicken (Medium: Rs 380)");
				System.out.println("9.Pepper Barbecue Chicken (Large: Rs 525)");

				System.out.println(" ****** THE END ******* ");
				System.out.println("TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER");
				int choice2 = Integer.parseInt(br.readLine());
				System.out.println("How many do you want?");
				int m=Integer.parseInt(br.readLine());
				crust();
				Toppingsnv();
				for(int j=0;j<10;j++)
				{
					if(choice2==j)
					{
						System.out.println("RS." + nvpiz[j]*m);
						BALANCE += nvpiz[j]*m;
						flag+=1;
					}
				}
				break;
			default : 
		}
	}
	void crust()throws IOException
	{
		System.out.println(" *****You got free crust on pizza*****");
		System.out.println(" ------- ------- ");
		System.out.println(" 1.New hand tossed");
		System.out.println(" 2.Wheat thin crust");
		System.out.println(" 3.Cheese Burst");
		System.out.println(" 4.Fresh pan pizza" );
		System.out.println(" ****************THE END******************** ");

		System.out.println(" TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER!!!");
		int choice3 = Integer.parseInt(br.readLine());
		show();
	}
	void Toppingsv()throws IOException
	{
		int vpiz[] = {0,20,25,35,30,10};

				System.out.println(" ****** THE MENU ****** ");
				System.out.println(" VEG Toppings ");
				System.out.println(" _______ ");

				System.out.println("1.Black olive (Rs 20)");
				System.out.println("2.Capsicum (Rs 25)");
				System.out.println("3.Paneer (Rs 35)");
				System.out.println("4.Mushroom (Rs 30)");
				System.out.println("5.Fresh tomato (Rs 10)");

				System.out.println(" ***** THE END ******* ");
				System.out.println("TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER! ");
				int choice1 = Integer.parseInt(br.readLine());
				System.out.println("How many do you want?");
				int h=Integer.parseInt(br.readLine());
				for(int i=0;i<6;i++)
				{
					if(choice1==i)
					{
						System.out.println("RS." + vpiz[i]*h);
						BALANCE += vpiz[i]*h;
						flag+=1;
					}
				}
		show();
	}
	void Toppingsnv()throws IOException
	{
		int nvpiz[] ={0,35,45,40};

				System.out.println(" ******* THE MENU ****** ");
				System.out.println(" NON-VEG ");
				System.out.println(" ______ ");

				System.out.println("1.Chicken tikka (Rs 35)");
				System.out.println("2.Barbeque chicken (Rs 45)");
				System.out.println("3.Grilled chicken (Rs 40)");

				System.out.println(" ****** THE END ******* ");
				System.out.println("TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER");
				int choice2 = Integer.parseInt(br.readLine());
				for(int j=0;j<4;j++)
				{
					if(choice2==j)
					{
						System.out.println("RS." + nvpiz[j]);
						BALANCE += nvpiz[j];
						flag+=1;
					}
				}
		show();
	}
	void Sides()throws IOException
	{
		int des[]= {0,55,90};
		System.out.println(" *****************THE MENU****************** ");
		System.out.println(" Sides ");
		System.out.println(" 1. Cold drink (Rs 55) ");
		System.out.println(" 2. Mousse cake (Rs. 90) ");
		System.out.println(" ******************THE END******************* ");
		System.out.println(" TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER!!");
		int choice5 = Integer.parseInt(br.readLine());
		System.out.println(" How many do you want?");
		int h=Integer.parseInt(br.readLine());
		for(int i=0;i<3;i++)
		{
			if(choice5==i)
			{
				System.out.println("RS." + des[i]*h);
				BALANCE+= des[i]*h;
				flag+=1;
			}
		}
		show();
	}

	void show()
	{
	System.out.println("you need to pay rs." + BALANCE );
	}
	void bill()
	{
	System.out.println("|-------------------------------------------|");
	System.out.println("| PIZZA HUT |");
	System.out.println("| ITEMS BYED |");
	System.out.println("|" + flag + " |");
	System.out.println("| TOTAL MONEY "+ BALANCE + " |");
	System.out.println("|*******************************************|"); 
	System.out.println("| PAYMENT SUMMARY(RS) |");
	System.out.println("| amount need to be paid "+ BALANCE+ " |");
	System.out.println("|*******************************************|");
	System.out.println("| items sold cannot be refunded |");
	System.out.println("| THANK YOU!!! |"); 
	System.out.println("| VISIT AGAIN!! |");
	System.out.println("|*******************************************|"); 
	System.out.println("| BYE!! |");
	System.out.println("|-------------------------------------------|");
	}
	public static void main(String args[])throws IOException
	{
		PizzaFActory obj = new PizzaFActory();
		obj.begin();
		obj.bill();
	}
}