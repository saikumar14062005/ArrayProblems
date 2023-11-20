package Arrays;

public class FrequencyOfSortedArray {

    static void frequency_of_sorted_array(int arr[]){
//        int max ;
        int i = 0;
        while(i < arr.length){
           int  max = 0;
            for(int j = i ; j < arr.length;j++){
                if(arr[i] == arr[j]){
                    max++;
//                    System.out.println(max);
                }
            }
            System.out.println("frequency of the element " + arr[i] + " " + max);
            i = i + max;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,3,3,4,4,6,6,6,6,6,6};
        frequency_of_sorted_array(arr);
    }
}
