package stack;

public class stack10 {
    public int largestRectangleArea(int[] heights) {
        int[] arr = heights;
        int[] rb = new int[arr.length];
        rb[0] = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                rb[i] = -1;
            }else{
                rb[i] = i-1;
            }
        }

        int[] lb = new int[arr.length];
        lb[arr.length-1] = arr.length;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                lb[i] = arr.length;
            }else{
                lb[i] = i+1;
            }
        }

        int max_area = 0;
        for(int i=0;i<arr.length;i++){
            int width = rb[i] - lb[i] - 1;
            int area = arr[i] * width;
            max_area = Math.max(area, max_area);
        }
        return max_area;
    }
}
