package com.testtribe.week1;

public class Country { //Identifier 1 : Country
	
	static boolean Mexico; //identifier 2 with capital "M"
	
	public static void main (String args []) {
		
		Boolean MostPopulated = new Boolean("true");  //identifier 3 : MostPopulated
		
		Boolean secondMostPopulated = new Boolean("false");  //identifier 4 with small case 
		
		Boolean _3rdMostPopulated = new Boolean("true");  //identifier 5 with underscore and 6 with digit
		
		Boolean $4thMostPopulated = new Boolean("true");  //identifier 7 with $ sign and Identifier 8 : used digit in identifier name
	
		//new structure of wrapper class
		Boolean _5thMostPopulated = Boolean.valueOf("none"); //identifier 9
		
		Boolean SixthMostPopulated = Boolean.valueOf("none"); //identifier 10
		
			System.out.println("The Most Populated country is China :" + MostPopulated);
			System.out.println("The Second most Populated country is Russia :" + secondMostPopulated);
			System.out.println("The Third most populated country is US :" + _3rdMostPopulated);
			System.out.println("The Fourth most Populated country is Indonesia :" + $4thMostPopulated);
			System.out.println("The Fifth most Populated country is Brazil : " + _5thMostPopulated);
			System.out.println("The Sixth most Populated country is Brazil : " + SixthMostPopulated);
			System.out.println("The Seventh most Populated country is Mexico : " + Mexico); //taken Outside from main method

		}
}