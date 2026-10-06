package day5;

public class BiggestWordInString {

	public static void main(String[] args) {
		String name="Kusumkar Prasad Gajanan Student of Engineering";				
		String words[]=name.split(" ");		
		
		
		int max=0;  //max = stone in hand  10,16
		String maxWord="";
		
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()>max)
			{
				max=words[i].length();
				maxWord=words[i];
			}
		}
		
		System.out.println("Biggest word in sentance is "+maxWord);
	}
	}