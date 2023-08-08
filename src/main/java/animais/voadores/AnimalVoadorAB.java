package animais.voadores;

import animais.AnimalAB;

public abstract class AnimalVoadorAB extends AnimalAB {
    public int quantidadeAsas;
    public double envergaduraAsa;

    public abstract void voar();
    // Sobrescreve imprimirInformacoes com os atributos especificos
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Ele tem " + quantidadeAsas + " asas e suas asas tem " + envergaduraAsa + " cm de envergadura.");
    }
}