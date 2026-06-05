public class Main {
    public static void main(String[] args) {
        int count = 0;

        for (char ch = 'A'; ch <= 'Y'; ch++) {
            System.out.print(ch + " ");
            count++;

            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }
}