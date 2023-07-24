public class Medico extends Funcionario {
	private int crm;
	private String crmEstado;
	
	public Medico() {
		int crm = 0;
		String crmEstado = "";
	}

	public int getCrm(){
		return crm;
	}

	public String getCrmEstado(){
		return crmEstado;
	}

	public void setCrm(int crm){
		this.crm = crm;
	}

	public void setCrmEstado(String crmEstado){
		this.crmEstado = crmEstado;
	}
	

}

