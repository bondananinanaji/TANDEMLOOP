package Tandemloop;
import java.util.Scanner;
public class Problem2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter how many odd integers you want: ");
		int n=input.nextInt();
		int count=0;
		for(int i=1;i<=1000;i++) {
			if (count==n) {
				break;
			}
			if(i%2!=0) {
				System.out.print(i+" ");
				count++;
			}
		}

	}

}
