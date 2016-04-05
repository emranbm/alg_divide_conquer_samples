import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        new Main();
    }
	
	public Main(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int v = halat(input.nextInt());
		
		System.out.println(v + "");
		
		input.close();
	}
	
	int halat(int cap){
		
		if(cap == 0)
			return 1;
		
		if (cap < 3)
			return 0;
		
		int a,b,c;
		a = halat(cap - 3);
		b = halat(cap - 5);
		c = halat(cap - 7);
		
		return a+b+c;
	}
}
