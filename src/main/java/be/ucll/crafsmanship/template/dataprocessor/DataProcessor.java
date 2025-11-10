package be.ucll.crafsmanship.template.dataprocessor;

public abstract class DataProcessor {
    protected String inputFile;
    protected String outputFile;
    protected boolean validateDate = false;

    public DataProcessor(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    public void enableDateValidation() {
        this.validateDate = true;
    }

    public final void process() {
        load();
        transform();
        if (validateDate) {
            validate();
        }
        save();
    }

    protected abstract void load();

    protected abstract void transform();

    protected void validate() {
        System.out.println("Skipping validation - default hook behavior");
    }

    protected abstract void save();
}
