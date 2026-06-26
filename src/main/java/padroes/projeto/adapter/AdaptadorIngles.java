package padroes.projeto.adapter;

public class AdaptadorIngles {
    private AtendenteIngles atendente;

    public AdaptadorIngles(AtendenteIngles atendente) {
        this.atendente = atendente;
    }

    @Override
    public void cumprimentar() {
        this.atendente.cumprimentar();
    }

    @Override
    public void responderDuvida(String duvida) {
        this.atendente.responderDuvida(duvida);
    }

    @Override
    public void encerrarAtendimento() {
        this.atendente.encerrarAtendimento();
    }
}
