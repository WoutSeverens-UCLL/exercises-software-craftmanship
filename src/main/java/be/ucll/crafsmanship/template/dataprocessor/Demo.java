package be.ucll.crafsmanship.template.dataprocessor;

public class Demo {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVProcessor("input.csv", "output.csv");
        DataProcessor jsonProcessor = new JSONProcessor("input.json", "output.json");
        XMLProcessor xmlProcessor = new XMLProcessor("input.xml", "output.xml");

        xmlProcessor.enableDateValidation();

        System.out.println("\nProcessing CSV Data...");
        csvProcessor.process();

        System.out.println("\nProcessing JSON Data...");
        jsonProcessor.process();

        System.out.println("\nProcessing XML Data...");
        xmlProcessor.process();
    }
}
