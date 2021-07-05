package modelo.watsonExample;

public class Traductor {
	
	public Traductor(){	}
	
	private String idiomaOrigen	;
	private String idiomaDestino;
	
	private String textoOriginal;

	public String getIdiomaOrigen() {
		return idiomaOrigen;
	}

	public void setIdiomaOrigen(String idiomaOrigen) {
		this.idiomaOrigen = idiomaOrigen;
	}

	public String getIdiomaDestino() {
		return idiomaDestino;
	}

	public void setIdiomaDestino(String idiomaDestino) {
		this.idiomaDestino = idiomaDestino;
	}

	public String getTextoOriginal() {
		return textoOriginal;
	}

	public void setTextoOriginal(String textoOriginal) {
		this.textoOriginal = textoOriginal;
	}
	
	
	public String getTextoTraducido(){
		//TODO Fer aca va la magia
		
		return null;
	}

}
