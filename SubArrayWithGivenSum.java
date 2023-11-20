package Arrays;

public class SubArrayWithGivenSum {

    // using O(n^2)
//    static boolean subarray_with_given_sum(int arr[],int sum){
//
//        for(int i = 0 ; i< arr.length;i++){
//            int maxending = 0;
//            for(int j = i ;j < arr.length;j++){
//                maxending = maxending + arr[j];
//                if(maxending == sum){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    static  boolean subarray_with_given_sum(int arr[],int sum){
        int maxending = arr[0],s = 0;
        for(int i = 0 ; i < arr.length;i++){
            maxending = maxending + arr[i];
            if(maxending > sum){
                maxending = maxending - arr[s];
                s++;
            }
            if(maxending == sum){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(subarray_with_given_sum(arr,));
    }
}
