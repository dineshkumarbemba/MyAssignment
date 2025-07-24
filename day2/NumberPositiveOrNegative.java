package week1.day2;

public class NumberPositiveOrNegative {
	public void positiveorNegative(int number) {
		
		if(number<0) {
			System.out.println(number +"Negative number");
		}
		else if(number>0){
			System.out.println(number +"Positive number");

		}
	}
	
	public static void main(String[] args) {
		NumberPositiveOrNegative posorneg = new NumberPositiveOrNegative();
		posorneg.positiveorNegative(-25);
	}
}

