package myproject;

public class CustomExceptionDemo {
	public static void main(String[] args) {
        int age = 15;

        try {
            validateAge(age);
        } catch (AgeValidationException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    static void validateAge(int age) throws AgeValidationException {
        if (age < 18) {
            throw new AgeValidationException("Age must be at least 18.");
        } else {
            System.out.println("Age is valid.");
        }
    }

}
