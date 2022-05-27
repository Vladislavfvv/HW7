package Documents;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Registr[] reg = new Registr[10];

        reg[0] = new ContractForSupplyOfGoods( 1, new Date(), "Gloves", 100);
        reg[1] = new ContractWithEmployee(2, new Date(), "22-10-10", "Ivanov Ivan");
        reg[2] = new FinancialInvoice(3, new Date(), 1555525.77f, "TestCode");
        reg[3] = new Registr(4, new Date());
//можно и так:
        IRegistr[] reg2 = new IRegistr[10];
        reg2[1] = new ContractForSupplyOfGoods(5, new Date(), "Hats", 1000);



        for (int i = 0; i < reg.length; i++) {
            if (reg[i] != null) {
                reg[i].infoDocument();
            }
        }
        System.out.println("//////////////////////////");
        for (int i = 0; i < Arrays.stream(reg).count(); i++) {
            if (reg[i] != null) {
                reg[i].infoDocument();
            }
        }

        System.out.println("//////////////////////////");
        for (int i = 0; i < reg.length; i++) {
            if (reg[i] != null) {
                reg[i].toString();
            }
        }


        System.out.println(reg2[1]);

    }
}
