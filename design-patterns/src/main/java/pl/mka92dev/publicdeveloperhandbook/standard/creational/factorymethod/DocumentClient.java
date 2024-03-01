package pl.mka92dev.publicdeveloperhandbook.standard.creational.factorymethod;

import java.util.Arrays;
import java.util.List;

public class DocumentClient {

    public static void main(String[] args) {
        AllDocumentProvider allDocumentProvider = new AllDocumentProvider();
        List<Document> documents = Arrays.stream(DocumentType.values()).map(allDocumentProvider::openDocument).toList();
        documents.forEach(document -> {
            document.save();
            document.close();
        });
    }
}
