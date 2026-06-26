package padroes.projeto.adapter;

public class AdaptadorEspanhol {
    private AtendenteEspanhol atendente;

    public AdaptadorEspanhol(AtendenteEspanhol atendente) {
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
