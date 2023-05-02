public class Item {
    private String nome;
    private String descricao;
    private String cor;

    public Item(String nome, String descricao, String cor) {
        this.nome = nome;
        this.descricao = descricao;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }

    public String getCor() {
        return cor;
    }
}
