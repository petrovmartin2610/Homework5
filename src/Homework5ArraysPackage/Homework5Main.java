package Homework5ArraysPackage;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;  //generates random number from certain range


public class Homework5Main {
    static int chooseActionNumber; //used in printMenuWithOptions() for action selection
    static int counter;            //used in for loops to traverse array
    static int length;             //length of the array, input by the user
    static int[] arrayOfUserNumbers = new int[0];

    public static void main(String[] args) {
        arrayCreationAndDefinition();
        printMenuWithOptions();

        //using switch to easily access methods by inputting the corresponding number
        switch(chooseActionNumber){
            case 1:
                sortArrayAscending(arrayOfUserNumbers);
                break;
            case 2:
                sortArrayDescending(arrayOfUserNumbers);
                break;
            case 3:
                findCertainNumberPosition();
                break;
            case 4:
                randomizeArrayNumbers();
                break;
            case 5:
                sumAllArrayNumbers();
                break;
            case 6:
                findBiggestNumber();
                break;
            case 7:
                findSmallestNumber();
                break;
            case 8:
                averageAllArrayNumbers();
                break;
            case 9:
                checkArrayForSymmetry();
                break;
            case 10:
                reverseArray();
                break;
            case 11:
                printArray();
                break;
            case 12:
                terminateProgram();
                break;
            default:
                System.out.println("Incorrect operation input, please try again!");
                break;
        }
    }


    /**
     * Method used to create and define the array with user inputting both number of array
     * elements and the elements themselves
     * @author Martin Petrov
     */
    public static void arrayCreationAndDefinition() {
        Scanner userArrayDataInput = new Scanner(System.in);
        System.out.println("How many numbers would you like to save in the array?");
        length = userArrayDataInput.nextInt();
        arrayOfUserNumbers = new int[length];  //setting the length of the array from zero to the number the user inputs

        for (counter = 0; counter < length; counter++) {
            System.out.println("Enter element number " + counter + " of your array: ");
            arrayOfUserNumbers[counter] = userArrayDataInput.nextInt();
            do {
                if (0 > arrayOfUserNumbers[counter] | arrayOfUserNumbers[counter] > 100) {
                    System.out.println("Please input a number bigger than 0 and smaller than 100! ");
                    arrayOfUserNumbers[counter] = userArrayDataInput.nextInt();
                }
            } while (arrayOfUserNumbers[counter]>100 | arrayOfUserNumbers[counter]<0);
        }
    }


    /**
     * Method used to print out available actions to modify the array (or exit the program), as well as
     * prompting user to enter a number
     * @author Martin Petrov
     */
    public static void printMenuWithOptions() {
        System.out.println("CHOOSE AN ACTION TO MODIFY THE ARRAY OR TO EXIT THE PROGRAM: ");
        System.out.println("------------------------------------------------------------ ");
        System.out.println("01. Sort the numbers you just input in an ascending order (from smallest to biggest) ");
        System.out.println("02. Sort the numbers you just input in a descending order (from biggest to smallest) ");
        System.out.println("03. Find the exact position in the array for one of your input numbers ");
        System.out.println("04. Randomize the numbers");
        System.out.println("05. Sum all input numbers ");
        System.out.println("06. Find the biggest number");
        System.out.println("07. Find the smallest number ");
        System.out.println("08. Find the average of all numbers ");
        System.out.println("09. Check the array for symmetry");
        System.out.println("10. Invert the array ");
        System.out.println("11. Visualise the array");
        System.out.println("12. Exit the program ");

        Scanner actionNumberInput = new Scanner(System.in);
        System.out.println("Please choose the number of the action you want to do: ");
        chooseActionNumber = actionNumberInput.nextInt();
    }


    /**
     * Method used for sorting the array from smallest to biggest number
     * @author Martin Petrov
     */
    public static void sortArrayAscending(int[] arrayOfUserNumbers) {
        System.out.print("The sorted array is: ");
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arrayOfUserNumbers[i] > arrayOfUserNumbers[j]) {
                    int positionSwitch = arrayOfUserNumbers[i];
                    arrayOfUserNumbers[i] = arrayOfUserNumbers[j];
                    arrayOfUserNumbers[j] = positionSwitch;
                }
            }
            System.out.print(arrayOfUserNumbers[i] + " , ");
        }
    }


    /**
     * Method used for sorting array from biggest to smallest number
     * @author Martin Petrov
     */
    public static void sortArrayDescending(int[] arrayOfUserNumbers) {
        System.out.print("The sorted array is: ");
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arrayOfUserNumbers[i] < arrayOfUserNumbers[j]) {
                    int positionSwitch = arrayOfUserNumbers[i];
                    arrayOfUserNumbers[i] = arrayOfUserNumbers[j];
                    arrayOfUserNumbers[j] = positionSwitch;
                }
            }
            System.out.print(arrayOfUserNumbers[i] + " , ");
        }
    }


    /**
     * Method used for finding the biggest number from the array
     * @author Martin Petrov
     */
    public static void findBiggestNumber() {
        int maxNumber = arrayOfUserNumbers[0];  //variable used to store the result from the for loop
        for (int i = 0; i < length; i++) {
            if (arrayOfUserNumbers[i] > maxNumber) {
                maxNumber = arrayOfUserNumbers[i];
            }
        }
        System.out.println("The biggest number is: " + maxNumber);
    }


    /**
     * Method used for finding smallest number of array
     * @author Martin Petrov
     */
    public static void findSmallestNumber() {
        int minNumber = arrayOfUserNumbers[0];   //variable used to store the result from the for loop
        for (int i = 0; i < length; i++) {
            if (arrayOfUserNumbers[i] < minNumber) {
                minNumber = arrayOfUserNumbers[i];
            }
        }
        System.out.println("The smallest number is: " + minNumber);
    }


    /**
     * Method used to sum all numbers from the array
     * @author Martin Petrov
     */
    public static void sumAllArrayNumbers() {
        int sumOfElements = 0;       //variable used to store the result from the for-each loop
        for (int i : arrayOfUserNumbers) {
            sumOfElements += i;
        }
        System.out.println("The sum of all array numbers is " + sumOfElements);
    }


    /**
     * Method used to find average of all array numbers
     * @author Martin Petrov
     */
    public static void averageAllArrayNumbers() {
        int sumOfElements = 0;       //variable used to store the result from the for-each loop
        for (int i : arrayOfUserNumbers) {
            sumOfElements += i;
        }
        System.out.println("The average of all array numbers is " + (sumOfElements) / 2);
    }


    //self-explanatory
    public static void checkArrayForSymmetry() {
        System.out.println("Error 404: Coder solution for this method not found!");
    }


    //self-explanatory
    public static void findCertainNumberPosition() {
        System.out.println("Error 404: Coder solution for this method not found!");
    }


    //self-explanatory
    public static void randomizeArrayNumbers() {
        System.out.println("Error 404: Coder solution for this method not found!");
    }


    /**
     * Method (or an attempt for such method) to reverse a certain array, prints out first number
     * of reversed array only
     * @author Martin Petrov
     */
    public static void reverseArray() {
        int i = 0;
        for (i = 0; i < length / 2; i++) {
            int switcherVariable = arrayOfUserNumbers[i];
            arrayOfUserNumbers[i] = arrayOfUserNumbers[length - i - 1];
            arrayOfUserNumbers[length - i - 1] = switcherVariable;
        }
        System.out.print("The reversed array is: ");
        System.out.print(arrayOfUserNumbers[i / 2] + " , ");
    }


    /**
     * Method used to print the array to console
     * @author Martin Petrov
     */
    public static void printArray() {
        int i = 0;
        System.out.print("The array you've entered is: ");
        for (i = 0; i < length; i++) {
            System.out.print(arrayOfUserNumbers[i] + " , ");
        }
    }


    /**
     * Method used to manually terminate the program while in menu
     * @author Martin Petrov
     */
    public static void terminateProgram(){
        System.out.println("The program has been terminated by the user! ");
        System.exit(0);
    }
}

