package array;

import java.util.Deque;
import java.util.LinkedList;

public class Array7 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] arr = nums;
        int[] brr = new int[arr.length-k+1];

		Deque<Integer> dq = new LinkedList<>();
		for(int i=0;i<k;i++){
			while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
				dq.removeLast();
			}

			dq.addLast(i);
		}

		int j = 0;
		for(int i=k;i<arr.length;i++){
			brr[j] = arr[dq.peekFirst()];
			j++;

			if(!dq.isEmpty() && dq.peekFirst()<=i-k){
				dq.removeFirst();
			}

			while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
				dq.removeLast();
			}
			dq.addLast(i);
		}
		brr[j] = arr[dq.peekFirst()];
		return brr;
    }
}
