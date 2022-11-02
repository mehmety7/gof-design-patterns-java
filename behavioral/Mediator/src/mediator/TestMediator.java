package mediator;

import mediator.model.Process;
import mediator.service.ProcessCommunicator;
import mediator.service.impl.ProcessCommunicatorImpl;

public class TestMediator {

    public static void main(String[] args) {

        ProcessCommunicator communicator = new ProcessCommunicatorImpl();

        Process process1 = new Process("process1", communicator);
        Process process2 = new Process("process2", communicator);
        Process process3 = new Process("process3", communicator);
        Process process4 = new Process("process4", communicator);

        communicator.addProcess(process1);
        communicator.addProcess(process2);
        communicator.addProcess(process3);
        communicator.addProcess(process4);

        communicator.start(process1);
        communicator.start(process2);
        communicator.start(process3);
        communicator.pause(process1);
        communicator.start(process3);
        communicator.stop(process3);
        communicator.start(process1);

    }

}
