public class RelMedicos {
    private String cpf;
    private int crm;
    private String crmEstado;
    private String nome;
    private String email;
    private String sexo;
    private int idade;
	
	public RelMedicos() {
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
        
        public int getIdade(){
		return idade;
	}
        
	public String getCpf(){
		return cpf;
	}

	public String getNome(){
		return nome;
	}

	public String getEmail(){
		return email;
	}

	public String getSexo(){
		return sexo;
	}
        
        public void setIdade(int idade){
		this.idade = idade;
	}
            
	public void setCpf(String cpf) throws ClinicaException{
		if(cpf.length()  != 11){
			throw new ClinicaException();
		}
		this.cpf = cpf;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setSexo(String sexo){
		this.sexo = sexo;
	}
}
