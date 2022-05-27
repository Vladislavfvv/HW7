package Documents;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Registr reg = new Registr();

//        reg.iRegistrs[0] = new ContractForSupplyOfGoods( 1, new Date(), "Gloves", 100);
//        reg[1] = new ContractWithEmployee(2, new Date(), "22-10-10", "Ivanov Ivan");
        FinancialInvoice f = new FinancialInvoice(3,"sd",  "01-01", 1);
//
//        IRegistr[] reg2 = new IRegistr[10];
//        reg2[1] = new ContractForSupplyOfGoods(5, new Date(), "Hats", 1000);


        reg.addDocumentInRegister(f);

        reg.infoDocument(f);

        for (int i = 0; i < reg.iRegistrs.length; i++) {
            if (reg.iRegistrs[i] != null) {
                reg.infoDocument(reg.iRegistrs[i]);
            }
        }
//        System.out.println("//////////////////////////");
//        for (int i = 0; i < Arrays.stream(reg).count(); i++) {
//            if (reg[i] != null) {
//                reg[i].infoDocument();
//            }
//        }
//
//        System.out.println("//////////////////////////");
//        for (int i = 0; i < reg.length; i++) {
//            if (reg[i] != null) {
//                reg[i].toString();
//            }
//        }
//
//
//        System.out.println(reg2[1]);

    }
}
