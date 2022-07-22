

public class FuncionarioCLT extends Funcionario{

protected double vlSalarioProdutividade;

public FuncionarioCLT(int matricula,String nome,String sgEstadoNascimento,String sgDepartamento,double vlSalarioBase,int qtFilhos){
  super(matricula,nome,sgEstadoNascimento,sgDepartamento,vlSalarioBase,qtFilhos);
  this.vlSalarioProdutividade=500;
  this.txINSS=20;
  
}
public double getVlSalarioProdutividade() {
	return vlSalarioProdutividade;
}

public void setVlSalarioProdutividade(double vlSalarioProdutividade) {
	this.vlSalarioProdutividade = vlSalarioProdutividade;
}
  public void calculaSalario(){
    this.vlSalarioLiquido = this.vlSalarioBase-(this.vlSalarioBase*this.txINSS/100)+(qtFilhos*100) + this.vlSalarioProdutividade; 
  }

  public void calculaAumentoSalarial(int matricula,double percentual){
    this.vlSalarioBase = this.vlSalarioBase*(1+percentual/100);
  }
  public void calculaAumentoSalarial(double valorDeAumento,int matricula){
    this.vlSalarioBase = this.vlSalarioBase+valorDeAumento;
  }

@Override
public String toString() {
	return "FuncionarioCLT [matricula=" + matricula + ", nome=" + nome + ", sgEstadoNascimento=" + sgEstadoNascimento
			+ ", sgDepartamento=" + sgDepartamento + ", vlSalarioBase=" + vlSalarioBase + "FuncionarioCLT vlSalarioProdutividade=" + vlSalarioProdutividade + ", qtFilhos=" + qtFilhos
			+ "]";
}





  
  
}