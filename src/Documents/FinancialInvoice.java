package Documents;

import java.util.Date;

public class FinancialInvoice extends Registr{
    float monthlyTotal;

    String departmentCode;

    public FinancialInvoice(int numDocument, Date dateOfDocument) {
        super(numDocument, dateOfDocument);
    }

    public FinancialInvoice(int numberOfDocument, Date dateOfDocument, float monthlyTotal, String departmentCode) {
        this(numberOfDocument, dateOfDocument);
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }

    @Override
    public void addDocumentInRegister() {
        for (int i = 0; i < iRegistrs.length; i++) {
            if(iRegistrs[i] == null){
                iRegistrs[i] = new FinancialInvoice(6, new Date(), 100500, "NewTestCode");
                break;
            }
        }
    }

    @Override
    public void infoDocument() {
        System.out.println("� " + this.numDocument);
        System.out.println("���� ���������:" + this.dateOfDocument);
        System.out.println("�������� ����� �� �����: " + this.monthlyTotal);
        System.out.println("��� ������������: " + this.departmentCode);
    }
}
