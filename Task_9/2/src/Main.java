public class Main {
    public static void main(String[] args) {
        int[] array = new int[];
        Random random = new Random;
        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(61) + 40;
            array[i] += randomNumber;
        }
        for(int number : random) {
            System.out.println(number);
        }
    }
}
