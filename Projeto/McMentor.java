public class McMentor {
    private String criarEvento;
    private String ministrarEvento;
    private String resolverDuvidasConteudos;
    private MovimentoCodar movimentoCodar;

    public McMentor (String criarEvento, String ministrarEvento, String resolverDuvidasConteudos) {
        this.criarEvento = criarEvento;
        this.ministrarEvento = ministrarEvento;
        this.resolverDuvidasConteudos = resolverDuvidasConteudos;
    }

    public MovimentoCodar getMovimentoCodar() {
        return movimentoCodar;
    }

    public void setMovimentoCodar(MovimentoCodar movimentoCodar) {
        this.movimentoCodar = movimentoCodar;
    }
    private String auxiliarAprendizes;

    public String getCriarEvento() {
        return criarEvento;
    }

    public void setCriarEvento(String criarEvento) {
        this.criarEvento = criarEvento;
    }

    public String getMinistrarEvento() {
        return ministrarEvento;
    }

    public void setMinistrarEvento(String ministrarEvento) {
        this.ministrarEvento = ministrarEvento;
    }

    public String getResolverDuvidasConteudos() {
        return resolverDuvidasConteudos;
    }

    public void setResolverDuvidasConteudos(String resolverDuvidasConteudos) {
        this.resolverDuvidasConteudos = resolverDuvidasConteudos;
    }

    public String getAuxiliarAprendizes() {
        return auxiliarAprendizes;
    }

    public void setAuxiliarAprendizes(String auxiliarAprendizes) {
        this.auxiliarAprendizes = auxiliarAprendizes;
    }

}
