public class CustomerManager {
    private Facade facade;

    public CustomerManager() {
        facade = new Facade();
    }
    public void save(){
        facade.loger.log();
        facade.caching.cache();
        facade.authorize.checkUser();
        System.out.println("saved");
    }
}
