package animais.marinhos;

public class Peixe extends AnimalMarinhoAB {

    @Override
    public void nadar() {
        caminhoPercorrido += 1;
        System.out.println("O Peixe " + nome + " está nadando");
    }

    @Override
    public void comer() {
        comidaIngerida += 1;
        System.out.println("O Peixe " + nome + " está comendo");
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 1;
        System.out.println("O Peixe " + nome + " está se movendo");
    }

    @Override
    public void dormir() {
        horasDormidas += 1;
        System.out.println("O Peixe " + nome + " está dormindo");
    }
}