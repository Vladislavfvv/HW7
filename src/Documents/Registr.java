package Documents;

import java.text.SimpleDateFormat;
import java.util.Date;

class Registr implements IRegistr {
    private int numDocument;
<<<<<<< HEAD
    SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
    public int getNumDocument() {
        return numDocument;
    }

=======

    public int getNumDocument() {
        return numDocument;
    }

>>>>>>> a2ef7c2bfe229385ac13f6e37ae52189d4d34c50
    public void setNumDocument(int numDocument) {
        this.numDocument = numDocument;
    }

    public String getDateOfDocument() {
        return dateOfDocument;
    }

    public void setDateOfDocument(String dateOfDocument) {
        this.dateOfDocument = dateOfDocument;
<<<<<<< HEAD
        //this.dateOfDocument = formater.format(new Date());
=======
>>>>>>> a2ef7c2bfe229385ac13f6e37ae52189d4d34c50
    }

    public IRegistr[] getiRegistrs() {
        return iRegistrs;
    }

<<<<<<< HEAD
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
=======
    private String dateOfDocument;
    IRegistr[] iRegistrs = new IRegistr[10];


    @Override
    public void addDocumentInRegister(IRegistr doc) {
        for (int i = 0; i < iRegistrs.length; i++) {
            if (iRegistrs[i]==null){
>>>>>>> a2ef7c2bfe229385ac13f6e37ae52189d4d34c50
                iRegistrs[i] = doc;
                break;
            }
        }
    }

    @Override
    public void infoDocument(IRegistr doc) {
<<<<<<< HEAD
        for (int i = 0; i < iRegistrs.length; i++) {
            if (iRegistrs[i] != null) {
                System.out.println(iRegistrs[i].toString());
                //System.out.println(doc.toString());
            }
        }
=======
        System.out.println(doc.toString());
>>>>>>> a2ef7c2bfe229385ac13f6e37ae52189d4d34c50
    }
}
