package Documents;

import java.text.SimpleDateFormat;
import java.util.Date;

class Registr implements IRegistr {
    private int numDocument;
    SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
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
        //this.dateOfDocument = formater.format(new Date());
    }

    public IRegistr[] getiRegistrs() {
        return iRegistrs;
    }

    /*public void setiRegistrs(IRegistr[] iRegistrs) {
        this.iRegistrs = iRegistrs;
    }*/

    private String dateOfDocument;
    //SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy" *//*HH:mm:ss*//*);
    // this.dateOfDocument = formater.format(new Date());
    IRegistr[] iRegistrs = new IRegistr[10];


   /* Registr(int numDocument, Date dateOfDocument) {
        this.numDocument = numDocument;
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy" *//*HH:mm:ss*//*);
        this.dateOfDocument = formater.format(new Date());
    }*/

    @Override
    public void addDocumentInRegister(IRegistr doc) {
        for (int i = 0; i < iRegistrs.length; i++) {
            if (iRegistrs[i] == null) {
                iRegistrs[i] = doc;
                break;
            }
        }
    }

    @Override
    public void infoDocument(IRegistr doc) {
        for (int i = 0; i < iRegistrs.length; i++) {
            if (iRegistrs[i] != null) {
                System.out.println(iRegistrs[i].toString());
                //System.out.println(doc.toString());
            }
        }
    }
}
