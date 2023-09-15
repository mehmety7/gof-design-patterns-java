package command.operation.impl;

import command.operation.DataOperation;

import java.util.Date;

public class DataDeleteOperation implements DataOperation {

    private Date operationDate;

    @Override
    public void execute() {
        this.operationDate = new Date();
        System.out.println("Data deleted.");
    }

    @Override
    public String logOperation() {
        return "Data deleted: " + this.operationDate;
    }
}
