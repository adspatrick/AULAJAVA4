public class PrimeiroExemploHeranca {
    public static void main(String[] args) {
        
        /*// Instanciação do Usuario genérico
        Usuario usuario = new Usuario(
            Teclado.leInt("Informe a matricula do usuario: "),
            Teclado.leString("Informe o nome do usuario: "),
            Teclado.leString("Informe o login do usuario: "),
            Teclado.leString("Informe a senha do usuario: ")
        );*/

        // Instanciação do Professor (incluindo a área de atuação)
        Professor professor = new Professor(
            Teclado.leInt("\nInforme a matricula do professor: "),
            Teclado.leString("Informe o nome do Professor: "),
            Teclado.leString("Informe o login do Professor: "),
            Teclado.leString("Informe a senha do Professor: "),
            Teclado.leString("Informe a área de atuação do Professor: ")
        );

        // Instanciação do Aluno (sem notas no construtor)
        Aluno aluno = new Aluno(
            Teclado.leInt("\nInforme a matricula do aluno: "),
            Teclado.leString("Informe o nome do aluno: "),
            Teclado.leString("Informe o login do aluno: "),
            Teclado.leString("Informe a senha do aluno: ")
        );

        System.out.println("\n--- DADOS REGISTRADOS ---");
        
        /*System.out.println("\nMatricula do Usuario: " + usuario.getMatricula());
        System.out.println("Nome do Usuario: " + usuario.getNome());*/

        System.out.println("\nMatricula do Professor: " + professor.getMatricula());
        System.out.println("Nome do Professor: " + professor.getNome());
        System.out.println("Área de Atuação do Professor: " + professor.getAreaAtuacao());

        System.out.println("\nMatricula do Aluno: " + aluno.getMatricula());
        System.out.println("Nome do Aluno: " + aluno.getNome());
        
        // Chamadas de exibeDados()
        /*usuario.exibeDados();*/
        professor.exibeDados();
        aluno.exibeDados();
    }
}