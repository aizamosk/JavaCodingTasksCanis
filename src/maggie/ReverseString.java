package maggie;

import java.util.Arrays;

public class ReverseString {

    public static void reverseString(String str){

        char[] arr1 = str.toCharArray();
        int left = 0;
        int right = arr1.length-1;

        for(left = 0; left < right; left++, right--){
            char temp = arr1[left];
            arr1[left]= arr1[right];
            arr1[right]= temp;
        }

      //  System.out.println(Arrays.toString(right+left));


    }

}
