package Documents;

import java.util.Date;

public class ContractForSupplyOfGoods extends Registr {

    String typeOfGoods;
    int numberOfGoods;


    public ContractForSupplyOfGoods(int numDocument, Date dateOfDocument) {
        super(numDocument, dateOfDocument);
    }

    public ContractForSupplyOfGoods(int numDocument, Date dateOfDocument, String typeOfGoods, int numberOfGoods) {
        this(numDocument, dateOfDocument);
        this.typeOfGoods = typeOfGoods;
        this.numberOfGoods = numberOfGoods;
    }
    @Override
    public void addDocumentInRegister() {
        for (int i = 0; i < iRegistrs.length; i++) {
          if (iRegistrs[i] == null) {
              iRegistrs[i] = new ContractForSupplyOfGoods(4, new Date(), "Scarfs", 200);
              break;
          }
        }
    }

    @Override
    public void infoDocument() {
        System.out.println("№ " + this.numDocument);
        System.out.println("Дата документа:" + this.dateOfDocument);
        System.out.println("Тип товара: " + this.typeOfGoods);
        System.out.println("Количество: " + this.numberOfGoods);
    }

    @Override
    public String toString() {
        return "ContractForSupplyOfGoods{" +
                "typeOfGoods='" + typeOfGoods + '\'' +
                ", numberofGoods=" + numberOfGoods +
                ", numDocument=" + numDocument +
                ", dateOfDocument='" + dateOfDocument + '\'' +
                '}';
    }

   @Override    public void addDocumentInRegister2() {
        for (int i = 0; i < iRegistrs.length; i++) {
            if (iRegistrs[i] == null) {
                iRegistrs[i] = new ContractForSupplyOfGoods(4, new Date(), "Scarfs", 200);
                break;
            }
        }

   }
}
