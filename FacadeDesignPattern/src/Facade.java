public class Facade {
    public ILoger loger;
    public ICaching caching;
    public IAuthorize authorize;

    public Facade() {
        loger = new Logging();
        caching = new Caching();
        authorize = new Authhorize();
    }
}
