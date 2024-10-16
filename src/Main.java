public class Main {
    public static void main(String[] args) {
        Taffe taffe = new Taffe();
        taffe.dizerOi();

        String fala = taffe.dizerOi();
        System.out.println(fala);

        taffe.falar("Gremio melhor que inter");
        taffe.falar("Aprendendo Classes em java");

        taffe.andar(30, false);
        taffe.andar(20, true);
        taffe.retornarPosicao();

        Taffe patrick = new Taffe();
        patrick.andar(20, true);
        patrick.retornarPosicao();
    }
}