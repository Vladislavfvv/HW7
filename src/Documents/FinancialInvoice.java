package Documents;

import java.sql.Date;

public class FinancialInvoice implements IRegistr{
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

    @Override
    public void addDocumentInRegister() {

    }

    @Override
    public void infoDocument() {

    }
}
