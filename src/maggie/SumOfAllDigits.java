package maggie;

public class SumOfAllDigits {

    public static int sumOfAllDigits(String str){

      int sum = 0;              //use variable sum to store values from loop
        StringBuilder currentNumber = new StringBuilder(); //keeps track of each digit in the string

        for (int i = 0; i < str.length(); i++) { //loop through each character in the string
            char c = str.charAt(i);

            if(Character.isDigit(c)){
                currentNumber.append(c); // this is used to add the numbers to 'currentNumber' variable
            }else{
                if(currentNumber.length() >0){
                    sum += Integer.parseInt(currentNumber.toString()); //this will parse into an integer and add it to sum
                    currentNumber.setLength(0); //this resets current number variable back to 0 to catch the next number
                }
            }
        }

        if (currentNumber.length() >0){
            sum+= Integer.parseInt(currentNumber.toString());
        }
        return sum;
    }

    public static void main(String[] args) {

        String str = "12 java 5 apple 3";
        int sum = sumOfAllDigits(str);
        System.out.println("sum of digits: "+ sum);
    }


}
/*
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */