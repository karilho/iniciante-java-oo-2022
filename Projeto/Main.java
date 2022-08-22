public class Main {
    public static void main(String[] args) {

        MovimentoCodar ParticipanteLucas = new MovimentoCodar("Lucas Carrilho De Almeida", "Utilizo as stacks Java e Go", "Eu sou um Aprendiz no Movimento Codar");
        MovimentoCodar ParticipanteGabriel = new MovimentoCodar("Gabriel Cestaro", "Utilizo Java e outras stacks", "Eu sou um Mentor no Movimento Codar");
        MovimentoCodar ParticipanteVinicius = new MovimentoCodar("Vinicius Ueda", "Utilizo JavaScript, Angular e outras stacks", "Eu sou um Mentor e Coordenador no Movimento Codar");
        MovimentoCodar ParticipanteJessica = new MovimentoCodar("Jessica Cestaro", "Sou responsável pelo recrutamento e seleção para a Bluesoft e o Movimento Codar", "Eu sou uma Organizadora no Movimento Codar");

        McAprendiz Lucas = new McAprendiz("Gosto de compartilhar conhecimento e dicas no discord",
                "O conteúdo sobre java me gerou algumas dúvidas",
                "Não tive dúvidas sobre o Movimento");


        McMentor Gabriel = new McMentor("Crio desafios de Java.",
                "Realizei palestras sobre Java.",
                "Ajudo os aprendizes com dúvidas gerais.");

        McOrganizadorMentor Vinicius = new McOrganizadorMentor("Crio desafios de JavaScript e crio eventos no Movimento Codar.",
                "Realizo resolução de desafios e organizo palestras.",
                "Ajudo os aprendizes com dúvidas no conteúdo","Resolvo dúvidas em relação ao Movimento Codar",
                "Auxílio mentores na fase de organização");


        McOrganizador Jessica = new McOrganizador("Auxilío com dúvidas em relação a seleção para o Movimento Codar",
                "Auxílio mentores sobre a organização geral do Movimento Codar");


        Lucas.setMovimentoCodar(ParticipanteLucas);
        Gabriel.setMovimentoCodar(ParticipanteGabriel);
        Vinicius.setMovimentoCodar(ParticipanteVinicius);
        Jessica.setMovimentoCodar(ParticipanteJessica);


        System.out.println("Meu nome é " + Lucas.getMovimentoCodar().getNomeCompleto() + "\n" + Lucas.getMovimentoCodar().getPapelNoMc() + "\n" +
                Lucas.getMovimentoCodar().getStack() + "\n" + Lucas.getCompartilharConhecimento() + "\n" + Lucas.getGerarDuvidasProcessos()
                + "\n" + Lucas.getGerarDuvidasConteudos() + "\n");

        System.out.println("Meu nome é " + Gabriel.getMovimentoCodar().getNomeCompleto() + "\n" + Gabriel.getMovimentoCodar().getPapelNoMc() + "\n"  + Gabriel.getMovimentoCodar().getStack()
                + "\n" + Gabriel.getCriarEvento() + "\n" + Gabriel.getMinistrarEvento()
                + "\n" + Gabriel.getResolverDuvidasConteudos() + "\n");

        System.out.println("Meu nome é " + Vinicius.getMovimentoCodar().getNomeCompleto() + "\n" + Vinicius.getMovimentoCodar().getPapelNoMc() + "\n"  + Vinicius.getMovimentoCodar().getStack()
                + "\n" + Vinicius.getCriarEvento() + "\n" + Vinicius.getMinistrarEvento()
                + "\n" + Vinicius.getResolverDuvidasConteudos() + "\n" + Vinicius.getResolverDuvidasProcessos() + "\n" + Vinicius.getAuxiliarMentores() + "\n");

        System.out.println("Meu nome é " + Jessica.getMovimentoCodar().getNomeCompleto() + "\n" + Jessica.getMovimentoCodar().getPapelNoMc() + "\n"  + Jessica.getMovimentoCodar().getStack() + "\n"
                + Jessica.getResolverDuvidasProcessos() + "\n" + Jessica.getAuxiliarMentores());
    }
}
