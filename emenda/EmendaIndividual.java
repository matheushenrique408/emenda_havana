class EmendaIndividual extends Emenda {
    private String subtipo;

    public EmendaIndividual(String codigo, String autor, String uf, int ano, String subtipo) {
        super(codigo, autor, "Individual", uf, ano);
        this.subtipo = subtipo;
    }

    public String paraTexto() {
        return super.paraTexto() + " [Subtipo: " + subtipo + "]";
    }
}
