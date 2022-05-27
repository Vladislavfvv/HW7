package Documents;

import java.util.Arrays;
import java.util.Date;

public class ContractForSupplyOfGoods extends Registr {

    String typeOfGoods;
    int numberOfGoods;


<<<<<<< HEAD
    //public ContractForSupplyOfGoods(int numDocument, Date dateOfDocument) {
     //   super(numDocument, dateOfDocument);
    //}



    public ContractForSupplyOfGoods(String typeOfGoods, int numberOfGoods, String date, int num) {
        super();
        super.setNumDocument(num);
        super.setDateOfDocument(date);
        this.typeOfGoods = typeOfGoods;
        this.numberOfGoods = numberOfGoods;
    }
    @Override
    public String toString() {
        return "ContractForSupplyOfGoods{" +
                "typeOfGoods='" + typeOfGoods + '\'' +
                ", numberOfGoods=" + numberOfGoods +
                ", date='" + getDateOfDocument() + '\'' +
                ", numberofdocument='" + getNumDocument() + '\'' +
                //", iRegistrs=" + Arrays.toString(iRegistrs) +
                '}';
    }
/*
@Override
    public void addDocumentInRegister(IRegistr iRegistr) {
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


   }*/
=======
>>>>>>> a2ef7c2bfe229385ac13f6e37ae52189d4d34c50
}
