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
        }
    }


>>>>>>> b2
