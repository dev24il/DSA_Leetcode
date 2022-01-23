import java.util.Arrays;
import java.util.Scanner;

public class contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=1;i<=t;i++){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int l=0;l<n;l++){
                a[l] = sc.nextInt();
            }

            if(n%2==0){
                int sume = 0;
                int sumo = 0;
                int b = n/2;
                for(int j=0;j<n/2;j++){
                    sume += a[j];
                }
                double ans1 = (double)sume/b;
                for(int j=n/2;j<n;j++){
                    sumo += a[j];
                }
                double ans2 = (double)sumo/b;
                double ans = ans1 + ans2;
                System.out.println(String.format("%.6f", ans));
            }else{
                Arrays.sort(a);
                int sume = 0;
                int sumo = 0;
                int b = (n-1)/2;
                for(int j=1;j<n/2;j++){
                    sume += a[j];
                }
                double ans1 = (double)sume/b;
                for(int j=n/2;j<n;j++){
                    sumo += a[j];
                }
                double ans2 = (double)sumo/b;
                double ans = ans1 + ans2;
                System.out.println(String.format("%.6f", ans));
            }
        }
    }
}
