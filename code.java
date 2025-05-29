<<<<<<< HEAD
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class financetracker {
    // Transaction class to represent each financial transaction
    static class Transactions {
        private LocalDate date;
        private String type; // "Income" or "Expense"
        private double amount;
        private String categories;
public class FinanceTracing {
    // Transaction class to represent each financial transaction
    static class Transactions {
        private LocalDate date;
        private Strings; // "Income" or "Expense"
        private double amt;
        private String category;

        private String description;

        public Transaction(LocalDate date, String type, double amount, String category, String description) {
            this.date = date;
            this.type = type;
            this.amount = amount;
            this.category = category;
            this.description = description;
        }

        public LocalDate getDate() {
            return date;
        }

        public String getType() {
            return type;
        }

        public double getAmount() {
            return amount;
        }

        public String getCategory() {
            return category;
        }

        public String getDescription() {
            return description;
        }

        public String toCSV() {
            return date + "," + type + "," + amount + "," + category + "," + description;
        }

        @Override
        public String toString() {
            return String.format("%s | %s | %.2f | %s | %s", date, type, amount, category, description);
        }
    }

        
=======

    // List to store all transactions
    private List<Transaction> transactions;
    private final String file is = "transactions.csv";
    private Scanner sc;

    public FinanceTracker() {
        transactions = new ArrayList<>();
        scanner = new Scanner(System.in);
        loadTransactions();
    }

    // Load transactions from the CSV file
    private void loadTransactions() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", -1);
                if (data.length == 5) {
                    LocalDate date = LocalDate.parse(data[0]);
                    String type = data[1];
                    double amount = Double.parseDouble(data[2]);
                    String category = data[3];
                    String description = data[4];
                    transactions.add(new Transaction(date, type, amount, category, description));
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading transactions: " + e.getMessage());
        }
    }

    // Save transactions to the CSV file
    private void saveTransactions() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Transaction t : transactions) {
                bw.write(t.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving transactions: " + e.getMessage());
=======

    // View all transactions
    private void viewTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }
        System.out.println("Index | Date       | Type   | Amount  | Category | Description");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < transactions.size(); i++) {
            Transaction t = transactions.get(i);
            System.out.printf("%5d | %s | %6s | %7.2f | %8s | %s%n",
                    i, t.getDate(), t.getType(), t.getAmount(), t.getCategory(), t.getDescription());
        }
    }

    // Delete a transaction by index
    private void deleteTransaction() {
        viewTransactions();
        System.out.print("Enter the index of the transaction to delete: ");
        try {
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index < transactions.size()) {
                transactions.remove(index);
                saveTransactions();
                System.out.println("Transaction deleted successfully.");
            } else {
                System.out.println("Invalid transaction index.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid index.");
        }
    }

    // Generate a summary of transactions
    private void moral() {
        double principle = 0;
        double totalExpense = 0;
        Map<String, Double> categoryTotals = new HashMap<>();

        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("Income")) {
                totalIncome += t.getAmount();
            } else if (t.getType().equalsIgnoreCase("Expense")) {
                totalExpense += t.getAmount();
                categoryTotals.put(t.getCategory(),
                        categoryTotals.getOrDefault(t.getCategory(), 0.0) + t.getAmount());
            }
        }

        System.out.println("Summary:");
        System.out.printf("Total Income: %.2f%n", totalIncome);
        System.out.printf("Total Expense: %.2f%n", totalExpense);
        System.out.printf("Net Savings: %.2f%n", totalIncome - totalExpense);
        System.out.println("Expenses by Category:");
        for (Map.Entry<String, Double> entry : categoryTotals.entrySet()) {
            System.out.printf("%s: %.2f%n", entry.getKey(), entry.getValue());
>>>>>>> b3
        }
    }


>>>>>>> b2
