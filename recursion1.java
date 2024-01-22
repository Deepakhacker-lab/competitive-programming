public class recursion1 {

    public static int subSeq(int ind, int s, int sum, int arr[], int n){
        if(ind == n){
            if(s == sum) return 1;
            else return 0;
        }

        s += arr[ind];
        int l = subSeq(ind+1, s, sum, arr, n);

        s-= arr[ind];
        int r = subSeq(ind+1, s,sum, arr, n);

        return l+r;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,1};

        int n = 3;

        int sum = 2;

        System.out.print(subSeq(0, 0, sum, arr, n));
    }
}
