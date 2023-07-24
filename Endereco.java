//Nome: Rythielly Francisco Garcia Bezerra, RA: 2454459
public class Endereco{
	
	private String cidade;
	private String estado;
	private String bairro;
	private String rua;
	private int num;

	public Endereco(){
		cidade = "";
		estado = "";
		bairro = "";
		rua = "";
		num = 0;
	}

	public String getCidade(){
		return cidade;
	}

	public String getEstado(){
		return estado;
	}

	public String getBairro(){
		return bairro;
	}

	public String getRua(){
		return rua;
	}

	public int getNum(){
		return num;
	}

	public void setCidade(String cidade){
		this.cidade = cidade;
	}

	public void setEstado(String estado){
		this.estado = estado;
	}

	public void setBairro(String bairro){
		this.bairro = bairro;
	}

	public void setRua(String rua){
		this.rua = rua;
	}

	public void setNum(int num){
		this.num = num;
	}

}


