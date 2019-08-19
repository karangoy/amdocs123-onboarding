package mathApp.amdocs;

import java.util.Scanner;

public class Addition {
	
	public int add(int x, int y) {
		return x+y;
	}
public static void main(String[] arg) {
	
	Scanner sc = new Scanner(System.in);
	
	int firstinput =sc.nextInt();
	int secondinput =sc.nextInt();
	
	Addition addition = new Addition();
	int result= addition.add(firstinput, secondinput);
	
	System.out.println("result="+result);
}
}
