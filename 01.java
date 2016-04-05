import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        new Main();
    }
	
	public Main(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the money: ");
		boolean can = canMake(input.nextInt());
		
		if(can)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		input.close();
	}
	
	boolean canMake(int money){
		if(money < 3)
			return false;
		
		if (money % 3 == 0 || money % 5 == 0 || money % 7 == 0)
			return true;
		
		return canMake(money - 3) || canMake(money - 5) || canMake(money - 7);
	}
}
