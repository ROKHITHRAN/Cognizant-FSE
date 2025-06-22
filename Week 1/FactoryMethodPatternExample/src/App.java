import documents.Document;
import factory.DocumentFactory;
import factory.ExcelDocumentFactory;
import factory.PdfDocumentFactory;
import factory.WordDocumentFactory;

public class App {
    public static void main(String[] args) throws Exception {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();
        word.open(); 

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open(); 

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
    }
}
