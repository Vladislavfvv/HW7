package Documents;

import java.util.Date;

public class ContractForSupplyOfGoods extends Registr{
    int numDocument;
    String typeOfGoods;
    int numberofGoods;
    Date dateOfDocument;


    public ContractForSupplyOfGoods() {
    }

    public ContractForSupplyOfGoods(int numDocument, String typeOfGoods, int numberofGoods, Date dateOfDocument) {
        this.numDocument = numDocument;
        this.typeOfGoods = typeOfGoods;
        this.numberofGoods = numberofGoods;
        this.dateOfDocument = dateOfDocument;
    }

    @Override
    void addDocumentInRegister() {
        for (int i = 0; i < registrs.length-1; i++) {
            registrs[i] = new Registr();



        }

    }

    @Override
    void infoDocument() {
        System.out.println();
    }
}
