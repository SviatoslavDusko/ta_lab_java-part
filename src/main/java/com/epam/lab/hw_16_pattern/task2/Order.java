package com.epam.lab.hw_16_pattern.task2;

import com.epam.lab.hw_16_pattern.task2.state.State;
import com.epam.lab.hw_16_pattern.task2.state.impl.NewTaskState;

import java.util.LinkedList;
import java.util.List;

public class Order {

    private State state;
    private List<Task> taskList = new LinkedList<>();

    public Order() {
        state = new NewTaskState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void addTask() {
        state.addTask(this);
    }

    public void inProgress() {
        if (taskList.isEmpty()) {
            System.out.println("Order is empty!");
        } else {
            state.inProgress(this);
        }
    }

    public void peerReview() {
        state.peerReview(this);
    }

    public void inTest() {
        state.inTest(this);
    }

    public void done() {
        state.done(this);
    }

    public void blocked() {
        state.blocked(this);
    }

    public void addTaskToList() {
        Task task = new Task();
        taskList.add(task);
        System.out.println(Color.RED_BOLD + "" + task + Color.RESET + " add to Bucket");
    }

    public void printTaskList() {
        System.out.println(taskList);
    }
}
