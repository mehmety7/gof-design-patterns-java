package command.operation.impl;

import command.operation.DataOperation;

import java.util.Date;

public class DataSaveOperation implements DataOperation {

    private Date operationDate;

    @Override
    public void execute() {
        this.operationDate = new Date();
        System.out.println("Data saved");
    }

    @Override
    public String logOperation() {
        return "Data saved: " + this.operationDate;
    }
}
