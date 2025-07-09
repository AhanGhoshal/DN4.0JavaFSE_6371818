import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestExample {
    Example ob = new Example();
    @Test
    public void testAdd() {
        int result = ob.Add(2,3);
        Assertions.assertEquals(5, result, "Unsuccessful");
        System.out.println("Successful");
    }
}


