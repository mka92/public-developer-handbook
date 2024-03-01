package pl.mka92dev.publicdeveloperhandbook.standard.creational.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PdfDocument implements Document {

    private static final Logger LOG = LoggerFactory.getLogger(PdfDocument.class);
    @Override
    public void open() {
        LOG.info("PDF document is opened");
    }

    @Override
    public void close() {
        LOG.info("PDF document is closed");
    }

    @Override
    public void save() {
        LOG.info("Successfully save PDF document");
    }
}
