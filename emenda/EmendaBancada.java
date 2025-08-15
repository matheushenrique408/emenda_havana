class EmendaBancada extends Emenda {
    private java.util.List<String> membros = new java.util.ArrayList<String>();
    private String linkAta;

    public EmendaBancada(String codigo, String autor, String uf, int ano, String linkAta) {
        super(codigo, autor, "Bancada", uf, ano);
        this.linkAta = linkAta;
    }

    public void adicionarMembro(String nome) {
        membros.add(nome);
    }

    public String paraTexto() {
        return super.paraTexto() + " [Membros: " + membros.size() + "]";
    }
}

