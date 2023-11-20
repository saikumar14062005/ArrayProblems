package Arrays;

public class MinNoOfFlips {

// code by me
//    static void min_no_of_flips(int arr[]){
//        int flag = 1;
//        if(arr[0] == 0){
//            flag = 0;
//        }
//        int beg = 0,end = 0,sai = 0;
//        for(int i = 1 ; i < arr.length;i++){
//            if(flag == 1){
//                if(arr[i] == 0 && sai == 0){
//                    beg = i;
//                    sai = 1;
//                }
//                if((i == arr.length-1 || arr[i] == 0 && arr[i+1] == 1)){
//                    end = i;
//                    System.out.println("from"+beg+"to"+end);
//                    beg = 0;
//                    end = 0;
//                    sai = 0;
//                }
//
//            }
//            else{
//                if(arr[i] == 1 && sai == 0){
//                    beg = i;
//                    sai = 1;
//                }
//                if(( i == arr.length-1 || arr[i] == 1 && arr[i+1] == 0)){
//                    end = i;
//                    System.out.println("from"+beg+"to"+end);
//                    beg = 0;
//                    end = 0;
//                    sai = 0;
//                }
//            }
//        }
//    }

    // code by gfg
    static void min_no_of_flips(int arr[]){
        for(int i = 1 ; i < arr.length ;i++){
            if(arr[i] != arr[i-1]){
                if(arr[i] != arr[0]){
                    System.out.println("from"+i+"to");
                }
                else{
                    System.out.print(i-1);
                }
            }
        }
        if(arr[arr.length-1] != arr[0]){
            System.out.print(arr.length-1);
        }
    }
    public static void main(String[] args) {

        int[] arr = {0,0,0,1,0,0,0,1,0,1};
    min_no_of_flips(arr);
    }

}
