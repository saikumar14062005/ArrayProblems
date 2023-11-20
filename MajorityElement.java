package Arrays;

public class MajorityElement {
    static int majority_candidate(int arr[]){
        int res = 0,count = 1;
        for(int i = 1 ; i < arr.length;i++){
            if(arr[res] == arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                res = i;
                count = 1;
            }
        }
         return res;
    }

    static int majority_element(int arr[]){
        int res = majority_candidate(arr);
        int count = 0;
        for(int i = 0 ; i < arr.length;i++){
            if(arr[res] == arr[i]){
                count++;
            }
        }
        if(count < arr.length/2){
            return -1;
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = {8,7,6,8,6,6,6,6};
        System.out.println(majority_element(arr));
    }
}
