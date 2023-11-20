package Arrays;

public class RainWaterDrop {

    static int rainwater(int arr[]){
        int flag = 0;
        // to check ascending order
        for(int i = 0 ; i < arr.length -1;i++){
            if(arr[i+1] < arr[i]){
                flag++;
            }
        }
        int flag2 =0;
        // to check descending order
        for(int i = 1 ; i < arr.length ;i++){
            if(arr[i] > arr[i-1]){
                flag2++;
            }
        }
        if(flag == arr.length-1 || flag2 == arr.length-1){
            return 0;
        }
        int max = 0,smax = 0;
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            }
        }
        if(max == arr[0]){
            for(int i = 1 ; i < arr.length ;i++){
                if(arr[i] > smax){
                    smax = arr[i];
                }
            }
        }

        int res = 0;
        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i] != smax && arr[i] != max){
                res = res + (smax-arr[i]);

            }
        }
        return res;


    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,3};
        System.out.println(rainwater(arr));
    }
}
