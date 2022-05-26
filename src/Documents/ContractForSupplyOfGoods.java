package Documents;

import java.util.Date;

public class ContractForSupplyOfGoods implements IRegistr{
    int numDocument;
    String typeOfGoods;
    int numberofGoods;
    Date dateOfDocument;


    public ContractForSupplyOfGoods() {
    }

    public ContractForSupplyOfGoods(int numDocument, String typeOfGoods, int numberofGoods) {
        this.numDocument = numDocument;
        this.typeOfGoods = typeOfGoods;
        this.numberofGoods = numberofGoods;
        this.dateOfDocument = new Date();
    }

    @Override
    public void addDocumentInRegister() {
        //for (int i = 0; i < registrs.length-1; i++) {
        //    registrs[i] = new Registr();
       // }
    }

    @Override
    public void infoDocument() {
        System.out.println();
    }
}
