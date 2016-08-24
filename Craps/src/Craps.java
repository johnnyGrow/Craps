import java.util.Scanner;

public class Craps
	{
	static int add;	
static int diff;
		public static void main(String[] args)
			{
				int wager=100;
				Scanner userInput=new Scanner(System.in);
				System.out.println("What is your name?");
				String name=userInput.nextLine();
				System.out.println("hello "+name+" you have "+ wager +" dollars how much would you like to put on the table?");
				int wager2=userInput.nextInt();
				 diff= wager-wager2;
				 add= wager+wager2;
				
				int randomNumber=(int)(Math.random()*6)+1;
				int randomDice=(int)(Math.random()*6)+1;
				int dice=randomNumber+randomDice;
			
			System.out.println("You rolled a "+dice);
			if(dice==7||dice==11)
				{
					System.out.println(name+" You win, you have "+add+" dollars, would you like to play again?");	
					String input=userInput.nextLine();
					if(input.equals("yes"))
						{
							playGame();
						}
					else
						{
							System.out.println("Goodbye");
						}
				}
			if(dice==2||dice==12)
				{
					System.out.println(name+" You Lose");
					String input=userInput.nextLine();
					if(input.equals("yes"))
						{
							playGame();
						}
					else
						{
							System.out.println("Goodbye");
						}
				}
			else
				{
					System.out.println("your point is "+dice);
					playGame();
				}
			}
		
			public static void playGame()
			{
				int randomNumber=(int)(Math.random()*6)+1;
				int randomDice=(int)(Math.random()*6)+1;
				int dice=randomNumber+randomDice;
				System.out.println("you rolled a "+dice);
				if(dice==8)
					{
						Scanner userInput=new Scanner(System.in);
						System.out.println(" You Win, now you have "+add+" dollars, would you like to play again?");
						String input=userInput.nextLine();
						if(input.equals("yes"))
							{
								playGame();
							}
						else
							{
								System.out.println("Goodbye");
							}
						
					}
				else if(dice==7)
					{
						Scanner userInput=new Scanner(System.in);
						System.out.println(" You Lost, now you have  "+diff+" dollars, would you like to play again?");
						String input=userInput.nextLine();
						if(input.equals("yes"))
							{
								playGame();
							}
						else
							{
								System.out.println("Goodbye");
							}
					}
				else

					{
						playGame();
					}
			}
				public static void getWager()
				{
					
				}

				
			}

		

	
