package Arrays;

public class LeftRotateAnArrayByD {

    static void reverse(int[] arr ,int b ,int d){
//        for(int i = b ,k = d; i < (b+d/2) ;i++,k--){
//             int temp = arr[i];
//             arr[i] = arr[k-1];
//             arr[k-1] =temp;
//        }
        while(b < d){
            int temp = arr[b];
            arr[b] = arr[d];
            arr[d] = temp;
            b++;
            d--;
        }
    }

    static void leftRotateByd(int[] arr,int d){

        reverse(arr,0 ,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0, arr.length-1);




    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        leftRotateByd(arr,4);
        for (int i = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
