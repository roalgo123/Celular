interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface para Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba(String url);
    void atualizarPagina();
}

// Classe principal iPhone que implementa as interfaces
class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        // Implementação aqui
    }

    @Override
    public void pausar() {
        // Implementação aqui
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação aqui
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        // Implementação aqui
    }

    @Override
    public void atender() {
        // Implementação aqui
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação aqui
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        // Implementação aqui
    }

    @Override
    public void adicionarNovaAba(String url) {
        // Implementação aqui
    }

    @Override
    public void atualizarPagina() {
        // Implementação aqui
    }
}

public class Celular {
    public static void main(String[] args) {
        // Exemplo de uso do iPhone
        IPhone iphone = new IPhone();
        iphone.tocar();
        iphone.ligar("123-456-7890");
        iphone.exibirPagina("https://www.apple.com");
    }
}
