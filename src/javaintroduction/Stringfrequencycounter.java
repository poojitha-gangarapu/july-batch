package javaintroduction;

public class Stringfrequencycounter 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		   String[] s = {"Dee", "Kar", "Poo", "Sri", "Pri", "Dee", "Kar", "Dee", 
                   "Kar", "Poo", "Sri", "Dee", "Kar", "Poo", "Sri", "Pri", 
                   "Dee", "Kar"};
		  
		   for (int i = 0; i < s.length; i++) {
	            int count = 0;
	            for (int j = 0; j < s.length; j++) {
	               if (s[i] == s[j]) { 
	                    count++;
	                   
	                    }
	                  }
	                 System.out.println(s[i] + ": " + count + "times");
     }
  }
}
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   