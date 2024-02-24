public class Felino extends Mamiferos implements IPodeNadar{
    @Override
    public void nadar() {
        System.out.println(getClass().getName()+" nada.");
    }
}
