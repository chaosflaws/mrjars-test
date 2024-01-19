package de.chaosflaws;

public final class SwitchTest {
    public static String getPersonType(Person person) {
        if (person instanceof Customer)
            return "Customer";
        else if (person instanceof Employee)
            return "Employee";
        return "Unknown";
    }
}
