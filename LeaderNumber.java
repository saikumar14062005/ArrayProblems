package Arrays;

public class LeaderNumber {

    static void leaderNumber(int arr[]){
        int leadnum = arr[arr.length-1];
        System.out.println(leadnum);
        for(int i = arr.length -2 ; i >= 0 ; i--){
            if(arr[i] > leadnum){
                leadnum = arr[i];
                System.out.println(leadnum);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,4,2,6,1};
        leaderNumber(arr);
    }
}
