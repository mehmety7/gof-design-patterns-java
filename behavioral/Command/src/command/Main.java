package command;

import command.executor.DataOperationExecutor;
import command.operation.impl.DataDeleteOperation;
import command.operation.impl.DataSaveOperation;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DataOperationExecutor executor = new DataOperationExecutor();
        executor.executeOperation(new DataSaveOperation());
        Thread.sleep(3_000);
        executor.executeOperation(new DataSaveOperation());
        executor.executeOperation(new DataSaveOperation());
        executor.executeOperation(new DataDeleteOperation());
        executor.executeOperation(new DataSaveOperation());
        executor.executeOperation(new DataDeleteOperation());
        executor.showOperationHistory();
    }
}