import junit.framework.TestCase;

/**
 * If there's no test, Maven isn't happy.
 * @author Kohsuke Kawaguchi
 */
public class DummyTest extends TestCase {
    public DummyTest(String name) {
        super(name);
    }
    
    public void test1() {}
}
