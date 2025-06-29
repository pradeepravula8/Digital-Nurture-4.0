package com.example;

public class Workflow {
    private TaskService taskService;

    public Workflow(TaskService taskService) {
        this.taskService = taskService;
    }

    public void runWorkflow() {
        taskService.initialize();
        taskService.process();
        taskService.cleanup();
    }
}
