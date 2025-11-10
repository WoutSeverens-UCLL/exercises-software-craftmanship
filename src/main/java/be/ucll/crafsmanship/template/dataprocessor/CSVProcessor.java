package be.ucll.crafsmanship.template.dataprocessor;

import java.util.ArrayList;
import java.util.List;

public class CSVProcessor extends DataProcessor {
    private List<String> data;

    public CSVProcessor(String inputFile, String outputFile) {
        super(inputFile, outputFile);
        this.data = new ArrayList<>();
    }

    @Override
    protected void load() {
        System.out.println("Loading data from CSV file...");
        data.add("name,age,date");
        data.add("Alice,30,2023-01-15");
        data.add("Bob,25,2023-02-20");
    }

    @Override
    protected void transform() {
        System.out.println("Transforming CSV data...");
        data.replaceAll(String::toUpperCase);
    }

    @Override
    protected void validate() {
        System.out.println("Validating date fields in CSV data...");
        for (String line : data) {
            String[] parts = line.split(",");
            if (parts.length == 3 && !parts[2].matches("\\d{4}-\\d{2}-\\d{2}")) {
                System.out.println("Invalid date format found: " + parts[2]);
            }
        }
    }

    @Override
    protected void save() {
        System.out.println("Saving transformed data to CSV file...");
        for (String line : data) {
            System.out.println(line);
        }
    }
}
