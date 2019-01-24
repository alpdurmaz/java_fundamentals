package datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        a = true;
        b = true;

        if (a & b){
            System.out.println("a and b is true");
        }

        a = false;
        b = true;

        if (a && b){
        }
        else{
            System.out.println("since a is false result is false");
        }

        a = true;
        b = false;

        if (a | b){
            System.out.println("a or b is true");
        }

        a = false;
        b = true;

        if (b || a){
            System.out.println("a or b is true");
        }

        a = true;
        b = false;

        if (a ^ b){
            System.out.println("there is one true and one false");
        }

        a = false;

        if(!a){
            System.out.println("a is false");
        }




    }

}

