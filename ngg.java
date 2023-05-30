import java.util.Scanner;

 class ngg 
{
      public static void nguessgame()
	{
		
		Scanner sc = new Scanner(System.in);
            int numb = 1 + (int)(100 * Math.random());
            int i = 6;
            int k, guess;
            System.out.println("A number chosen" + " between 1 to 100 " + "Guess the correct number" + " within 6 trials.");
            for (k = 0; k < i; k++)
            {

			System.out.println("Guess the correct number:");
                  guess = sc.nextInt();

			
			if (numb == guess)
                  {
				System.out.println(" Your guess is correct ");
				break;
			}
			else if (k != i - 1 && numb > guess) 
                  {
				System.out.println("The number is "+ "greater than " + guess);
			}
			else if (k != i - 1 && numb < guess) 
                  {
				System.out.println("The number is"+ " less than " + guess);
			}
		}

		if (k == i) 
            {
			System.out.println("You have finished"+ i +" trials");

			System.out.println("The number is : " + numb);
		}
	}

	
	public static void main(String arg[])
	{
           nguessgame();
	}
}
