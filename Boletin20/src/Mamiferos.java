public class Mamiferos implements IPodeCaminar{

    @Override
    public void caminar() {
        System.out.println(getClass().getName()+" camiña.");
    }
}
