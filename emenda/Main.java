public class Main {
    public static void main(String[] args) {
        
        Documento doc = new Documento("D001", "01/09/2025", "Aprovado", 500000, "Projeto de Lei");
        System.out.println(doc.paraTexto());

        Convenio conv = new Convenio("C001", "Convênio de Saúde", 50000);
        System.out.println(conv.paraTexto());

        Emenda emendaI1 = new EmendaIndividual("EI001", "Tulio Gadêlha", "PE", 2025, "Saúde");
        Emenda emendaI2 = new EmendaIndividual("EI002", "Ossesio Silva", "PE", 2025, "Educação");
        Emenda emendaI3 = new EmendaIndividual("EI003", "Eduardo da Fonte", "PE", 2025, "Infraestrutura");

        EmendaBancada emendaB1 = new EmendaBancada("EB001", "Bancada de Pernambuco", "PE", 2021, "linkAta1");
        emendaB1.adicionarMembro("Membro A");
        emendaB1.adicionarMembro("Membro B");

        EmendaBancada emendaB2 = new EmendaBancada("EB002", "Bancada de Pernambuco", "PE", 2023, "linkAta2");
        emendaB2.adicionarMembro("Membro C");

        EmendaBancada emendaB3 = new EmendaBancada("EB003", "Bancada de Pernambuco", "PE", 2025, "linkAta3");
        emendaB3.adicionarMembro("Membro D");
        emendaB3.adicionarMembro("Membro E");
        emendaB3.adicionarMembro("Membro F");

        EmendaComissao emendaC1 = new EmendaComissao("EC001", "Comissão da Saúde", "PE", 2024, "linkCom1", "linkRel1");
        EmendaComissao emendaC2 = new EmendaComissao("EC002", "Comissão da Saúde v2", "PE", 2024, "linkCom2", "linkRel2");
        EmendaComissao emendaC3 = new EmendaComissao("EC003", "Comissão da Saúde v3", "PE", 2024, "linkCom3", "linkRel3");

        EmendaRelator emendaR1 = new EmendaRelator("ER001", "Relator Geral", "PE", 2021, "Relator X");
        EmendaRelator emendaR2 = new EmendaRelator("ER002", "Relator Geral v2", "PE", 2021, "Relator Y");
        EmendaRelator emendaR3 = new EmendaRelator("ER003", "Relator Geral", "PE", 2022, "Relator Z");

        System.out.println(emendaI1.paraTexto());
        System.out.println(emendaI2.paraTexto());
        System.out.println(emendaI3.paraTexto());

        System.out.println(emendaB1.paraTexto());
        System.out.println(emendaB2.paraTexto());
        System.out.println(emendaB3.paraTexto());

        System.out.println(emendaC1.paraTexto());
        System.out.println(emendaC2.paraTexto());
        System.out.println(emendaC3.paraTexto());

        System.out.println(emendaR1.paraTexto());
        System.out.println(emendaR2.paraTexto());
        System.out.println(emendaR3.paraTexto());
    }
}
