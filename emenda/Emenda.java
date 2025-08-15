class Emenda {
    protected String codigo;
    protected String autor;
    protected String tipo;
    protected String uf;
    protected int ano;
    protected java.util.List<Documento> documentos = new java.util.ArrayList<Documento>();
    protected java.util.Map<String, Convenio> convenios = new java.util.HashMap<String, Convenio>();

    public Emenda(String codigo, String autor, String tipo, String uf, int ano) {
        this.codigo = codigo;
        this.autor = autor;
        this.tipo = tipo;
        this.uf = uf;
        this.ano = ano;
    }

    public void adicionarDocumento(Documento doc) {
        documentos.add(doc);
    }

    public void adicionarConvenio(Convenio conv) {
        convenios.put(conv.getId(), conv);
    }

    public double totalPorFase(Documento.Fase fase) {
        double total = 0;
        for (Documento d : documentos) {
            if (d.getFase() == fase) {
                total += d.getValor();
            }
        }
        return total;
    }

    public String paraTexto() {
        return "Emenda: " + codigo + " (" + tipo + ") - " + autor;
    }
}
