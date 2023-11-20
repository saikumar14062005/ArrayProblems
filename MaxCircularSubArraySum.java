package Arrays;

public class MaxCircularSubArraySum {
    static int max_circular_sub_array_sum(int[] arr) {
        int n = arr.length;
        int  res1 =arr[0],res = arr[0];

        int minending = arr[0];
        for(int i = 1 ; i < arr.length ;i++){
            minending = Math.min(minending+arr[i],arr[i]);
            res1 = Math.min(res1,minending);
        }
        int sum = 0;
        for(int i = 0 ; i < arr.length;i++){
            sum = sum + arr[i];
        }

        int maxending = arr[0];
        for(int i = 1 ; i < arr.length ;i++){
            maxending = Math.max(maxending+arr[i],arr[i]);
            res = Math.max(res,maxending);
        }


        // O(n^2) algorithm
//        for(int i = 0 ; i < n ;i++){
//            int maxending = arr[i];
//            res = Math.max(res,maxending);
//            int j = (i + 1) % n;
//            int c = 0 ;
//            while(c < n-1){
//                maxending = maxending + arr[j];
//                res = Math.max(maxending,res);
//                c++;
//                j = (j + 1) % n;
//            }
//
//        }
        if(res < 0){
            return res;
        }
        return Math.max(sum-res1,res);

    }


    public static void main(String[] args) {
        int[] arr = {-5,-2,-3,-6};
        System.out.println(max_circular_sub_array_sum(arr));
    }
}
