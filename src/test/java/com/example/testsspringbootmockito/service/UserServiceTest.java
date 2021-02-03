package com.example.testsspringbootmockito.service;

import com.example.testsspringbootmockito.TestsSpringBootMockitoApplication;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private NameService nameService;

    public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {

        Mockito.when(nameService.getUserName("someId")).thenReturn("Mock user name");
        String testName = userService.getUserName("someId");
        Assert.assertEquals("Mock user nameee", testName);

    }

}
