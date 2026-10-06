package day5;

public class CountWordsInAString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        String name="Kusumkar Prasad Gajanan";
       
    	int wordCounter=0;
    	for(int i=0;i<name.length();i++)
    	{
    		if(name.charAt(i)==' ')
    			wordCounter++;
    	}
    	
    	System.out.println("Number of words are "+ (wordCounter+1));
    	
    	
    }
  }