package mediator.service;

import mediator.model.Process;

public interface ProcessCommunicator {

    void setAvailable(boolean available);
    boolean isAvailable();

    Process addProcess(Process process);
    Process getActiveProcess();

    void start(Process process);
    void pause(Process process);
    void stop(Process process);

    void displayProcesses();
}
