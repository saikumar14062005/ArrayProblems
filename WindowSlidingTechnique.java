package Arrays;

public class WindowSlidingTechnique {
// by O(n^2) time complexity
//    static int window_sliding(int arr[],int k){
//        int res = Integer.MIN_VALUE;
//        for(int i = 0 ; i < arr.length-(k-1);i++){
//            int curr_sum = 0;
//            for(int j = i ; j < i + k;j++){
//                curr_sum = curr_sum + arr[j];
//            }
//            res = Math.max(res,curr_sum);
//        }
//        return res;
//    }
// by O(

    static int window_sliding(int arr[],int k){
        int maxending = 0 ,res = Integer.MIN_VALUE;
        for(int i = 0 ; i < k ;i++){
            maxending = maxending+arr[i];
        }
        res = maxending;
//        for(int i = 1 ; i < arr.length-(k-1) ;i++){
//            maxending = maxending-arr[i-1]+arr[i+(k-1)];
//            res = Math.max(res,maxending);
//        }
        for(int i = k ; i < arr.length;i++){
            maxending = maxending+arr[i]-arr[i-k];
            res = Math.max(res,maxending);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(window_sliding(arr,3));
    }
}
