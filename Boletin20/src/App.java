public class App {
    public static void main(String[] args) {


        Gato gato = new Gato();
        Tigre tigre = new Tigre();
        Morcego morcego = new Morcego();
        Avestruz avestruz = new Avestruz();
        Papagaio papagaio = new Papagaio();

        System.out.println();
        gato.caminar();
        gato.nadar();

        System.out.println();
        tigre.caminar();
        tigre.nadar();

        System.out.println();
        morcego.caminar();
        morcego.voar();

        System.out.println();
        avestruz.caminar();

        System.out.println();
        papagaio.caminar();
        papagaio.voar();
    }
}
