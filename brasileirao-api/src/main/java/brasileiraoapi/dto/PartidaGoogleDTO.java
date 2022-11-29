package brasileiraoapi.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class PartidaGoogleDTO implements Serializable {
		
	private static final long serialVersionUID =1L;
	
	private String statusPatida;
	private String tempoPartida;
	// info da equipe da casa
	private String nomeEquipeCasa;
	private String urlLogoEquipeCasa;
	private Integer placarEquipeCasa;
	private String golsEquipeCasa;
	private String placarEstendidoEquipeCasa;
	// info da equipe visitante
	private String nomeEquipeVisitante;
	private String urlLogoVisitante;
	private Integer placarEquipeVisitante;
	private String golsEquipeVisitante;
	private String placarEstendidoEquipeVisitante;
	

}
