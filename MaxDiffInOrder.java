package Arrays;

public class MaxDiffInOrder {


    static int maxdiff(int arr[]){
        int max = arr[1] - arr[0];
        int min = arr[0];
        for(int i =  1 ; i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(max < (arr[i]-min) && arr[i] != min ){
                max = arr[i]-min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,5,1,15};
        int k = maxdiff(arr);
        System.out.println(k);

    }
}
