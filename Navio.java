abstract class Navio {
    int id;
    String nome;
    int quantidadedePoroes;
    double capacidadedeCarga;
    String disponibilidade;

    public Navio(int id, String nome, int quantidadedePoroes, double capacidadedeCarga) {
        this.id = id;
        this.nome = nome;
        this.quantidadedePoroes = quantidadedePoroes;
        this.capacidadedeCarga = capacidadedeCarga;
        this.disponibilidade = "Vazio";
    }

    public void iniciaCarregamento() {
        this.disponibilidade = "Carregando";
    }

    public void bloqueiaCarregamento() {
        this.disponibilidade = "Lotado";
    }
}