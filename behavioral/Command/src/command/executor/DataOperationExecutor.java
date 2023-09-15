package command.executor;

import command.operation.DataOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataOperationExecutor {

    private final List<DataOperation> dataOperations = new ArrayList<>();

    public void executeOperation(DataOperation operation) {
        dataOperations.add(operation);
        operation.execute();
    }

    // optional
    public void showOperationHistory() {
        System.out.println("---------- Operation History -------------------------");
        System.out.println(dataOperations.stream().map(DataOperation::logOperation).collect(Collectors.joining("\n")));
        System.out.println("------------------------------------------------------");
    }

}
