public class Papagaio extends Aves implements IPodeVoar{
    @Override
    public void voar() {
        System.out.println(getClass().getName()+" voa.");
    }
}
