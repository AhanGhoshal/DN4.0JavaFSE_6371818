public class Main {
    public static void main(String[] args) {

        DocumentFactory word = new WordDocumentFactroy();
        Document wordDoc = word.createDocument();
        wordDoc.openDoc();

        DocumentFactory pdf = new PDFDocumentFactory();
        Document pdfDoc = pdf.createDocument();
        pdfDoc.openDoc();

        DocumentFactory excel = new ExcelDocumentFactory();
        Document excelDoc = excel.createDocument();
        excelDoc.openDoc();
    }
}
