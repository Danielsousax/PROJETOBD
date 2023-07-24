//Nome: Rythielly Francisco Garcia Bezerra, RA: 2454459
public class Funcionario extends Pessoa{
	private int sal;
	private boolean especializacao;
        private String regime;
        private float avaliacao;
	
	public Funcionario() {
		sal = 0;
		especializacao = false;
                regime = "";
                avaliacao = 0;
	}

	public int getSal(){
		return sal;
	}
        
        public String getRegime(){
		return regime;
	}
        
        public float getAvaliacao(){
		return avaliacao;
	}
	
	public boolean getEspecializacao(){
		return especializacao;
	}
	
	public void setSal(int sal) throws ClinicaException{
		if(sal > 20000){
			throw new ClinicaException();
		}else{
			this.sal = sal;
		}
		
	}
		
	

	public void setEspecializacao(boolean especializacao){
		this.especializacao = especializacao;
	}
        
        public void setRegime(String regime){
		this.regime = regime;
	}
        
        public void setAvaliacao(float avaliacao){
		this.avaliacao = avaliacao;
	}
	

}


