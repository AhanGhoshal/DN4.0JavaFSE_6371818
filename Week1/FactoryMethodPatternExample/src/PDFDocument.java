public class PDFDocument implements Document {
    public PDFDocument(){
        System.out.println("Creating a new PDF document.");
    }
    @Override
    public void openDoc() {
        System.out.println("Opening PDF Document\n");
    }
}
