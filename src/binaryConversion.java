import java.util.*;
public class binaryConversion {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int nums[] = {2,2,4,5,8,6,2,3,5,5,5,9,0,9,6};
		
		//1
		//2
		int sum =0;
		for(int i =0; i< nums.length; i++) {
			sum += nums[i];
			
		}
		
		//3
		for(int j =0; j< nums.length; j++) {
		if(nums[j]%2 ==1) {
			System.out.println("Found an odd");
		}	
		}
		//4
		boolean condition = true;
		for(int j =0; j< nums.length; j++) {
			if(nums[j] == 0) {
				condition = false;
			}	
			}
		if(condition == false) {
			System.out.println("Found a zero");
		}
		else {
			System.out.println("NO zeros");
		}
		//5
		//20t  = 60 = 30g
		// 3 hours 
		// 2 hours
		//120/5 = average speed
		
		//6
		int count =0;
		for(int j =0; j< nums.length; j++) {
			if(nums[j]/6 ==1) {
				count++;
			}}
		if(count >=2) {
			System.out.println("Two 6s");
			
		}
			
		//7
		boolean condition1 = false;
		for(int j =0; j< nums.length; j++) {
			if(j != nums.length-1) {
			if(nums[j] == 2 && nums[j+1]==3) {
				System.out.println("Found 2/3");
				condition1 = true;
			}}}
		if(condition1 == false) {
			System.out.println("NO 2/3");
		}
			//8
		boolean another = true;
		for(int i =0; i<nums.length- 1; i++) {
			if(nums[i] > nums[i+1]) {
				another = false;
			}
		}
		if(another = true) {
			System.out.println("In order");
		}
		else
		{
			System.out.println("NOT in order");
		}
		
		//9
		int even = 0;
		//int odd = 0; 
		for (int i =0; i<nums.length; i++) {
			if(nums[i]%2 ==0) {
				even++;
			}
			
		}
		if(even % 2 ==0) {
			System.out.println("Even evens");
		}
		else {
			System.out.println("UNeven evens");
			
		}
		//10
		condition = false;
		for (int i =0; i<nums.length -2; i++) {
			if(nums[i]== nums[i+1] &&nums[i+1]==nums[i+2]) {
				System.out.println("Three in a row");
				condition = true;
			}
			
		}
		if(condition != true) {
			System.out.println("NO Three in a row");
		}
		
		//11
		int max = nums[0]; 
		int min = nums[0];
		for(int i =1; i<nums.length; i++) {
			if(nums[i]> max) {
				max = nums[i];
			}
			if(nums[i]<min) {
				min = nums[i];
			}
		}
			System.out.println(max-min);
			
		//12
			System.out.println("The numbers that have pairs are:");
			for(int i =0; i<nums.length -1; i++) {
				if(nums[i]== nums[i+1]) {
				System.out.println(nums[i]);
				}
				
			}
		//13
			
		// Binary Conversion app
			System.out.println("Enter a binary number >>");
			String n =scan.nextLine();
			
			
			int anotherNum =0;
			double sum1 = 0;
		for (int i = n.length() -1 ; i>=0; i--) {	
		int number = Integer.parseInt(n.substring(i,i+1));
		sum1 = number * (Math.pow(2,anotherNum))+ sum1;
		anotherNum++;
		}
		System.out.println(n +">>" +sum1);
}
}
