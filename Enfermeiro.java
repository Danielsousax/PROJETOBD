public class Enfermeiro extends Funcionario {
	private int coren;
	private String corenEstado;

	public Enfermeiro(){
		int coren = 0;
		String corenEstado = "";
	}

	public int getCoren(){
		return coren;
	}

	public String getCorenEstado(){
		return corenEstado;
	}

	public void setCoren(int coren){
		this.coren = coren;
	}

	public void setCorenEstado(String corenEstado){
		this.corenEstado = corenEstado;
	}

	
}

