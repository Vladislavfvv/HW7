package Documents;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Registr reg = new Registr();
        FinancialInvoice f = new FinancialInvoice(30000, "cd", "01-01", 1);
        FinancialInvoice f2 = new FinancialInvoice(5050, "cdjhj", "01-01-15", 2);
        ContractForSupplyOfGoods s = new ContractForSupplyOfGoods(  "Gloves", 100, "12-05-22", 3 );
        ContractWithEmployee e = new ContractWithEmployee("22-10-10", "Ivanov Ivan", "15-05-22",4);
        ContractWithEmployee e2 = new ContractWithEmployee("22-12-12", "Petrov Vasua", "15-05-22",5);


        reg.addDocumentInRegister(f);
        reg.addDocumentInRegister(f2);
        reg.addDocumentInRegister(e2);
        reg.addDocumentInRegister(s);
        reg.addDocumentInRegister(e);


        //reg.infoDocument(f);
      //  reg.infoDocument(s);
        reg.infoDocument(e);



   System.out.println("//////////////////////////");
        for (int i = 0; i < reg.iRegistrs.length; i++) {
            if (reg.iRegistrs[i] != null) {
                reg.iRegistrs[i].toString();
            }
        }
      /*  System.out.println("//////////////////////////");
        for (int i = 0; i < Arrays.stream(reg).count(); i++) {
            if (reg[i] != null) {
                reg[i].infoDocument();
            }
        }*/

      /*  System.out.println("//////////////////////////");
        for (int i = 0; i < reg.length; i++) {
            if (reg[i] != null) {
                reg[i].toString();
            }
        }

        System.out.println("//////////////////////////");
        for (int i = 0; i < reg2.length; i++) {
            if (reg2[i] != null) {
                reg2[i].toString();
            }
        }*/


    }
}
