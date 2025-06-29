package com.example;


import org.junit.Test;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testSendIsCalledWithCorrectArguments() {
        // Step 1: Create mock object
        NotificationService mockNotificationService = mock(NotificationService.class);

        // Step 2: Use mock in the class under test
        UserService userService = new UserService(mockNotificationService);

        // Step 3: Call method with specific arguments
        userService.registerUser("test@example.com");

        // Step 4: Verify the interaction using argument matchers
        verify(mockNotificationService).send(eq("test@example.com"), contains("Welcome"));
    }
}

