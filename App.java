public class EmpresaNavegacao {
    public static void main(String[] args) {
        NavioGraneleiro navio1 = new NavioGraneleiro(1, "Estrela do Mar", 4, 50000, 4);
        NavioGraneleiro navio2 = new NavioGraneleiro(2, "Cruzeiro do Sul", 3, 80000, 6);
        NavioContainer navio3 = new NavioContainer(3, "Bela Fera", 2, 100000, 2, 30);
        NavioContainer navio4 = new NavioContainer(4, "Arrecifes", 2, 120000, 2, 30);
        NavioContainer navio5 = new NavioContainer(5, "Águas Belas", 1, 90000, 0, 25);

        // Armazenar navios em listas
        List<NavioGraneleiro> graneleiros = new ArrayList<>();
        graneleiros.add(navio1);
        graneleiros.add(navio2);

        List<NavioContainer> containers = new ArrayList<>();
        containers.add(navio3);
        containers.add(navio4);
        containers.add(navio5);

        // Exibir informações dos navios
        System.out.println("Navios Graneleiros:");
        for (NavioGraneleiro navio : graneleiros) {
            System.out.println("ID: " + navio.id);
            System.out.println("Nome: " + navio.nome);
            System.out.println("Quantidade de Porões: " + navio.quantidadedePoroes);
            System.out.println("Capacidade de Carga: " + navio.capacidadedeCarga