

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


