
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
        }
    }


