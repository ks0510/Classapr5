package practice;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setting sc object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking size of array

		System.out.println("Enter size of Array");
		int size = sc.nextInt();

		int[] arr = new int[size];
		int sum=0;
		
		//taking elements of array

		System.out.println("Enter elements");
		for (int i = 0; i < size; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		for(int i=0;i<size;i++) {
			sum+=arr[i];
			if(sum==0) {
				System.out.println(0+" "+i);
			}
		}
		
		
