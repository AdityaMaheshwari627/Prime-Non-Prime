package Arrays;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
        	arr[i]=obj.nextInt();
        }
        //Identify Prime Number or not
        System.out.print("Prime Numbers:");
        for(int i=0;i<n;i++) {
        	if(isPrime1(arr[i])) {
        		System.out.print(arr[i]+" ");
        	} 
        }
        System.out.print("\nNon-Prime Numbers:");
        for(int i=0;i<n;i++) {
        	if(!isPrime1(arr[i])) {
        		System.out.print(arr[i]+" ");
        	}
        }
	}

	public static boolean isPrime1(int num) {
		if(num<=1) {
		return false;
		}
	
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
		}
	}
	return true;
	}
}
