package animais.voadores;

public class Pombo extends AnimalVoadorAB {

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
    @Override
    public void voar() {
        caminhoPercorrido += 1;
        imprimirMensagem("está voando");
    }
    private void imprimirMensagem(String mensagem) {
        System.out.println("O Pombo " + nome + " " + mensagem);
    }

}
