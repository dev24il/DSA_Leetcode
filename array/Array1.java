package array;
import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int i=0,j=0,l=0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> arr = new ArrayList<>();
        while((i < nums1.length && j < nums2.length)){
            if(nums1[i] == nums2[j] && (l > 0 && arr.get(l-1) != nums1[i])){
                arr.add(l, nums1[i]);;
                i++;
                j++;
                l++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }
        }

        int[] brr = new int[arr.size()];
        for(int k=0;k<arr.size();k++){
            brr[k] = arr.get(k);
        }
        return brr;
    }
}
