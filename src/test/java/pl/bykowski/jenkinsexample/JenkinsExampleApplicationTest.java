package pl.bykowski.jenkinsexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JenkinsExampleApplicationTest {

    @Test
    void adder() {
        JenkinsExampleApplication jenkinsExampleApplication = new JenkinsExampleApplication();
        assertEquals(10, jenkinsExampleApplication.adder(5,5));
    }
}