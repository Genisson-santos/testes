
public abstract class Funcionario{

  protected int matricula;
  protected String nome;
  protected String sgEstadoNascimento;
  protected String sgDepartamento;
  protected double vlSalarioBase;
  protected double vlSalarioLiquido;
  protected double txINSS;
  protected int qtFilhos;

  public abstract void calculaSalario();

  public Funcionario(int matricula,String nome,String sgEstadoNascimento,String sgDepartamento,double vlSalarioBase,int qtFilhos){

    this.matricula=matricula;
    this.nome=nome;
    this.sgEstadoNascimento=sgEstadoNascimento;
    this.sgDepartamento=sgDepartamento;
    this.vlSalarioBase=vlSalarioBase;
    this.qtFilhos=qtFilhos;
    
    
  }

public int getMatricula(int matricula) {
	return matricula;
}

public void setMatricula(int matricula) {
	this.matricula = matricula;
}

public String getNome(String nome) {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getSgEstadoNascimento() {
	return sgEstadoNascimento;
}

public void setSgEstadoNascimento(String sgEstadoNascimento) {
	this.sgEstadoNascimento = sgEstadoNascimento;
}

public String getSgDepartamento() {
	return sgDepartamento;
}

public void setSgDepartamento(String sgDepartamento) {
	this.sgDepartamento = sgDepartamento;
}

public double getVlSalarioBase() {
	return vlSalarioBase;
}

public void setVlSalarioBase(double vlSalarioBase) {
	this.vlSalarioBase = vlSalarioBase;
}

public double getVlSalarioLiquido() {
	return vlSalarioLiquido;
}

public void setVlSalarioLiquido(double vlSalarioLiquido) {
	this.vlSalarioLiquido = vlSalarioLiquido;
}

public int getQtFilhos() {
	return qtFilhos;
}

public void setQtFilhos(int qtFilhos) {
	this.qtFilhos = qtFilhos;
}




  
}