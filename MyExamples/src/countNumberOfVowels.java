
public class countNumberOfVowels {

	public static void main(String[] args) {
		// TODO count the number of vowels in the given array
String[] givenStringArray={"a","b","e","i","o","u"};	
int count =0;
int count1=0;
for(int i=0;i<givenStringArray.length;i++){
if((givenStringArray[i].matches("a"))||(givenStringArray[i].matches("e"))||(givenStringArray[i].matches("i"))||(givenStringArray[i].matches("o"))||(givenStringArray[i].matches("u"))){
		count++;
		
	}
else count1++;
		
}System.out.println("found "+count+" vowels and"+count1+ "consonants");

	}

}
