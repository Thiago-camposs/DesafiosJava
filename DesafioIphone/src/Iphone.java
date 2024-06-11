public class Iphone implements NavegadorInternet,ReprodutorMusical,AparelhoTelefonico{
    @Override
    public void exibirpagina(String url) {
        System.out.println("Exibindo a página"+url);
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }
    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica"+musica);
    }
    @Override
    public void atender() {
        System.out.println("Atendendo Ligação");
    }
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para" + numero);
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
} 

