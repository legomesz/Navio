class NavioContainer extends Navio {
    int quantidadeGuindastes;
    int quantidadeCamadas;

    public NavioContainer(int id, String nome, int quantidadedePoroes, double capacidadedeCarga,
                          int quantidadeGuindastes, int quantidadeCamadas) {
        super(id, nome, quantidadedePoroes, capacidadedeCarga);
        this.quantidadeGuindastes = quantidadeGuindastes;
        this.quantidadeCamadas = quantidadeCamadas;
    }
}
