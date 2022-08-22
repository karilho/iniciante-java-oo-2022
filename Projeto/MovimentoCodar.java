public class MovimentoCodar {
    private String nomeCompleto;
    private String stack;

    private String papelNoMc;

    public MovimentoCodar(String nomeCompleto, String stack, String papelNoMc) {
        this.nomeCompleto = nomeCompleto;
        this.stack = stack;
        this.papelNoMc = papelNoMc;
    }


    public String getPapelNoMc() {
        return papelNoMc;
    }

    public void setPapelNoMc(String papelNoMc) {
        this.papelNoMc = papelNoMc;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

}
