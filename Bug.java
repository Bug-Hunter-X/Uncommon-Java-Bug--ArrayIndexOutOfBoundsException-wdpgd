public class UncommonBug {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[10] = 10; // IndexOutOfBoundsException
        System.out.println(array[10]);
    }
}