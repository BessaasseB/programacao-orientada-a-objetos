import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private List<Disciplina> disciplinas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

   public void setDisciplinas(){
       disciplinas = new ArrayList<>();
   }
    
   public void addDisciplina(Disciplina disciplina){
       disciplinas.add(disciplina);
       disciplina.addAluno(this);
   }
   
   public String getDisciplina(){
        return "Disciplina: " + this.nome;
   }
    
}
