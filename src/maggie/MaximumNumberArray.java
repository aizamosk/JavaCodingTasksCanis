package maggie;

public class MaximumNumberArray {

    public static int maximumNumber(int[] arr){

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max=arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int [] arr = { 100, 43, 77, 830, 888};
        int maxNumber = maximumNumber(arr);
        System.out.println(maxNumber);
    }
}
