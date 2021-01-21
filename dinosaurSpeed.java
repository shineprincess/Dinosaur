//Dinosaur battle program
import java.util.Scanner;

public class Dinosaur
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Torosaurus , Tanius ");
		System.out.println("Enter your moves : ");
		String [] moves={"Bite","punch"};
		String input=scan.nextLine();
		 int tri=100;//damage
		
		if(input.equalsIgnoreCase(moves[0]))
		{
			System.out.println("You bit the tri ");
			tri=tri-60;
		}
		else if(input.equalsIgnoreCase(moves[1]))
		{
			System.out.println("You punched the tri ");
			tri=tri-30;
		}
		else 
		{
			System.out.println("Please enter the correct moves ");
			tri=tri-100;
		}
		System.out.println(tri);
	}
}
