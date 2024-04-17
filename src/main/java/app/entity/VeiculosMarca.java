package app.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class VeiculosMarca {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMarca;
	
	@NotBlank
	private String marca;
	
	@OneToMany (mappedBy = "veiculosmarca")
	@JsonIgnoreProperties("veiculosmarca")
	private List <AnuncioVeiculo> anuncioveiculo;
}
