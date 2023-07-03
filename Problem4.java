package Tandemloop;
import java.util.Scanner;
public class Problem4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n=input.nextInt();
		int []a=new int[n];
		System.out.println("Enter the Array Elements: ");
		for(int i=0;i<a.length;i++) {
			a[i]=input.nextInt();
		}
		int count=0;
		for(int i=1;i<=9;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[j]%i==0) {
					count++;
				}
			}
			System.out.print(i+":"+count+",");
			count=0;
		}
	}
}
