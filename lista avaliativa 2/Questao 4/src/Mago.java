public class Mago extends Personagem{
    private double vida;
    private double mana;
    private int nivel;
    private double experiencia;
    private int numeroDeMagias;
    private String nome;

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    public int getNumeroDeMagias() {
        return numeroDeMagias;
    }

    public void setNumeroDeMagias(int numeroDeMagias) {
        this.numeroDeMagias = numeroDeMagias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void ganhaXp(double xp){
        this.experiencia += xp;
        
        if(this.experiencia >= 100){
            this.nivel++;
            System.out.println("Subiu de nivel!!\nNivel atual: " + this.nivel);
            this.experiencia = 0;
        }
    }
    
}
