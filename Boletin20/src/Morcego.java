public class Morcego extends Mamiferos implements IPodeVoar{
    @Override
    public void voar() {
        System.out.println(getClass().getName()+" voa.");
    }
}
