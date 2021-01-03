package Week3Day1;

public class DietPlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String option1 = "Monday";
		String option2 = "Saturday";
		String option3 = "Tuesday";
		String option4 = "Thursday";
		String option5 = "Friday";

		
		switch(option1) {
		
		case "Monday" :
		case "Wednesday" :
		
			System.out.print("Mon & Wed. : Eat veggies with any light sauce");		
			break;
		}
		
		switch(option2) {

		case "Saturday" :
		case "Sunday" :

		System.out.print("Sat. and Sun. : Eat Chicken with any salad");
		break;

		}
		
		switch(option3) {
		case "Tuesday" :
			System.out.print("Tue : Have some fruits in meal");
			break;
		}
			switch(option4) {

		case "Thursday" :
			System.out.print("Thursday : Have some fibre in meal");
			break;
			}
			
			switch(option5) {

		case "Friday" :
		System.out.print("Firday: Have some carbs an dairy in meal");
		break;
		
		}
		
	}
	
}




