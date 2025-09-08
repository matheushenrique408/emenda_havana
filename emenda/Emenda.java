public class Emenda {
    protected String codigo;
    protected String autor;
    protected String tipo;
    protected String uf;
    protected int ano;

    protected Documento documento;
    protected Convenio convenio;

    public Emenda(String codigo, String autor, String tipo, String uf, int ano) {
        this.codigo = codigo;
        this.autor = autor;
        this.tipo = tipo;
        this.uf = uf;
        this.ano = ano;
        this.documento = null;
        this.convenio = null;
    }

    public void adicionarDocumento(Documento doc) {
        this.documento = doc;
    }

    public void adicionarConvenio(Convenio conv) {
        this.convenio = conv;
    }

    public String paraTexto() {
        return "Emenda: " + codigo + " (" + tipo + ") - " + autor;
    }
}
