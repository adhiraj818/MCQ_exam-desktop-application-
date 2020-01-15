import java.net.*;
import java.util.*;
public class url {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter URL");
		String s=sc.nextLine();
		try {
		URL url=new URL(s);
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getFile());
		}catch(Exception e)
		{		
			System.out.println(e);
		}
		
	}
}
//https://www.facebook.com:113/index.php