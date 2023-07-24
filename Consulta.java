public class Consulta{
        private int codigocons;
	private String cpfm;
	private String cpfp;
	private String cpfe;
	private String horario;
	private String data;
	
	public Consulta(){
                codigocons = 0;
		cpfm = "";
		cpfp = "";
		cpfe = "";
		horario = "";
		data = "";
	}
        
        public int getCodigocons(){
		return codigocons;
	}
        
	public String getCpfm(){
		return cpfm;
	}

	public String getCpfe(){
		return cpfe;
	}

	public String getCpfp(){
		return cpfp;
	}

	public String getHorario(){
		return horario;
	}

	public String getData(){
		return data;
	}
        
        public void setCodigocons(int codigocons){
		this.codigocons = codigocons;
	}

	public void setCpfm(String cpfm) throws ClinicaException{
		if(cpfm.length()  != 11){
			throw new ClinicaException();
		}
		this.cpfm = cpfm;
		
	}

	public void setCpfe(String cpfe) throws ClinicaException{
		if(cpfe.length()  != 11){
			throw new ClinicaException();
		}
		this.cpfe = cpfe;
		
	}

	public void setCpfp(String cpfp) throws ClinicaException{
		if(cpfp.length()  != 11){
			throw new ClinicaException();
		}
		this.cpfp = cpfp;
		
	}

	public void setHorario(String horario){
		this.horario = horario;
	}

	public void setData(String data){
		this.data = data;
	}

}