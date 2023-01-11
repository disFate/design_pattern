public abstract class SsoDecorator implements Interceptor {
    Interceptor interceptor;
    private SsoDecorator() {

    }
    public SsoDecorator(Interceptor interceptor) {
        this.interceptor = interceptor;
    }

    @Override
    public boolean preHandle() {
        return interceptor.preHandle();
    }
}
