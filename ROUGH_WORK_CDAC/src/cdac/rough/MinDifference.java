package cdac.rough;

import java.util.ArrayList;
import java.util.List;

public class MinDifference {
	public static int minDiff(List<Integer> px) {
		int[] arr = new int[px.size()];
		for(int i=0;i<px.size();i++) {
			arr[i] = px.get(i);
		}
//		int diff = -1;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] < currMin) {
//				currMin = arr[i];
//			} else if(diff < arr[i] - currMin){
//				diff = arr[i] - currMin;
//			}
//		}
		int diff = -1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int now = arr[i] - arr[j];
				int now2 = Math.abs(now);
				if(Math.abs(now) > diff) {
					diff = now2;
				}
			}
		}
		return diff;
	}
	public static void main(String[] args) {
		List<Integer> px = new ArrayList<Integer>();
		px.add(5);
		px.add(9);
		px.add(1);
		px.add(3);
		int soln = minDiff(px);
		System.out.println(soln);
		
		
//		int arr[]={5,9,3,1};
//	       int max=0;
//	       for(int i=1;i<4;i++){
//	           int j=i,k=i;
//	          while(arr[j]>0 && arr[j-1]<arr[k] ){
//	           if(max<arr[k]-arr[j-1]){
//	               
//	               max=arr[k]-arr[j-1];
//	           }
//	           j--;
//	       }
//	      
//	       
//	     }
//	     System.out.println(max);

	}
}
