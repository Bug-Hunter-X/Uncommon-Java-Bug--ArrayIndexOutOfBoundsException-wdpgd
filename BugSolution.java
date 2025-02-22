public class BugSolution {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) { // Proper iteration
            array[i] = i * 2; 
        }
        System.out.println(array[5]); // Accessing a valid index
    }
}