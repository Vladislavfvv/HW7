package Documents;

import java.util.Date;

public class FinancialInvoice extends Registr{
    float monthlyTotal;
    String departmentCode;

    public FinancialInvoice(float monthlyTotal, String departmentCode, String date, int num) {
        super();
        super.setNumDocument(num);
        super.setDateOfDocument(date);
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }
}
