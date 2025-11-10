package be.ucll.crafsmanship.template.dataprocessor;

import java.util.ArrayList;
import java.util.List;

public class XMLProcessor extends DataProcessor {
    private List<String> xmlData;

    public XMLProcessor(String inputFile, String outputFile) {
        super(inputFile, outputFile);
        this.xmlData = new ArrayList<>();
    }

    @Override
    protected void load() {
        System.out.println("Loading data from XML file...");
        xmlData.add("<name>Alice</name><age>30</age>");
        xmlData.add("<name>Bob</name><age>25</age>");
    }

    @Override
    protected void transform() {
        System.out.println("Transforming XML data...");
        xmlData.replaceAll(xml -> "<record>" + xml + "</record>");
    }

    @Override
    protected void validate() {
        System.out.println("Validating XML data...");
        for (String xml : xmlData) {
            if (!xml.startsWith("<record>") || !xml.endsWith("</record>")) {
                System.out.println("Invalid XML format found: " + xml);
            }
        }
    }

    @Override
    protected void save() {
        System.out.println("Saving transformed data to XML file...");
        xmlData.forEach(System.out::println);
    }
}
