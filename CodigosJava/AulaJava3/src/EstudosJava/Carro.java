package EstudosJava;

public class Carro {
	private String modelo;
	private int ano;
	private double quilometragem;
	
	public String getModelo(String modelo){
		return modelo;
	}

	public void setModelo(String modelo) {
		
		this.modelo=modelo;
	}
	public int getAno() {
		return ano;
		
		}
	public void setAno(int ano) {
		this.ano=ano;
		
	}
	public double getquilometragem() {
		return quilometragem;
					
	}
	public void setquilometragem( double quilometragem) {
		this.quilometragem=quilometragem;
		
	}
	public void viagem (double distancia) {
		if (distancia>=0) {
			this.quilometragem+= distancia;
		}else {
			System.out.println("distancia invalida");
		}
	}
	}
	
	
	
	
	