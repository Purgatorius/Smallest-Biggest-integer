public class BiggestSmallest {
    public static void main(String args[]) {
        System.out.println("Give me 3 integers and I'll tell you which one is the biggest and smallest.");
        System.out.println("Give me first integer:  ");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        System.out.println("Give me second integer: ");
        int b = scanner.nextInt();
        System.out.println("Give me third integer: ");
        int c = scanner.nextInt();

        int max = Math.max(a, Math.max(b,c));
        System.out.println("Biggest integer is " + max);

        int min = Math.min(a, Math.min(b,c));
        System.out.println("Smallest integer is: " + min);
    }
}
