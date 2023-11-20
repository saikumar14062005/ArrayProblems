package Arrays;

public class LeftRotateAnArray {


    static void leftrotate(int[] arr){
        int k =  arr[0];
        for(int i = 1 ; i < arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = k;

    }

    public static void main(String[] args) {
        int[] arr = {6,3,4,5};
        leftrotate(arr);
        for (int i = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
