public class McOrganizador{
    private String resolverDuvidasProcessos;
    private String auxiliarMentores;
    private MovimentoCodar movimentoCodar;

    public McOrganizador(String resolverDuvidasProcessos, String auxiliarMentores) {
        this.resolverDuvidasProcessos = resolverDuvidasProcessos;
        this.auxiliarMentores = auxiliarMentores;
    }

    public MovimentoCodar getMovimentoCodar() {
        return movimentoCodar;
    }
    public void setMovimentoCodar(MovimentoCodar movimentoCodar) {
        this.movimentoCodar = movimentoCodar;
    }

    public String getResolverDuvidasProcessos() {
        return resolverDuvidasProcessos;
    }

    public void setResolverDuvidasProcessos(String resolverDuvidasProcessos) {
        this.resolverDuvidasProcessos = resolverDuvidasProcessos;
    }

    public String getAuxiliarMentores() {
        return auxiliarMentores;
    }

    public void setAuxiliarMentores(String auxiliarMentores) {
        this.auxiliarMentores = auxiliarMentores;
    }

}