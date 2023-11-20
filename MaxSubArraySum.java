package Arrays;

public class MaxSubArraySum {
    static int max_sub_array_sum(int arr[]){
        int sum = 0,res = arr[0];
//        int flag = 0;
//        for(int i = 0; i < arr.length;i++){
//            if(arr[i] < 0){
//                flag++;
//            }
//        }
//        if(flag == arr.length){
//            int max = arr[0];
//            for(int i = 1 ; i < arr.length;i++){
//                if(max < arr[i]){
//                    max =arr[i];
//                }
//            }
//            return max;
//        }

            // Naive solution
//        for(int i = 0 ; i < arr.length ; i++){
//            sum = 0;
//            for(int j = i ; j < arr.length;j++){
//                sum = sum + arr[j];
//                if(sum  > res){
//                    res = sum;
//                }
//            }
//        }

        // O(n) time complexity but O(n) extra space complexity
//        int[] max = new int[arr.length];
//        max[0] =arr[0];
//        for(int i = 1; i < arr.length;i++){
//
//            if(arr[i] < (max[i-1]+arr[i])){
//                max[i] = max[i-1]+arr[i];
//            }
//            else{
//                max[i] = arr[i];
//            }
//        }
//        for(int i = 0 ; i < max.length;i++){
//            if(res < max[i]){
//                res = max[i];
//            }
//        }


        int maxending = arr[0];
        for(int i = 1 ; i < arr.length ;i++){
            maxending = Math.max(maxending+arr[i],arr[i]);
            res = Math.max(res,maxending);
        }



        // telivi lekunda n cube time complexity tho chesina code by me
//        for(int i = 0 ; i < arr.length;i++){
//            for(int j = i ; j < arr.length;j++){
//                sum = 0;
//                for(int k = i ; k <= j ;k++){
//                    sum = sum + arr[k];
//                }
//                if(sum > res){
//                    res = sum;
//                }
//
//            }
//        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0,5,-2,3,6};
        System.out.println(max_sub_array_sum(arr));
    }
}
