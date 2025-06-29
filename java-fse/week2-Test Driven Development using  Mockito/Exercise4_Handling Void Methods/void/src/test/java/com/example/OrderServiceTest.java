package com.example;

import org.junit.Test;
import static org.mockito.Mockito.*;


public class OrderServiceTest {

    @Test
    public void testLogCalledOnPlaceOrder() {
    
        LoggerService mockLogger = mock(LoggerService.class);
        doNothing().when(mockLogger).log(anyString());
        OrderService orderService = new OrderService(mockLogger);
        orderService.placeOrder("ORD123");

        verify(mockLogger).log(contains("ORD123"));
    }
}
