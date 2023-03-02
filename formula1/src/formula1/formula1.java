package formula1;

import java.util.Scanner;

public class formula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Formula1 Season: ");
		String year = scan.next();
		
		switch(year) {
			case "2017":
				System.out.println("Total races of the season is 20");
				break;
			case "2016":
				System.out.println("Total races of the season is 21");
				break;
			case "1966":
				System.out.println("Total races of the season is 9");
				break;
			case "1950":
				System.out.println("Total races of the season is 8");
				break;
			default:
				System.out.println("Invalid year");
		}

	}

}
