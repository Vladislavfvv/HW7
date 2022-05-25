package Documents;

import java.sql.Date;

public class FinancialInvoice {
    long monthlyTotal;
    Date dateOfDocument;
    int numberOfDocument;
    String departmentCode;

    public FinancialInvoice() {
    }

    public FinancialInvoice(long monthlyTotal, Date dateOfDocument, int numberOfDocument, String departmentCode) {
        this.monthlyTotal = monthlyTotal;
        this.dateOfDocument = dateOfDocument;
        this.numberOfDocument = numberOfDocument;
        this.departmentCode = departmentCode;
    }
}
