package com.example;

import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class WorkflowTest {

    @Test
    public void testMethodCallOrder() {
        TaskService mockTaskService = mock(TaskService.class);
        Workflow workflow = new Workflow(mockTaskService); // <-- fixed semicolon
        workflow.runWorkflow();
        InOrder inOrder = inOrder(mockTaskService);
        inOrder.verify(mockTaskService).initialize();
        inOrder.verify(mockTaskService).process();
        inOrder.verify(mockTaskService).cleanup();
    }
}
