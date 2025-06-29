package com.example;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class AlertManagerTest {

    @Test(expected = RuntimeException.class)
    public void testAlertThrowsException() {
        Notifier mockNotifier = mock(Notifier.class);
        doThrow(new RuntimeException("Alert failed"))
                .when(mockNotifier).alert("Warning");

        AlertManager manager = new AlertManager(mockNotifier);
        manager.process("Warning");

        verify(mockNotifier).alert("Warning");
    }
}
