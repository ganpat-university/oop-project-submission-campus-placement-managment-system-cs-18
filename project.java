import java.util.*;
class placement
{
	public static void main(String[] args){
		String pd,e;
		int i;
		Scanner in = new Scanner(System.in);
		System.out.println("1 for admin login : "); 		
		System.out.println("2 for user login : "); 		
		System.out.print("Enter choice : "); 		
		i = in.nextInt();
		switch(i)
		{
			case 1:{
					String cd;
					e = in.nextLine();
					System.out.print("Enter company details : ");
					cd = in.nextLine();	
					System.out.println("company details : "+cd);
					break;
				}
			case 2:{
					String ud;
					e = in.nextLine();
					System.out.print("Enter user details : ");
					ud = in.nextLine();	
					System.out.println("user details : "+ud);
					break;
				}
		}
		System.out.println("Enter placement details : "); 		
		pd = in.nextLine();
		System.out.println("placement details : "+pd); 		
	}
}
