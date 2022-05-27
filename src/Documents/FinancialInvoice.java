package Documents;

import java.util.Arrays;
import java.util.Date;

public class FinancialInvoice extends Registr{
    float monthlyTotal;
    String departmentCode;

<<<<<<< HEAD

=======
>>>>>>> a2ef7c2bfe229385ac13f6e37ae52189d4d34c50
    public FinancialInvoice(float monthlyTotal, String departmentCode, String date, int num) {
        super();
        super.setNumDocument(num);
        super.setDateOfDocument(date);
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }
<<<<<<< HEAD

    @Override
    public String toString() {
        return "FinancialInvoice{" +
                "monthlyTotal=" + monthlyTotal +
                ", departmentCode='" + departmentCode + '\'' +
                ", date='" + getDateOfDocument() + '\'' +
                ", numberofdocument='" + getNumDocument() + '\'' +
                //", iRegistrs=" + Arrays.toString(iRegistrs) +
                '}';
    }
/* @Override
    public void addDocumentInRegister(IRegistr iRegistr) {
        for (int i = 0; i < iRegistrs.length; i++) {
            if(iRegistrs[i] == null){
                iRegistrs[i] = new FinancialInvoice(6, new Date(), 100500, "NewTestCode");
                break;
            }
        }
    }

    @Override
    public void infoDocument() {
        System.out.println("№ " + this.numDocument);
        System.out.println("Дата документа:" + this.dateOfDocument);
        System.out.println("Итоговая сумма за месяц: " + this.monthlyTotal);
        System.out.println("Код департамента: " + this.departmentCode);
    }*/
=======
>>>>>>> a2ef7c2bfe229385ac13f6e37ae52189d4d34c50
}
