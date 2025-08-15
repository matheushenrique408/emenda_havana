class Convenio {
    private String id;
    private String descricao;
    private double valor;

    public Convenio(String id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getId() { return id; }
    public String getDescricao() { return descricao; }
    public double getValor() { return valor; }

    public String paraTexto() {
        return "Convenio: " + id + " - " + descricao + " (" + valor + ")";
    }
}
