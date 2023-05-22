public class Main {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        
        Disciplina d1 = new Disciplina();
        Disciplina d2 = new Disciplina();
        
        a1.setNome("Aluno 1");
        a1.setMatricula("220033");
        a2.setNome("Aluno 2");
        a2.setMatricula("112233");
        
        d1.setNome("Química");
        d1.setCodigo("123123");
        d2.setNome("História");
        d2.setCodigo("223311");
        
        a1.addDisciplina(d1);
        a2.addDisciplina(d1);
        a2.addDisciplina(d2);
        
        
    }
    
}
