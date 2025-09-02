public class Main {
    public static void main(String[] args) {
        Documento doc = new Documento("Projeto de Lei", "Descrição do projeto");
        System.out.println(doc);

        Convenio conv = new Convenio("Convênio de Saúde", 50000);
        System.out.println(conv);

       
        Emenda emendaI1 = new EmendaIndividual("Tulio Gadêlha", 1100000);
        Emenda emendaI2 = new EmendaIndividual("Ossesio Silva", 171727);
        Emenda emendaI3 = new EmendaIndividual("Eduardo da Fonte", 82000);

        
        Emenda emendaB1 = new EmendaBancada("Bancada de Pernambuco (Palmares 2021)", 674000);
        Emenda emendaB2 = new EmendaBancada("Bancada de Pernambuco (Cortes 2023)", 200000);
        Emenda emendaB3 = new EmendaBancada("Bancada de Pernambuco (Toritama 2025)", 1260000);

    
        Emenda emendaC1 = new EmendaComissao("Comissão da Saúde (Cortes 2024)", 986375);
        Emenda emendaC2 = new EmendaComissao("Comissão da Saúde (Cortes 2024, v2)", 1520000);
        Emenda emendaC3 = new EmendaComissao("Comissão da Saúde (Cortes 2024, v3)", 2212025);

 
        Emenda emendaR1 = new EmendaRelator("Relator Geral (Palmares 2021)", 999970);
        Emenda emendaR2 = new EmendaRelator("Relator Geral (Palmares 2021, v2)", 1000000);
        Emenda emendaR3 = new EmendaRelator("Relator Geral (Toritama 2022)", 1300000);

    
        System.out.println(emendaI1);
        System.out.println(emendaI2);
        System.out.println(emendaI3);

        System.out.println(emendaB1);
        System.out.println(emendaB2);
        System.out.println(emendaB3);

        System.out.println(emendaC1);
        System.out.println(emendaC2);
        System.out.println(emendaC3);

        System.out.println(emendaR1);
        System.out.println(emendaR2);
        System.out.println(emendaR3);

        doc.setFase(Documento.Fase.ANALISE);
        System.out.println("Documento atualizado: " + doc);
    }
}
