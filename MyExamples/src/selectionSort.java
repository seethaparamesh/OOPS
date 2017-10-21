
class selectionSort {
	static int[] toBeSorted = {18,302,297,23,101,78,19,30,1,22,7,0,2,4,1,32,297 };

	public static void main(String[] args) {
		selectionSortMethod();
		for (int i = 0; i < toBeSorted.length; i++) {
			System.out.print(toBeSorted[i] + " ");
		}
	}

	public static void selectionSortMethod() {
		int sortPosition = 0;
		
		while (sortPosition < toBeSorted.length) {
			int nextLowestPosition = sortPosition;
//			System.out.print(sortPosition + "-");
//			for (int i = 0; i < toBeSorted.length; i++) {
//				System.out.print(toBeSorted[i] + " ");
//			}
			
			for (int i = sortPosition; i < toBeSorted.length - 1; i++) {
				 //System.out.println("sortPosition:"+sortPosition +" nextLowestPosition:"+nextLowestPosition);
				 //System.out.println(" comparing " + toBeSorted[nextLowestPosition] + " and " +toBeSorted[i+1]);
				if (toBeSorted[nextLowestPosition] > toBeSorted[i + 1]) {
					nextLowestPosition = i + 1;
				}
			}
			int temp = toBeSorted[nextLowestPosition];
			toBeSorted[nextLowestPosition] = toBeSorted[sortPosition];
			toBeSorted[sortPosition] = temp;
			sortPosition++;
//			System.out.println();
		}
//		for (int i = 0; i < toBeSorted.length; i++) {
//			System.out.print(toBeSorted[i] + " ");
//		}
	}

}