import java.util.Scanner;

public class OnlineReservationSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    reservation(scanner);
                    break;
                case 3:
                    cancellation(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nOnline Reservation System");
        System.out.println("1. Login");
        System.out.println("2. Reservation");
        System.out.println("3. Cancellation");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void login(Scanner scanner) {
        System.out.print("Enter login ID: ");
        String loginId = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Placeholder: Implement login logic here (database validation, etc.)
        if (loginId.equals("admin") && password.equals("password")) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid login credentials.");
        }
    }

    private static void reservation(Scanner scanner) {
        // Placeholder: Implement reservation logic here
        System.out.println("Reservation process initiated.");
        // ... (gather user information, process reservation)
        System.out.println("Reservation completed.");
    }

    private static void cancellation(Scanner scanner) {
        // Placeholder: Implement cancellation logic here
        System.out.println("Cancellation process initiated.");
        // ... (gather PNR number, confirm cancellation)
        System.out.println("Cancellation completed.");
    }
}