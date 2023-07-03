package Tandemloop;
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter integer: ");
		int n=input.nextInt();
		int count=0;
		if(n%2!=0) {
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
		else {
			for(int i=1;i<=1000;i++) {
				if (count==n-1) {
					break;
				}
				if(i%2!=0) {
					System.out.print(i+" ");
					count++;
				}
			}
		}
	}

}
