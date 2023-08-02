package Alexey.week_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_sortingInAscending {

    public static ArrayList arraySorter (ArrayList<Integer> incomingList) {
        boolean sortChecker = false;
        for (int i = 0; i < incomingList.size(); i++) {
            // second loop finds minimum number and move it to the front
            for (int j = i; j < incomingList.size(); j++) {
                if (incomingList.get(j) < incomingList.get(i)) {
                    int placeHolder = 0;
                    placeHolder = incomingList.get(i);
                    incomingList.set(i, incomingList.get(j));
                    incomingList.set(j, placeHolder);
                }
            }
        }
        return incomingList;
    }

    public static void main(String[] args) {
        //below is the blow for User to enter custom ArrayList
        /*int arrayListSize = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array size");
        arrayListSize = input.nextInt();

        ArrayList <Integer> userArray= new ArrayList<>();
        for (int i = 0; i < arrayListSize; i++) {
            System.out.println("Please enter " + (i+1) + " element of the array List");
            userArray.add(i, input.nextInt());*/


        ArrayList <Integer> userArray = new ArrayList<>(Arrays. asList(89, 1, -3, 0, 1, 2, 10, 0, 67));

        System.out.println("List before applying sorting method: " + userArray);

        arraySorter(userArray);

        System.out.println("List after applying sorting method: " + userArray);

    }

}
