package workshop5;

import java.util.Iterator;

public class MyList {
	
	String[] array;
	String[] tempArray;
	public MyList() {
		array=new String[0];
	}
	
	public void add(String item) {
		
		tempArray= array;
		array = new String[array.length+1];
		
		for (int i = 0; i < tempArray.length; i++) {
			array[i]=tempArray[i];
		}
		array[array.length-1]=item;
	}
	
	public String[] getData() {
		return array;
	}
}
