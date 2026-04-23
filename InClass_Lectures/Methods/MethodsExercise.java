/* Instructions
1. Create a method called `calculateArea` that takes in a parameter of type double for a radius. It then calculates the area of the circle with that radius and returns the result. Area of a circle = pi * r^2
    1. note: you can use `Math.PI` to get the value of pi. You do not need to import Math.
    2. You can use `Math.pow(a,b)` to do power of. E.g. 5^2 → Math.pow(5,2)
2. In the same class, create a method called `calculateArea` that takes in parameters of type double for a base and a height. It then calculates the area of the triangle with those measurements and returns the result. Area of a triangle = (base * height)/2
3. Did the code run appropriately? Discuss. `write on paper`
4. Next, write a method called `calculateArea` that takes in parameters of type double  for a length and width. Then, it should calculate the area of a rectangle with those dimensions and return the result. Area of rectangle = length * width
5. In the main method, call this method with sample arguments and run the code. 
6. Did the code run appropriately this time? Discuss why you think it
7. Once you've completed the above, you can work on creating these additional methods:
    1. Write a method, lastLetter, that takes a string as a parameter and returns the last character in the string.
    2. Write a method, consecutive, that takes two integers as parameters and returns a Boolean if the two numbers are consecutive integers or not.
    3. Write a method, isPresent, that takes in a 2-D array of chars and a char value and returns true if the value was found in the array and false if not.
*/
public class MethodsExercise{
    // Method to calculate the area of a circle (area = pi * r^2)
    public static double calculateArea(double radius) {
        double pi = Math.PI;
        double r2 = Math.pow(radius, 2);
        double result = pi * r2;
        return result;
    }

    // Method to calculate the area of a triangle (area = (b*h)/2)
    public static double calculateArea(double base, double height) {
        double result = (base * height)/2;
        return result;
    }

	// To do after finishing question 3: Method to calculate the area of a rectangle (area = length * width)
    


    // main method, mostly finished, just uncomment the last line when specified (for question 5)
    public static void main (String[] args){
        System.out.println("The area of the circle is: " + calculateArea(10));
        System.out.println("The area of the triangle is: " + calculateArea(5.0, 3.0)); // height, width

        // uncomment the following line for the answer to question 5 
        //System.out.println("The area of the rectangle is: " + calculateArea(4, 2)); // length,  width 
    }
}