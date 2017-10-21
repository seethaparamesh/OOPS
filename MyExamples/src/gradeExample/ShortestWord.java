package gradeExample;

public class ShortestWord {

	public static void main(String[] args) {
		System.out.println(findShort("turns  random test cases  easier than writing  basic ones"));

	}

	public static int findShort(String s) {
        String[] split = s.trim().split(" ");
		int shortestlength = split[0].length();

		for (int i = 0; i < split.length; i++) {
			if (split[i].length() < shortestlength && !split[i].equals(""))
				shortestlength = split[i].length();
		}
		return shortestlength;
    }

}
