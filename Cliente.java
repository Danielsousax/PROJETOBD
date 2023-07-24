//Nome: Rythielly Francisco Garcia Bezerra, RA: 2454459
public abstract class Cliente extends Pessoa{	

	private boolean convenio;
	
	public Cliente(){
		convenio = false;
	}
	
	public boolean getConvenio(){
		return convenio;
	}
	


	public void setConvenio(boolean convenio){
		this.convenio = convenio;
	}

}


