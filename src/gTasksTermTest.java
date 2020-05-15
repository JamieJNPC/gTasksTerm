import static org.junit.jupiter.api.Assertions.*;

class gTasksTermTest {

    @org.junit.jupiter.api.Test
    void isNumber() {
        assertTrue(gTasksTerm.isNumber("1"));
        assertTrue(gTasksTerm.isNumber("127"));

        assertFalse(gTasksTerm.isNumber("-1"));
        assertFalse(gTasksTerm.isNumber("Hello"));
        assertFalse(gTasksTerm.isNumber("Hello!"));
        assertFalse(gTasksTerm.isNumber("Hello1"));
        assertFalse(gTasksTerm.isNumber("1Hello"));
        assertFalse(gTasksTerm.isNumber("1 Hello"));
        assertFalse(gTasksTerm.isNumber("Hello 1"));
    }

    @org.junit.jupiter.api.Test
    void getTaskIndex() {
    }

    @org.junit.jupiter.api.Test
    void completeTask() {
    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}