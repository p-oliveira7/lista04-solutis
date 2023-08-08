package animais.terrestres;

public class Gato extends AnimalTerrestreAB {
    @Override
    public void comer() {
        comidaIngerida += 1;
        System.out.println("O Gato "+ nome +" está comendo");
    }
    @Override
    public void moverse() {
        caminhoPercorrido += 1;
        System.out.println("o Gato " + nome + " está se movendo");
    }
    @Override
    public void dormir() {
        horasDormidas += 1;
        System.out.println("O Gato " + nome + " está dormindo");
    }
}