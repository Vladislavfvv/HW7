package Documents;

import java.util.Date;

public class ContractWithEmployee implements IRegistr{
    int numOfDocument;
    Date dateOfDocument;
    Date contractEndDate;
    String nameEmployee;

    public ContractWithEmployee() {
    }

    public ContractWithEmployee(int numOfDocument, Date dateOfDocument, Date contractEndDate, String nameEmployee) {
        this.numOfDocument = numOfDocument;
        this.dateOfDocument = dateOfDocument;
        this.contractEndDate = contractEndDate;
        this.nameEmployee = nameEmployee;
    }

    @Override
    public void addDocumentInRegister() {

    }

    @Override
    public void infoDocument() {

    }
}
