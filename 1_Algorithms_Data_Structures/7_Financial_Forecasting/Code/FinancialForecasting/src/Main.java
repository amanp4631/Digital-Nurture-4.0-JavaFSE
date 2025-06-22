import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Present value: ");
		double pv = sc.nextDouble();
		System.out.print("Enter Growth Rate: ");
        double growthRate = sc.nextDouble();
        System.out.print("Enter years: ");
        int years = sc.nextInt();
        
        Forecast f = new Forecast();

        double forecast = f.futureValue(pv, growthRate, years);
        System.out.printf("Forecast Value after " + years + " years is " + forecast );
        
        sc.close();
    }

}
