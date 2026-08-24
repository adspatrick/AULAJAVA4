public class Professor extends Usuario {
    private String areaAtuacao;

    public Professor(int matricula, String nome, String login, String senha, String areaAtuacao) {
        super(matricula, nome, login, senha);
        this.areaAtuacao = areaAtuacao; // Adicionada a atribuição
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public void exibeDados() {
        System.out.println("");
        System.out.println("DADOS DO PROFESSOR: " + getMatricula());
        super.exibeDados(); // Corrigida a chamada da superclasse (adicionados parênteses)
        
        if (areaAtuacao != null && !areaAtuacao.isEmpty()) { // Corrigido o operador !=
            System.out.println("Área de Atuação: " + areaAtuacao);
        }
    }
}