package padroes.projeto.factory;

public class Main {
    public static void main(String[] args){

        EsportesUIFactory adidasFactory = EsportesUIFactory.getFactory("adidas");
        
        // Deve conter a opção Nike aqui
        EsportesUIFactory nikeFactory = EsportesUIFactory.getFactory("nike");

        // Fábrica dos produtos Nike aqui

        ProdutoUI tenisNike = nikeFactory.fabricarTenis();
        ProdutoUI camisaNike = nikeFactory.fabricarCamisa();

        ProdutoUI tenisAdidas = adidasFactory.fabricarTenis();
        ProdutoUI camisaAdidas = adidasFactory.fabricarCamisa();

        //
        //
        printDetalhes(tenisAdidas);
        printDetalhes(camisaAdidas);

        printDetalhes(tenisNike);
        printDetalhes(camisaNike);
    }

    static void printDetalhes(ProdutoUI s){
        System.out.println("Logo: " + s.getLogo());
        System.out.println("Tamanho: " + s.getTamanho());
    }
}