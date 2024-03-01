package pl.mka92dev.publicdeveloperhandbook.standard.creational.factorymethod;

public class AllDocumentProvider extends DocumentCreator {
    @Override
    Document crateDocument(DocumentType documentType) {
        return switch (documentType) {
            case PDF -> new PdfDocument();
            case MICROSOFT_OFFICE_WORD -> new MicrosoftOfficeWordDocument();
            case MICROSOFT_OFFICE_EXCEL -> new MicrosoftOfficeExcelDocument();
        };
    }
}
