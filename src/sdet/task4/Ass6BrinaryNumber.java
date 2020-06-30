package sdet.task4;
public class Ass6BrinaryNumber
{
	static void isBinaryOrNot(int number)
	{
		boolean isBinary = true;

		int copyOfNumber = number;

		while (copyOfNumber != 0)
		{
			int temp = copyOfNumber%10;   //Gives last digit of the number

			if(temp > 1)
			{
				isBinary = false;
				break;
			}
			else
			{
				copyOfNumber = copyOfNumber/10;    //Removes last digit from the number
			}
		}

		if (isBinary)
		{
			System.out.println(number+" is a binary number");
		}
		else
		{
			System.out.println(number+" is not a binary number");
		}
	}

	public static void main(String[] args)
	{
		isBinaryOrNot(1234567);

		isBinaryOrNot((101101));

		isBinaryOrNot((678923));

		isBinaryOrNot((110010110));
	}
}