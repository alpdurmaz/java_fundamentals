package datatypes_operators.labs;

import java.sql.SQLOutput;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        a = 2;
        b = 5;

        if (a <= b){
            System.out.println("less than or equal to");
        }

        a = 4;
        b = 3;

        if (a > b){
            System.out.println("a is greater than b");
        }

        a = 6;
        b = 4;

        if (a >= b){
            System.out.println("greater than or equal to");
        }

        a = 7;
        b = 7;

        if (a == b){
            System.out.println("a equals b");
        }


    }

}

