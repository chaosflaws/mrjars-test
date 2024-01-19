module de.chaosflaws.mrjars.test {
    requires org.junit.jupiter.api;

    requires de.chaosflaws.mrjars;

    opens de.chaosflaws.test to org.junit.platform.commons;
}