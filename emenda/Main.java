public class Main {
    public static void main(String[] args) {
        // Exemplo Emenda Individual
        EmendaIndividual ind = new EmendaIndividual("001", "Autor A", "PE", 2025, "Transferência");
        ind.adicionarDocumento(new Documento("D1", "2025-01-01", Documento.Fase.EMPENHO, 1000, "Empenho inicial"));
        ind.adicionarConvenio(new Convenio("C1", "Convênio Saúde", 1000));
        System.out.println(ind.paraTexto());

        // Exemplo Emenda Bancada
        EmendaBancada bac = new EmendaBancada("002", "Bancada PE", "PE", 2025, "linkAta");
        bac.adicionarMembro("Deputado X");
        System.out.println(bac.paraTexto());

        // Exemplo Emenda Comissão
        EmendaComissao com = new EmendaComissao("003", "Comissão Saúde", "PE", 2025, "linkComissao", "linkRelatorio");
        System.out.println(com.paraTexto());

        // Exemplo Emenda Relator
        EmendaRelator rel = new EmendaRelator("004", "Relator Geral", "PE", 2025, "Fulano");
        System.out.println(rel.paraTexto());
    }
}
