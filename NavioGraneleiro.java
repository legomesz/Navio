class NavioGraneleiro extends Navio {
    int quantidadedeEscotilhas;

    public NavioGraneleiro(int id, String nome, int quantidadedePoroes, double capacidadedeCarga,
                            int quantidadedeEscotilhas) {
        super(id, nome, quantidadedePoroes, capacidadedeCarga);
        this.quantidadedeEscotilhas = quantidadedeEscotilhas;
    }
}