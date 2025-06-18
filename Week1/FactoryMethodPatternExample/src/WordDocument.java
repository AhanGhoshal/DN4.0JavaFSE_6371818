public class WordDocument implements Document {
    public WordDocument(){
        System.out.println("Creating a new word document.");
    }
    @Override
    public void openDoc(){
        System.out.println("Opening Word Document\n");
    }
}
