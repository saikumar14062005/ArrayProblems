package Arrays;

public class MaxConsecutiveOnes {

    //code by gfg

    static int max_consecutive_ones(int arr[]){
        int curr = 0,res = 0 ;
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] == 0){
                curr = 0;
            }
            else {
                curr++;
                if(curr > res)
                    res = curr;
            }
        }
        return res;
    }


    // code by me
//    static int max_consecutive_ones(int arr[]){
//        int res = 0 ,count = 0;
//        int flag = 0;
//        if(arr[arr.length-1] == 1){
//            arr[arr.length -1] = 0;
//            flag = 1;
//        }
//        for(int i = 0 ; i < arr.length;i++){
//            if(arr[i] == 1){
//                count++;
//            }
//            if(arr[i] == 0 && i != arr.length-1){
//                if(count > res){
//                    res = count;
//                    count = 0;
//                }
//            }
//            else if(arr[i] == 0 && i == arr.length-1){
//                if(flag == 0){
//                    if(count > res){
//                        res = count;
//                    }
//                }
//                else{
//                    if(count+1 > res){
//                        res = count + 1;
//                    }
//                }
//
//            }
//        }
//        return res;
//    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1};
        System.out.println(max_consecutive_ones(arr));
    }
}
