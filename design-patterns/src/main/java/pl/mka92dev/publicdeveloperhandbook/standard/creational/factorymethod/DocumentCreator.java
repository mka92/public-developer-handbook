package pl.mka92dev.publicdeveloperhandbook.standard.creational.factorymethod;

public abstract class DocumentCreator {

    abstract Document crateDocument(DocumentType documentType);

    public Document openDocument(DocumentType documentType) {
        Document document = crateDocument(documentType);
        document.open();
        return document;
    }
}
