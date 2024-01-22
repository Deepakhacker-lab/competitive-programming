import java.util.ArrayList;

public class recursion_subset_having_sum_equal {

    public static void subSeq(int ind, int s, int sum, int arr[], int n, ArrayList<Integer> dp){
        if(ind == n){
            if(s == sum){
                System.out.println(dp.toString());
                return;
            }
            return;
        }

        dp.add(arr[ind]);
        s += arr[ind];
        subSeq(ind+1, s, sum, arr, n, dp);

        s -= arr[ind];
        dp.remove(dp.size() -1 );
        subSeq(ind+1, s,sum, arr, n, dp);

    }

    public static void main(String[] args) {

        int[] arr = {1,2,1};

        int n = 3;

        int sum = 2;

        ArrayList<Integer> dp = new ArrayList();

        subSeq(0, 0, sum, arr, n, dp);
    }
}
