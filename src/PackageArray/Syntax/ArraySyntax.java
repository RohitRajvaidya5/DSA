package PackageArray.Syntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySyntax {

    public static void main(String[] args) {

        // why use arrays ?

        // Store roll numbers
        int roll_no1 = 17;
        int roll_no2 = 19;
        int roll_no3 = 25;

        // syntax of array
        // datatype [] variable_name = new datatype [size of the array]

        int [] rollNumbers = new int[3];
        rollNumbers[0] = roll_no1;
        rollNumbers[1] = roll_no2;
        rollNumbers[2] = roll_no3;

        String [] names;
        names = new String[3];

        float [] score = {1.23f, 5.3f, 10.3f};

        System.out.println(Arrays.toString(rollNumbers));


        Scanner input = new Scanner(System.in);

        for (float t : score){
            System.out.println(t);
        }

        // multidimensional array

        int [][] array2d = new int[2][2];

        array2d[0][0] = roll_no1;
        array2d[0][1] = roll_no2;
        array2d[1][0] = roll_no3;
        array2d[1][1] = roll_no1;

        System.out.println(Arrays.toString(array2d[0]));
        System.out.println(Arrays.toString(array2d[1]));


        for (int i = 0; i < array2d[0].length; i++) {
            for (int j = 0; j < array2d[1].length; j++) {
                System.out.println(array2d[i][j]);
            }
        }

        //Arraylist

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);




    }
}
