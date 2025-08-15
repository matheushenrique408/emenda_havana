class EmendaRelator extends Emenda {
    private String nomeRelator;

    public EmendaRelator(String codigo, String autor, String uf, int ano, String nomeRelator) {
        super(codigo, autor, "Relator", uf, ano);
        this.nomeRelator = nomeRelator;
    }

    public String paraTexto() {
        return super.paraTexto() + " [Relator: " + nomeRelator + "]";
    }
}
