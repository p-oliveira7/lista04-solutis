package animais.terrestres;

import animais.AnimalAB;

abstract class AnimalTerrestreAB extends AnimalAB {
    public int quantidadePatas;
    // Sobrescreve imprimirInformacoes com os atributos especificos
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println(nome + " tem " +  quantidadePatas + " patas.");
    }
}
