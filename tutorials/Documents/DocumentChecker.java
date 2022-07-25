package Documents;

public class DocumentChecker {
    public static void main(String[] args) {
        Documents excel = new ExcelDocument();
        Documents pdf = new PdfDocument();

        pdf.getDescription();
        excel.getDescription();
    }
}
