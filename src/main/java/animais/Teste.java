package animais;

import animais.marinhos.Peixe;
import animais.terrestres.Gato;
import animais.voadores.Pombo;

public class Teste {

    public static void main(String[] args){
        var gato = new Gato();
        gato.nome = "Bichano";
        gato.peso = 5;
        gato.idade = 2;
        gato.habitat = "Domestico";
        gato.tipoAnimal= "Terrestre";
        gato.altura = 30;
        gato.quantidadePatas = 4;
        gato.dormir();
        gato.moverse();
        gato.comer();
        gato.imprimirInformacoes();

        var peixe = new Peixe();
        peixe.nome = "Nemo";
        peixe.peso = 1;
        peixe.idade = 2;
        peixe.habitat = "Oceano";
        peixe.tipoAnimal= "Marinho";
        peixe.altura = 10;
        peixe.dormir();
        peixe.nadar();
        peixe.comer();
        peixe.imprimirInformacoes();

        var pombo = new Pombo();
        pombo.nome = "Napoleão";
        pombo.peso = 1;
        pombo.idade = 3;
        pombo.habitat = "Urbano";
        pombo.tipoAnimal= "Voador";
        pombo.altura = 25;
        pombo.quantidadeAsas = 2;
        pombo.envergaduraAsa = 40;
        pombo.dormir();
        pombo.comer();
        pombo.voar();
        pombo.imprimirInformacoes();
    }
}


