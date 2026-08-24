public abstract class Usuario {
    private int matricula;
    private String nome;
    private String login;
    private String senha;

    public Usuario(int matricula, String nome, String login, String senha) {
        this.matricula = matricula;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    // Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Método corrigido e inserido DENTRO da classe
    public void exibeDados() {
        System.out.println("\nMatricula do Usuario: " + this.matricula);
        System.out.println("Nome do Usuario: " + this.nome);
        System.out.println("Login do Usuario: " + this.login);
    }
}