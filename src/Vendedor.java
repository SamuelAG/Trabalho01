public class Vendedor {
    private int codigo;
    private String nome;
    private float comissão;

    public Vendedor(int codigo, String nome, float comissão) {
        this.codigo = codigo;
        this.nome = nome;
        this.comissão = comissão;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComissão() {
        return comissão;
    }

    public void setComissão(float comissão) {
        this.comissão = comissão;
    }
}
