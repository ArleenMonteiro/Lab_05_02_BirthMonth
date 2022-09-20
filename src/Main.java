public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your birth month: ");
        int N = 45;
        System.out.println(N);
        if (N <= 12 && N >= 0) {
            System.out.println("Your birth month is: " + N);
        } else {
            System.out.println("You entered an incorrect month value: " + N);
        }
    }

}