public class McOrganizadorMentor extends McMentor{
    private String resolverDuvidasProcessos;
    private String auxiliarMentores;


    public McOrganizadorMentor(String criarEvento, String ministrarEvento, String resolverDuvidasConteudos, String resolverDuvidasProcessos, String auxiliarMentores) {
        super(criarEvento, ministrarEvento, resolverDuvidasConteudos);
        this.resolverDuvidasProcessos = resolverDuvidasProcessos;
        this.auxiliarMentores = auxiliarMentores;
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

