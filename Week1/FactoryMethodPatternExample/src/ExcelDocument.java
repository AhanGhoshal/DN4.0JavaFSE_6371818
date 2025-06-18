public class ExcelDocument implements Document{
    public ExcelDocument(){
        System.out.println("Creating a new excel document.");
    }
    @Override
    public void openDoc(){
        System.out.println("Opening Excel Document\n");
    }
}
