package Documents;

import java.text.SimpleDateFormat;
import java.util.Date;

class Registr implements IRegistr{
    int numDocument;
    String dateOfDocument;


IRegistr[] iRegistrs = new IRegistr[10];


    Registr(int numDocument, Date dateOfDocument) {
        this.numDocument = numDocument;
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy" /*HH:mm:ss*/);
        this.dateOfDocument = formater.format(new Date());
    }

    @Override
    public void addDocumentInRegister() {

    }

    @Override
    public void infoDocument() {

    }

    @Override
    public void addDocumentInRegister2() {

    }
}
