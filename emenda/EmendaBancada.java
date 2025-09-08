class EmendaBancada extends Emenda {
    private String membro1;
    private String membro2;
    private String membro3;
    private String linkAta;

    public EmendaBancada(String codigo, String autor, String uf, int ano, String linkAta) {
        super(codigo, autor, "Bancada", uf, ano);
        this.linkAta = linkAta;
        this.membro1 = null;
        this.membro2 = null;
        this.membro3 = null;
    }

    public void adicionarMembro(String nome) {
        if (membro1 == null) {
            membro1 = nome;
        } else if (membro2 == null) {
            membro2 = nome;
        } else if (membro3 == null) {
            membro3 = nome;
        }
      
    }

    public String paraTexto() {
        int total = 0;
        if (membro1 != null) total++;
        if (membro2 != null) total++;
        if (membro3 != null) total++;
        return super.paraTexto() + " [Membros: " + total + "]";
    }
}



