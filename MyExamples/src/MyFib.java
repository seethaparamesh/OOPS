
public class MyFib {

	public static void main(String[] args) {
		
		int currNum;
		int prevNum = 1;
		int prevprevNum = 0;
		Add a = new Add();
		for (int i = 0; i <= 20; i++) {
			currNum = a.AddInt(prevNum, prevprevNum);
			currNum = prevNum + prevprevNum;
			System.out.print(currNum + " ");
			prevprevNum = prevNum;
			prevNum = currNum;

		}
		System.out.println();

		prevNum = 1;
		prevprevNum = 0;

		int i = 0;
		while (i <= 20) {
			currNum = prevNum + prevprevNum;
			System.out.print(currNum + " ");
			prevprevNum = prevNum;
			prevNum = currNum;
			i++;

		}

	}

}
