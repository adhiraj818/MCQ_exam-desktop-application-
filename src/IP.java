import java.net.*;
import java.util.*;
public class IP {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter URL");
		String s=sc.nextLine();
		try {
		InetAddress ip=InetAddress.getByName(s);
		System.out.println(ip);
		}catch(Exception e)
		{						
		}
		
	}
}
//https://www.facebook.com:113/index.php