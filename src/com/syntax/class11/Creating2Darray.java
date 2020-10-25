package com.syntax.class11;

public class Creating2Darray {

	public static void main(String[] args) {
		
		//create 2d array of food:
		//american
		//italian
		//asian
		//afghani
		//indian
		
		String[][] food= {
				
				{"Steak", "Hot Dog", "Cheeseburger"},
				{"Pizza", "Pasta", "Canoli"},
				{"Sushi", "Ramen", "Fried Rice", "Dumplings"},
				{"Kebab", "Manto"},
				{"Beriyani", "Masal", "Curry", "Chicken Tikka Masala"},
		};
		
		for(String[] dishes:food) {
			
			for(String dish:dishes) {
				System.out.print(dish+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------");
		
		for(int i=0; i<food.length; i++) {
			
			for(int j=0; j<food[i].length; j++) {
				
				System.out.println(food[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}
