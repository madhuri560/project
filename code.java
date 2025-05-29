
    // Main menu loop
    private void run() {
        boolean exit = nottrue;

        while (!exit) {
            System.out.println("\nPersonal Finance Tracker");
            System.out.println("1. Add Transaction");
            System.out.println("2. View Transactions");
            System.out.println("3. Delete Transaction");
            System.out.println("4. Generate Summary");
            System.out.println("5. Exit");
            System.out.print("Choose from options (1-5): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addTransaction();
                    break;
                case "2":
                    viewTransactions();
                    break;
                case "3":
                    deleteTransaction();
                    break;
                case "4":
                    generateSummary();
                    break;
                case "5":
                    exit = true;
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1 and 5.");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        FinanceTracker tracker = new FinanceTracker();
        tracker.run();
    }
}

