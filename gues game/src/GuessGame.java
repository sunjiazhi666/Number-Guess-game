import java.util.Scanner;

public class GuessGame
	{
		static int number;
		static boolean stillplaying = true;
       static int secretnumber;
		public static void main(String[] args)
			{

				greeting();
				while (stillplaying)
					{
						difficulty();
						
						guessgame();
						playagain();
						stillplaying = false;
					}
			}

		private static void greeting()
			{
				System.out.println("What is the number your name?");
				Scanner userInput = new Scanner(System.in);
				String nume = userInput.nextLine();

				System.out.println("What's up");

			}

		private static void difficulty()
			{
				System.out.println(" 1)easy or 2)hard");
				Scanner userInput2 = new Scanner(System.in);
				int difficulty = userInput2.nextInt();

				if (difficulty == 1)
					{
						number = 10;
					}

				else
					{
						number = 20;
					}
				secretnumber = (int) (Math.random() * number) + 0;

			}

		private static void guessgame()
			{
				int counter = 0;

				boolean stillguesing = true;

				while (stillguesing)
					{
						System.out.println("What is the number you want to pick");
						Scanner userInput1 = new Scanner(System.in);
						int guess = userInput1.nextInt();

						if (guess > secretnumber)
							{
								System.out.println("Too large");
								counter++;
							} else if (guess < secretnumber)
							{
								System.out.println("Too small");
								counter++;
							}

						else
							{
								counter++;
								System.out.println("You are right");
								stillguesing = false;
								String singularorplural;
								if (counter == 1)
									{
										singularorplural = "time";
									} else
									{
										singularorplural = "times";
									}
								System.out.println("You spent " + counter + singularorplural + " to get the number.");
							}
					}

			}

		private static void playagain()
			{

				System.out.println("Do u want to play again? (1=Yes 2=No)");
				Scanner userInput6 = new Scanner(System.in);
				int answer = userInput6.nextInt();

				if (answer == 1)
					{
						stillplaying = true;
					}

				else
					{
						stillplaying = false;
					}

			}

	}
