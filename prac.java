import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=1;i<=t;i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int ans = 8;
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
                if(arr[j]!=6 && arr[j]!=13 && arr[j]!=20 && arr[j]!=27 && arr[j]!=7 && arr[j]!=14 && arr[j]!=21 && arr[j]!=28){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
