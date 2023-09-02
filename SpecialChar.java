package string;

public class SpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="m@n!sh";
     int count=0;
     for(int i=0;i<str.length();i++)
		{
			if((int)str.charAt(i)>64 && (int)str.charAt(i)<91 || (int)str.charAt(i)>96 && (int)str.charAt(i)<122 )
			{}
				
			//System.out.println("No special characters in string);
				else
				{
				    ++count;
					System.out.println(str.charAt(i));
				
				}
			
			}
     System.out.println(count);
	}

}
