package padroes.projeto.adapter;

public class Main {
    public static void main(String[] args){
        CentralAtendimento central = new CentralAtendimento();
        String duvidaUsuario = "Como rastrear o pedido?";

        System.out.println("-- Atendimento Brasileiro --");
        AtendentePT atendenteBR = new AtendenteBrasileiro();
        central.realizarAtendimento(atendenteBR, duvidaUsuario);

        System.out.println("\n=== Atendimento Inglês (Via Adaptador) ===");
        AtendenteIngles atendenteEN = new AtendenteIngles();
        AtendentePT adaptadorEN = new AdaptadorIngles(atendenteEN);
        central.realizarAtendimento(adaptadorEN, duvidaUsuario);

        System.out.println("\n=== Atendimento Espanhol (Via Adaptador) ===");
        AtendenteEspanhol atendenteES = new AtendenteEspanhol();
        AtendentePT adaptadorES = new AdaptadorEspanhol(atendenteES);
        central.realizarAtendimento(adaptadorES, duvidaUsuario);
    }
}
