public class Aluno extends Usuario {
    private double notaAV1;
    private double notaAV2;

    public Aluno(int matricula, String nome, String login, String senha) {
        super(matricula, nome, login, senha);
        
    
    }
    
    public double getNotaAV1() {
        return notaAV1;
    }

    public void setNotaAV1(double notaAV1) {
        this.notaAV1 = notaAV1;
    }

    public double getNotaAV2() {
        return notaAV2;
    }

    public void setNotaAV2(double notaAV2) {
        this.notaAV2 = notaAV2;
    }

    @Override
    public void exibeDados() {
        super.exibeDados(); // Chama o exibeDados() da classe Usuario
        System.out.println("Nota AV1: " + this.notaAV1);
        System.out.println("Nota AV2: " + this.notaAV2);
    }
}