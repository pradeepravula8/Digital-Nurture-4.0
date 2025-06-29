package com.example;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class MonitoringServiceTest {

    @Test
    public void testGetStatusReturnsMultipleValues() {
       
        ExternalApiService mockApi = mock(ExternalApiService.class);

        when(mockApi.getStatus())
            .thenReturn("OK")
            .thenReturn("FAIL");

        MonitoringService monitoringService = new MonitoringService(mockApi);
        String result = monitoringService.monitor();

        assertEquals("First: OK, Second: FAIL", result);
    }
}
