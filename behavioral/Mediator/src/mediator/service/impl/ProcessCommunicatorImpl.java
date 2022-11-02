package mediator.service.impl;

import mediator.model.Process;
import mediator.model.Status;
import mediator.service.ProcessCommunicator;

import java.util.ArrayList;
import java.util.List;

public class ProcessCommunicatorImpl implements ProcessCommunicator {

    List<Process> processes;
    boolean available;

    public ProcessCommunicatorImpl() {
        this.processes = new ArrayList<>();
        this.available = true;
    }

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public Process addProcess(Process process) {
        process.id = processes.size();
        processes.add(process);
        return process;
    }

    @Override
    public Process getActiveProcess() {
        return processes.stream()
                .filter(process -> process.status.equals(Status.WORKING))
                .findAny()
                .orElse(null);
    }

    @Override
    public void start(Process process) {
        processes.get(process.id).join();
    }

    @Override
    public void pause(Process process) {
        processes.get(process.id).pause();
    }

    @Override
    public void stop(Process process) {
        processes.get(process.id).complete();
    }

    @Override
    public void displayProcesses() {
        System.out.println("Status of Processes Recently:");
        processes.stream().forEach(process -> System.out.println(process.toString()));
    }
}
