//Nome: Rythielly Francisco Garcia Bezerra, RA: 2454459
public class Pessoa{

	private String cpf;
	private String nome;
	private String email;
	private String sexo;
        private int idade;
	private Endereco ender = new Endereco();
	
	public Pessoa(){
		cpf = "";
		nome = "";
		email = "";
		sexo = "";
                idade = 0;
	}
        
        public int getIdade(){
		return idade;
	}
        
	public Endereco getEnder(){
		return ender;
	}

	public void setEnder(Endereco ender){
		this.ender  = ender;
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


