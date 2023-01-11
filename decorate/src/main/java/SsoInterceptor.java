public class SsoInterceptor implements Interceptor {
    @Override
    public boolean preHandle() {
        System.out.println("interceptor");
        return false;
    }
}
