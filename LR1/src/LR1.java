import java.util.Scanner;

public class LR1 {
	/*public static void main(String args[])
	{
		for (int i = 1; i <= 500; i++)
		{
			if (i % 5 == 0 && i % 7 == 0) 
	        {
	           System.out.print("fizzbuzz");
	        } 
			else if (i % 5 == 0)
	        {
	           System.out.print("fizz");
	        }
	        else if (i % 7 == 0)
	        {
	           System.out.print("buzz");
	        }
	        else 
	        {
	        	System.out.print(i);
	        }
			
	        System.out.println();
		}
	}*/
	/*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String out_str = "";
		
        for (int i = str.length() - 1; i >= 0; i--)
        {
        	out_str += str.charAt(i);
        }
        
		System.out.println("\nВходная строка: " + str);
		System.out.println("Строка в обратном порядке: " + out_str);
	}*/
	/*public static void main(String[] args){
		int range = 10;
		int n0 = 1;
		int n1 = 1;
		int n2;
		System.out.print(n0 + " " + n1 + " ");
		for(int i = 3; i <= range; i++)
		{
			n2=n0+n1;
			System.out.print(n2+" ");
			n0=n1;
			n1=n2;
		}
		System.out.println();
	}*/
	/*static int calculateFactorial(int n){
		int result = 1;
		for (int i = 1; i <= n; i ++){
			result = result * i;
		}
		return result;
	}	
 
	public static void main(String[] args){
		System.out.println(calculateFactorial(5)); 
	}*/
    public static void main(String[] args) {
	    System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
	    Scanner scanner = new Scanner(System.in);
	    int size = 3;
	    int[] sourceNumbers = new int[size];
	    for (int i = 0; i < size; i++) {
	         sourceNumbers[i] = scanner.nextInt();
	    }
	    for (int i = 0; i < size; i++) {
	        if ((sourceNumbers[i] % 3 == 0) || (sourceNumbers[i] % 9 == 0))
	        	System.out.println("Число, которое делится на 3 или 9: " + sourceNumbers[i]);
	    }
    }
}
