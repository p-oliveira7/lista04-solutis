package animais.terrestres;

public class Elefante extends AnimalTerrestreAB {
    @Override
    public void comer() {
        comidaIngerida += 1;
        System.out.println("O Elefante "+ nome + " está comendo");
    }
    @Override
    public void moverse() {
        caminhoPercorrido += 1;
        System.out.println("O Elefante "+ nome + " está comendo");
    }
    @Override
    public void dormir() {
        horasDormidas += 1;
        System.out.println("O Elefante "+ nome + " está comendo");
    }
}