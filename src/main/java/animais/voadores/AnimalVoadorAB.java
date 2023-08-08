package animais.voadores;

import animais.AnimalAB;

public abstract class AnimalVoadorAB extends AnimalAB {
    public int quantidadeAssas;
    public double envergaduraAssa;

    public abstract void voar();
    // Sobrescreve imprimirInformacoes com os atributos especificos
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Ele tem " + quantidadeAssas + " assas e suas assas tem " + envergaduraAssa + " cm de envergadura.");
    }
}