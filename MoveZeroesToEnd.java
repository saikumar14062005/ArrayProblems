package Arrays;

public class MoveZeroesToEnd {
    static void swap(int a , int b){
        int t = a;
        a= b;
        b = t;
    }
    static void movezeores(int arr[]){
        int count = 0,t = 0;
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] != 0){
//                swap(arr[i],arr[count]);
                 t = arr[i];
                arr[i] = arr[count];
                arr[count] = t;
                count++;

            }

        }
        for(int i = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,1};
        movezeores(arr);
//        for(int i = 0 ; i < arr.length;i++){
//            System.out.println(arr[i]);
//        }

    }
}
