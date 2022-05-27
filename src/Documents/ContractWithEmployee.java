package Documents;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ContractWithEmployee extends Registr {


    String contractEndDate;
    String nameEmployee;

<<<<<<< HEAD

    public ContractWithEmployee(String contractEndDate, String nameEmployee, String date, int num) {
        super();
        super.setNumDocument(num);
        super.setDateOfDocument(date);
        this.contractEndDate = contractEndDate;
        this.nameEmployee = nameEmployee;
    }

    @Override
    public String toString() {
        return "ContractWithEmployee{" +
                "contractEndDate='" + contractEndDate + '\'' +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", date='" + getDateOfDocument() + '\'' +
                ", numberofdocument='" + getNumDocument() + '\'' +
                // ", iRegistrs=" + Arrays.toString(iRegistrs) +
                '}';
    }
/*
    @Override
    public void addDocumentInRegister(IRegistr iRegistr) {
        for (int i = 0; i < iRegistrs.length; i++) {
            if(iRegistrs[i] == null){
                iRegistrs[i] = new ContractWithEmployee(5, new Date(), "22-08-15", "Smirnov Sergey");
                break;
            }
        }

    }

    @Override
    public void infoDocument() {
        System.out.println("№ " + this.numDocument);
        System.out.println("Дата документа:" + this.dateOfDocument);
        System.out.println("Контракт заключен до: " + this.contractEndDate);
        System.out.println("ФИО: " + this.nameEmployee);
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
    }*/

    /* public IRegistr CreateContractWithEmployee(){
        numDocument = 5;
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
        dateOfDocument = formater.format(new Date());
        contractEndDate = "22-08-15";
        nameEmployee = "Smirnov Sergey";
        iRegistrs temp = new IRegistr(5, dateOfDocument, contractEndDate, nameEmployee);
        return IRegistr ;*/
=======
>>>>>>> a2ef7c2bfe229385ac13f6e37ae52189d4d34c50

}

