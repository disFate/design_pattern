public class NewSsoInterceptor extends SsoDecorator{
    public NewSsoInterceptor(Interceptor interceptor) {
        super(interceptor);
    }
    @Override
    public boolean preHandle() {
        super.preHandle();
        System.out.println("new interceptor");
        return false;
    }
}
