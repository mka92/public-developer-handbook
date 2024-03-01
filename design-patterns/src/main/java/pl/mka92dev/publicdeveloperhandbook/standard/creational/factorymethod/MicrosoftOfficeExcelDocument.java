package pl.mka92dev.publicdeveloperhandbook.standard.creational.factorymethod;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MicrosoftOfficeExcelDocument implements Document {

    private static final Logger LOG = LoggerFactory.getLogger(MicrosoftOfficeExcelDocument.class);
    @Override
    public void open() {
        LOG.info("Microsoft Office Excel document is opened");
    }

    @Override
    public void close() {
        LOG.info("Microsoft Office Excel document is closed");
    }

    @Override
    public void save() {
        LOG.info("Successfully save Microsoft Office Excel document");
    }
}
