public class Documento {
    private String id;
    private String data;
    private String fase;      // agora é String (antes era enum)
    private double valor;
    private String descricao;

    public Documento(String id, String data, String fase, double valor, String descricao) {
        this.id = id;
        this.data = data;
        this.fase = fase;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getFase() { return fase; }
    public double getValor() { return valor; }
    public String getData() { return data; }
    public String getId() { return id; }
    public String getDescricao() { return descricao; }

    public String paraTexto() {
        return "Documento: " + id + " - " + descricao + " (" + valor + ")";
    }
}

    }
}

