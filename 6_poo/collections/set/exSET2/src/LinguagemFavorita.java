public class LinguagemFavorita {

    private String nome;
    private Integer anodeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anodeCriacao, String ide) {
        this.nome = nome;
        this.anodeCriacao = anodeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnodeCriacao() {
        return anodeCriacao;
    }

    public void setAnodeCriacao(Integer anodeCriacao) {
        this.anodeCriacao = anodeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anodeCriacao='" + anodeCriacao + '\'' +
                ", ide='" + ide + '\'' +
                '}';
    }
}
