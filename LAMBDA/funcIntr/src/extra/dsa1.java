package extra;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class dsa1 {

	    public static void main(String[] args){
		    Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		    for(int i=0;i<t;i++){
		    	System.out.println("Enter n");
		    	
		        int n = sc.nextInt();
		        System.out.println("Enter arr");
		        int arr[] = new int[n];
		        for(int j=0;j<n;j++){
		            arr[i]=sc.nextInt();
		        }
		        twiceExceptOne(n,arr);
		    }
	        //Write your code here
	    }
	    public static void twiceExceptOne(int n,int[] arr){
	         int res = arr[0];
	         for(int i=1;i<n;i++){
	             res =res^arr[i];
	         }
	         System.out.println(res);
//	        
//	        Set<Integer> set = new HashSet<>();
//	        for(int i=0;i<n;i++) {
//	        	set.add(arr[i]);
//	        }
	         
	        
	    }
	}


