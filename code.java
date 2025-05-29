
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

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

        
