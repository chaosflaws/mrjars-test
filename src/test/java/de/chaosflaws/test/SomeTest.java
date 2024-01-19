package de.chaosflaws.test;

import de.chaosflaws.Customer;
import de.chaosflaws.SwitchTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomeTest {
    @Test
    void smoke_test() {
        Assertions.assertEquals("Customer", SwitchTest.getPersonType(new Customer("John Doe")));
    }
}
