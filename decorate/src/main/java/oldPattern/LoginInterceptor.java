package oldPattern;

public class LoginInterceptor extends SsoInterceptor{
    @Override
    public boolean preHandle() {
        return false;
    }
}
