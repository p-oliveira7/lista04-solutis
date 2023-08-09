package animais.marinhos;

public class Peixe extends AnimalMarinhoAB {

    @Override
    public void nadar() {
        caminhoPercorrido += 1;
        imprimirMensagem("está nadando");
    }

    @Override
    public void comer() {
        comidaIngerida += 1;
        imprimirMensagem("está comendo");
    }
    @Override
    public void moverse() {
        caminhoPercorrido += 1;
        imprimirMensagem("está se movendo");
    }
    @Override
    public void dormir() {
        horasDormidas += 1;
        imprimirMensagem("está dormindo");
    }
    private void imprimirMensagem(String mensagem) {
        System.out.println("O Peixe " + nome + " " + mensagem);
    }
}