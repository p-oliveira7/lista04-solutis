package animais.terrestres;

public class Cachorro extends AnimalTerrestreAB {

    @Override
    public void comer() {
        comidaIngerida += 1;
        System.out.println("O Cachorro "+ nome + " está comendo");
    }
    @Override
    public void moverse() {
        caminhoPercorrido += 1;
        System.out.println("O Cachorro "+ nome + " está se movendo");
    }
    @Override
    public void dormir() {
        horasDormidas += 1;
        System.out.println("O Cachorro "+ nome + " está dormindo");
    }
}