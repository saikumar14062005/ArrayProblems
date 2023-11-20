package Arrays;

public class LargestEvenOddSubArray {
        static int largest_even_odd_sub_array(int arr[]) {

            int count = 1,res = 0;
                    for (int j =  1; j < arr.length; j++) {
                            if (arr[j] % 2 == 0 && arr[j - 1]% 2 != 0) {
                                count++;
                            }
                            else if(arr[j] % 2 != 0 && arr[j-1] % 2 == 0){
                                count++;
                            }
                            else {
                                count = 1;
                        }
                            if(res < count){
                                res = count;
                            }
                        }
                    return count;
            }
    public static void main(String[] args) {
            int[] arr = {5,10,20,6,3,8};
        System.out.println(largest_even_odd_sub_array(arr));
    }
}
