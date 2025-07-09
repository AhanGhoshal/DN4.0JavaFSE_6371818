public class WordDocumentFactroy extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
