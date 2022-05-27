package Documents;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContractWithEmployee extends Registr{
    SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");

    String contractEndDate;
    String nameEmployee;

    public ContractWithEmployee(int numDocument, Date dateOfDocument) {
        super(numDocument, dateOfDocument);
    }

    public ContractWithEmployee(int numDocument, Date dateOfDocument, String contractEndDate, String nameEmployee) {
        this(numDocument, dateOfDocument);
        this.contractEndDate = contractEndDate;
        this.nameEmployee = nameEmployee;
    }

    @Override
    public void addDocumentInRegister() {
        for (int i = 0; i < iRegistrs.length; i++) {
            if(iRegistrs[i] == null){
                iRegistrs[i] = new ContractWithEmployee(5, new Date(), "22-08-15", "Smirnov Sergey");
                break;
            }
        }

    }

    @Override
    public void infoDocument() {
        System.out.println("� " + this.numDocument);
        System.out.println("���� ���������:" + this.dateOfDocument);
        System.out.println("�������� �������� ��: " + this.contractEndDate);
        System.out.println("���: " + this.nameEmployee);
    }

    @Override
    public String toString() {
        return "ContractWithEmployee{" +
                "formater=" + formater +
                ", contractEndDate='" + contractEndDate + '\'' +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", numDocument=" + numDocument +
                ", dateOfDocument='" + dateOfDocument + '\'' +
                '}';
    }

    /* public IRegistr CreateContractWithEmployee(){
        numDocument = 5;
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
        dateOfDocument = formater.format(new Date());
        contractEndDate = "22-08-15";
        nameEmployee = "Smirnov Sergey";
        iRegistrs temp = new IRegistr(5, dateOfDocument, contractEndDate, nameEmployee);
        return IRegistr ;*/

}

