public class Funcionario{
    private String nome;
    private String matricula;
    private double salario;
    private int admissao;
    private int HoraTrabalhadaNoite;
    
    public double salarioHora(){
        return this.salario/25/8;
    }
    public int hoje(){
        return 2021;
    }
    public double horaNoturna(){
        return salarioHora() * 0.5;
    }
    public void setHoraTrabalhadaNoite(int HoraNoite){
        this.HoraTrabalhadaNoite = HoraNoite;
    }
    public int horasTrabalhadasNoite(){
        return this.HoraTrabalhadaNoite;
    }
    public double salarioNoturno(){
        return horaNoturna() * horasTrabalhadasNoite();
    }
    public double tempoCasa(){
        return hoje() - this.admissao;
    }
    public void setAdmissao(int ano){
        this.admissao = ano;
    }
    public double getBonificacao(){
        return this.salario * (tempoCasa()/100);
    }
    public double getSalarioTotal(){
        return this.salario + getBonificacao();
    }
    public double getSalarioTotalNoite(){
        return this.salario + getBonificacao() + salarioNoturno();
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public double getSalario(){
        return this.salario;
    }
    public String getNome(){
        return this.nome;
    }
    public String getMatricula(){
        return this.matricula;
    }
    
    
}