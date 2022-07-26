
public class FuncionarioTemp extends Funcionario{

  protected String tempoContrato;

  public FuncionarioTemp(int matricula,String nome,String sgEstadoNascimento,String sgDepartamento,double vlSalarioBase,int qtFilhos){
  super(matricula,nome,sgEstadoNascimento,sgDepartamento,vlSalarioBase,qtFilhos);
    this.tempoContrato="12 meses";
    this.txINSS=10;
  }
  
  public String getTempoContrato() {
	return tempoContrato;
}

public void setTempoContrato(String tempoContrato) {
	this.tempoContrato = tempoContrato;
}

public void calculaSalario(){
    this.vlSalarioLiquido=this.vlSalarioBase-(this.vlSalarioBase*this.txINSS/100)+(qtFilhos*100); 
  }
@Override
public String toString() {
	return "FuncionarioTemp [matricula=" + matricula + ", nome=" + nome + ", sgEstadoNascimento=" + sgEstadoNascimento
			+ "FuncionarioTemp tempoContrato=" + tempoContrato +", sgDepartamento=" + sgDepartamento + ", vlSalarioBase=" + vlSalarioBase + ", qtFilhos=" + qtFilhos
			+ "]";
}

  
}