import java.util.ArrayList;
import java.util.List;

class Disciplina {
    private String nome;
    private String codigo;
    private List<Aluno> alunos;
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setAlunos(){
        alunos = new ArrayList<>();
    }

    void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }
}
