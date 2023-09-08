package string;

public class String11
{
	 
	public static void main(String[] args)
	{
	
		int count=0;
		
		String str="ashtfirgullaallahsemangathamaafi";

      for(int i=0;i<str.length()-1;i++)
      {
    	  for(int j=0;j<str.length();j++)
    	  {
    		  if(str.charAt(i)==str.charAt(j))
    			  	count++;

    			  System.out.println(str.charAt(i) + " Count is : "+count);
    		 
    	  }

		
      }
	}

}
