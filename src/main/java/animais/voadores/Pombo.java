package animais.voadores;

public class Pombo extends AnimalVoadorAB {

    @Override
    public void comer() {
        comidaIngerida += 1;
        System.out.println("O Pombo "+ nome + " está comendo");
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 1;
        System.out.println("O Pombo "+ nome + " está se movendo");
    }

    @Override
    public void dormir() {
        horasDormidas += 1;
        System.out.println("O Pombo " + nome +" está dormindo");
    }

    @Override
    public void voar() {
        caminhoPercorrido += 1;
        System.out.println("O Pombo " + nome +" está voando");
    }
}
