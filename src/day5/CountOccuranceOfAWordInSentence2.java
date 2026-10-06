package day5;

public class CountOccuranceOfAWordInSentence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
//String sentance="i am studying java in fsd java is a prog lang and java is good";				//["Mahendra" "Singh" "Dhoni"]
	String sentance="one two one three four one five one six one seven";	
//	String search="java";
	String search="one";
	String words[]=sentance.split(" ");

	int occuranceCounter=0;   //word=one

           for(String word:words)
{
	if(word.equalsIgnoreCase(search))
		occuranceCounter++;		//0,1,2,3
}
System.out.println(occuranceCounter);

}
}