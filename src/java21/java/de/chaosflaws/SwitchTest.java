package de.chaosflaws;

public final class SwitchTest {
    public static String getPersonType(Person person) {
        return switch (person) {
            case Customer customer -> "Customer";
            case Employee employee -> "Employee";
        };
    }
}
