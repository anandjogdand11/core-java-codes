public class ARRAY{
    public static void main(String[] args) {
        // Declaration and Initialization
        int[] numbers = new int[5]; // Declares an integer array of size 5 and initializes it with default values (0 for integers)

        // Assigning values to array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing and printing array elements
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 1: " + numbers[1]);
        System.out.println("Element at index 2: " + numbers[2]);
        System.out.println("Element at index 3: " + numbers[3]);
        System.out.println("Element at index 4: " + numbers[4]);

        // Using a loop to iterate over array elements
        System.out.println("Array elements using loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}

