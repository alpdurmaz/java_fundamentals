package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int height = 5;
        double radius = 3.14;

        double area = (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
        double volume = Math.PI * radius * radius * height;

        System.out.println("Area:" + area);
        System.out.println("Volume:" + volume);


    }
}
