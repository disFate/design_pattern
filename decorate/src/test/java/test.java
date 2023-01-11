import org.junit.Test;

public class test {
    @Test
    public void test1() {
        SsoInterceptor ssoInterceptor = new SsoInterceptor();
        ssoInterceptor.preHandle();
        NewSsoInterceptor newSsoInterceptor = new NewSsoInterceptor(ssoInterceptor);
        newSsoInterceptor.preHandle();
    }
}
