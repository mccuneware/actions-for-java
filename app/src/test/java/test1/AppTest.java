/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package test1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test public void appGivesASeven() {
        App classUnderTest = new App();
        assertEquals("App should give a seven", classUnderTest.giveAnInt(), 7);
    }
}
