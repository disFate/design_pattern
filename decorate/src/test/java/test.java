import decorate.Beverage;
import decorate.DarkRoast;
import decorate.Milk;
import decorate.Mocha;
import org.junit.Test;

public class test {
    @Test
    public void test1() {
        SsoInterceptor ssoInterceptor = new SsoInterceptor();
        ssoInterceptor.preHandle();
        NewSsoInterceptor newSsoInterceptor = new NewSsoInterceptor(ssoInterceptor);
        newSsoInterceptor.preHandle();
    }

    @Test
    public void test2(){
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Milk(darkRoast);
        darkRoast = new Mocha(darkRoast);
        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.cost());
    }
}
