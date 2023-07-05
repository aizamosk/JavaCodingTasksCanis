package maggie;

import javax.imageio.stream.ImageInputStream;

public class UniqueCharacters {

public static void uniqueChar(String str){
    String unique = "";

        for (int i = 0; i < str.length(); i++) { // loops through each char of string
        char each = str.charAt(i); //this isolates each char

        if(str.indexOf(each) == str.lastIndexOf(each)  ){//this checks if there are any other copies of the char
            unique += each;
        }

    }
        System.out.println(unique);

}
}
