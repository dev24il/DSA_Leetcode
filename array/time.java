package array;

public class time {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int ans = tickets[k];
        int ct = 0;
        for(int i=0;i<tickets.length;i++){
            if(tickets[i]<ans){
                ct += tickets[i];
            }else{
                ct += ans;
            }
        }
        
        int her = 0;
        for(int i=0;i<tickets.length;i++){
            if(tickets[i] >= ans && i > k){
                her++;
            }
        }
        return ct-her;
    }
}
