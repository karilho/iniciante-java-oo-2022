public class McAprendiz{
    private String compartilharConhecimento;
    public String gerarDuvidasConteudos;
    public String gerarDuvidasProcessos;
    private MovimentoCodar movimentoCodar;

    public McAprendiz (String compartilharConhecimento, String gerarDuvidasConteudos, String gerarDuvidasProcessos) {
        this.compartilharConhecimento = compartilharConhecimento;
        this.gerarDuvidasConteudos = gerarDuvidasConteudos;
        this.gerarDuvidasProcessos = gerarDuvidasProcessos;
    }
    public MovimentoCodar getMovimentoCodar() {
        return movimentoCodar;
    }

    public void setMovimentoCodar(MovimentoCodar movimentoCodar) {
        this.movimentoCodar = movimentoCodar;
    }

    public String getCompartilharConhecimento() {
        return compartilharConhecimento;
    }

    public String getGerarDuvidasConteudos() {
        return gerarDuvidasConteudos;
    }

    public String getGerarDuvidasProcessos() {
        return gerarDuvidasProcessos;
    }

    public void setCompartilharConhecimento(String compartilharConhecimento) {
        this.compartilharConhecimento = compartilharConhecimento;
    }

    public void setGerarDuvidasConteudos(String gerarDuvidasConteudos) {
        this.gerarDuvidasConteudos = gerarDuvidasConteudos;
    }

    public void setGerarDuvidasProcessos(String gerarDuvidasProcessos) {
        this.gerarDuvidasProcessos = gerarDuvidasProcessos;
    }
}
