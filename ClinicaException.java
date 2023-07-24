//Rythielly Francisco Garcia Bezerra, RA: 2454459
import javax.swing.JOptionPane;

public class ClinicaException extends Exception {
	
	//Polimorfismo por sobrecarga
	public Medico corrigeSal(Medico m1){
		try{
			m1.setSal(Integer.parseInt(JOptionPane.showInputDialog(null,"SALÁRIO INVÁLIDO (ACIMA DO PERMITIDO), INSIRÁ NOVAMENTE","ERRO SALÁRIO",1)));
		}
		catch(ClinicaException maxsal){
			m1 = maxsal.corrigeSal(m1);
		}
		return m1;
	}
	//Polimorfismo por sobrecarga
	public Enfermeiro corrigeSal(Enfermeiro e1){
		try{
			e1.setSal(Integer.parseInt(JOptionPane.showInputDialog(null,"SALÁRIO INVÁLIDO (ACIMA DO PERMITIDO), INSIRÁ NOVAMENTE","ERRO SALÁRIO",1)));
		}
		catch(ClinicaException maxsal){
			e1 = maxsal.corrigeSal(e1);
		}
		return e1;
	}


	//Polimorfismo por sobrecarga
	public Paciente corrigeCpf(Paciente p1){
		try{
			p1.setCpf(JOptionPane.showInputDialog(null,"CPF DO PACIENTE INVÁLIDO, INSIRÁ NOVAMENTE","ERRO CPF",1));
		}
		catch(ClinicaException clie){
			p1 = clie.corrigeCpf(p1);
		}
		return p1;
	}
	//Polimorfismo por sobrecarga
	public Medico corrigeCpf(Medico m1){
		try{
			m1.setCpf(JOptionPane.showInputDialog(null,"CPF DO MÉDICO INVÁLIDO, INSIRÁ NOVAMENTE","ERRO CPF",1));
		}
		catch(ClinicaException clie){
			m1 = clie.corrigeCpf(m1);
		}

		return m1;
	}
	//Polimorfismo por sobrecarga
	public Enfermeiro corrigeCpf(Enfermeiro e1){
		try{
			e1.setCpf(JOptionPane.showInputDialog(null,"CPF DO ENFERMEIRO INVÁLIDO, INSIRÁ NOVAMENTE","ERRO CPF",1));
		}
		catch(ClinicaException clie){
			e1 = clie.corrigeCpf(e1);
		}
		return e1;
	}
	
	public Consulta corrigeCpfm(Consulta c1){
		try{
			c1.setCpfm(JOptionPane.showInputDialog(null,"CPF DO MÉDICO INVÁLIDO, INSIRÁ NOVAMENTE","ERRO CPF",1));
		}
		catch(ClinicaException clie){
			c1 = clie.corrigeCpfm(c1);
		}
		return c1;
	}
        
        public Consulta corrigeCpfe(Consulta c1){
		try{
			c1.setCpfe(JOptionPane.showInputDialog(null,"CPF DO ENFERMEIRO INVÁLIDO, INSIRÁ NOVAMENTE","ERRO CPF",1));
		}
		catch(ClinicaException clie){
			c1 = clie.corrigeCpfe(c1);
		}
		return c1;
	}
        
        public Consulta corrigeCpfp(Consulta c1){
		try{
			c1.setCpfp(JOptionPane.showInputDialog(null,"CPF DO PACIENTE INVÁLIDO, INSIRÁ NOVAMENTE","ERRO CPF",1));
		}
		catch(ClinicaException clie){
			c1 = clie.corrigeCpfp(c1);
		}
		return c1;
	}
        

	
}
