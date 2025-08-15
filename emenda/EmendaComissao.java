class EmendaComissao extends Emenda {
    private String linkComissao;
    private String linkRelatorio;

    public EmendaComissao(String codigo, String autor, String uf, int ano, String linkComissao, String linkRelatorio) {
        super(codigo, autor, "Comissao", uf, ano);
        this.linkComissao = linkComissao;
        this.linkRelatorio = linkRelatorio;
    }

    public String paraTexto() {
        return super.paraTexto() + " [Link Comissão: " + linkComissao + "]";
    }
}
