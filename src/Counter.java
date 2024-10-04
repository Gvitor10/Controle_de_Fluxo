import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws InvalidParametersException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first parameter:");
        int parameterOne = input.nextInt();
        System.out.println("Enter the second parameter:");
        int parameterTwo = input.nextInt();

        try {
            count(parameterOne, parameterTwo);
        } catch (InvalidParametersException e) {
            System.out.println("The first parameter need to be greater than the second parameter.");
        }

    }

    static void count(int parameterOne, int parameterTwo) throws InvalidParametersException {
        if (parameterOne > parameterTwo) {
            throw new InvalidParametersException();
        } else {
            int interations = parameterTwo - parameterOne;

            for (int i = 1; i <= interations; i++) {
                System.out.println("Couting ... " + i);
            }
        }
    }
}
