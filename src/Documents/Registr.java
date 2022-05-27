package Documents;

import java.text.SimpleDateFormat;
import java.util.Date;

class Registr implements IRegistr {
    private int numDocument;

    public int getNumDocument() {
        return numDocument;
    }

    public void setNumDocument(int numDocument) {
        this.numDocument = numDocument;
    }

    public String getDateOfDocument() {
        return dateOfDocument;
    }

    public void setDateOfDocument(String dateOfDocument) {
        this.dateOfDocument = dateOfDocument;
    }

    public IRegistr[] getiRegistrs() {
        return iRegistrs;
    }

    private String dateOfDocument;
    IRegistr[] iRegistrs = new IRegistr[10];


    @Override
    public void addDocumentInRegister(IRegistr doc) {
        for (int i = 0; i < iRegistrs.length; i++) {
            if (iRegistrs[i]==null){
                iRegistrs[i] = doc;
                break;
            }
        }
    }

    @Override
    public void infoDocument(IRegistr doc) {
        System.out.println(doc.toString());
    }
}
