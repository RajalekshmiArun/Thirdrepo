package demo;
public class Palindrome {

	//Write a program to check whether the given number is Palindrome or not
	// Method1: To find the reverse (pass the number in argument)
	//Method2: To check Palindrome or not
	public static int reverse(int a)
	{
	int rev=0;
	while(a>0)
	{
	rev=rev*10+a%10;
	a=a/10;
	}
	return(rev);
	}

public static void pali(int revn,int a)
{
int re=reverse(a);
if (a==re)
	System.out.println("Palindrom");
else
	System.out.println("Not Palindrom");
	

}


	public static void main(String args[] )
	{
	int a=12321;
	int revn= reverse(a);
	System.out.println("Reverse is "+revn);
	Palindrome.pali(revn,a);
	}
	}


