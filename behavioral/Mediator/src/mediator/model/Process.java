package mediator.model;

import mediator.service.ProcessCommunicator;

public class Process {
    public int id;
    public String name;
    public Status status;
    public ProcessCommunicator communicator;

    public Process(String name, ProcessCommunicator communicator) {
        this.name = name;
        this.status = Status.WAITING;
        this.communicator = communicator;
    }

    public void join() {
        if (communicator.isAvailable()) {
            status = Status.WORKING;
            communicator.setAvailable(false);
            System.out.println(name + " working..");
            communicator.displayProcesses();
        } else {
            System.out.println(name + " couldn't work! There is another process working..");
        }
    }

    public void pause() {
        status = Status.PAUSED;
        communicator.setAvailable(true);
        System.out.println(name + " paused..");
        communicator.displayProcesses();
    }

    public void complete() {
        status = Status.FINISHED;
        communicator.setAvailable(true);
        System.out.println(name + " finished..");
        communicator.displayProcesses();
    }

    @Override
    public String toString() {
        return name + " " + status;
    }
}
