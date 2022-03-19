package workshop5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		MyList cities = new MyList();
		
		cities.add("Ankara");
		cities.add("Ýzmir");
		cities.add("Adana");
		
		for (String city : cities.getData()) {
			System.out.println(city);
		}
		

      
	}



}
