package pl.mka92dev.publicdeveloperhandbook.standard.creational.factorymethod;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MicrosoftOfficeWordDocument implements Document {

    private static final Logger LOG = LoggerFactory.getLogger(MicrosoftOfficeWordDocument.class);
    @Override
    public void open() {
        LOG.info("Microsoft Office Word document is opened");
    }

    @Override
    public void close() {
        LOG.info("Microsoft Office Word document is closed");
    }

    @Override
    public void save() {
        LOG.info("Successfully save Microsoft Office Word document");
    }
}
