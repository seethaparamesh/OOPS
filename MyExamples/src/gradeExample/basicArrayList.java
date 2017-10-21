package gradeExample;

import java.util.ArrayList;
import java.util.Collections;

public class basicArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<String> colors=new ArrayList<String>();
  colors.add("blue");
  colors.add("yellow");
  colors.add(1, "pink");
  colors.add("violet");
  String retrievedElement=colors.get(2);
  String elementRemoved=colors.remove(3);
  String foundElement=colors.get(1);
  System.out.println(" the colors in the created arraylist are " +colors);
  String updateElement=colors.set(1, "magenta");
  System.out.println("the updated colors list is " +colors);
  System.out.println("The sought element is "+foundElement);
  System.out.println("the removed element is " +elementRemoved);
  System.out.println("The retrieved element is "  +retrievedElement);
 
  ArrayList<Integer> listToBeSorted=new ArrayList<Integer>();
  ArrayList<Integer> listToBeSortedNew=new ArrayList<Integer>(100);
  
  listToBeSorted.add(1);
  listToBeSorted.add(89);
  listToBeSorted.add(97);
  listToBeSorted.add(65);
  listToBeSorted.add(54);
  listToBeSorted.add(77);
  //adding 0s to the new list so that we can copy the old list to the new one-in arraylist,size() and capacity() are different:)
  
  for(int i =0;i<6;i++){
	  listToBeSortedNew.add(0);
  }
  
  System.out.println("the list before sorting" +listToBeSorted);
  Collections.sort(listToBeSorted);
  System.out.println("the list after sorting is " +listToBeSorted);
  Collections.copy(listToBeSortedNew, listToBeSorted);
  System.out.println("the list after copying is " +listToBeSortedNew);
	}

}
