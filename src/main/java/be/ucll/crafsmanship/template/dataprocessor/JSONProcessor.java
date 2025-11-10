package be.ucll.crafsmanship.template.dataprocessor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JSONProcessor extends DataProcessor {
    private List<String> jsonData;

    public JSONProcessor(String inputFile, String outputFile) {
        super(inputFile, outputFile);
        this.jsonData = new ArrayList<>();
    }

    @Override
    protected void load() {
        System.out.println("Loading data from JSON file...");
        jsonData.add("{\"name\":\"Alice\",\"age\":30,\"");
        jsonData.add("{\"name\":\"Bob\",\"age\":25,\"");
    }

    @Override
    protected void transform() {
        System.out.println("Transforming data...");
        String timestamp = LocalDateTime.now().toString();
        jsonData.replaceAll(json -> json + ",\"processed_at\":\"" + timestamp + "\"}");
    }

    @Override
    protected void validate() {
        System.out.println("Validating date fields in JSON data...");
        for (String json : jsonData) {
            if (!json.contains("processed_at")) {
                System.out.println("Missing processed_at field in: " + json);
            }
        }
    }


    @Override
    protected void save() {
        System.out.println("Saving transformed data to JSON file...");
        jsonData.forEach(System.out::println);
    }
}
