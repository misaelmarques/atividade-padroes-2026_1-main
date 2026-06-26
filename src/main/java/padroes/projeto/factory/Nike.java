package padroes.projeto.factory;

public class Nike implements EsportesUIFactory {
    
    @Override
    public ProdutoUI fabricarTenis() {
        return new TenisNike("Nike", 40); // Tamanho de exemplo
    }

    @Override
    public ProdutoUI fabricarCamisa() {
        return new CamisaNike("Nike", 42); // Tamanho de exemplo
    }
}