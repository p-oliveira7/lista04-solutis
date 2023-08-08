package animais.terrestres;

public class Leao extends AnimalTerrestreAB {
    @Override
    public void comer() {
        comidaIngerida += 1;
        System.out.println("O Leão " + nome + " está comendo");
    }
    @Override
    public void moverse() {
        caminhoPercorrido += 1;
        System.out.println("O Leão "+ nome + " está comendo");
    }
    @Override
    public void dormir() {
        horasDormidas += 1;
        System.out.println("O Leão " + nome + " está comendo");
    }
}