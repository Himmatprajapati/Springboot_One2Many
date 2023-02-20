package com.example.demo.model;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class customer {	
	
	@Id
	@GeneratedValue
	
	private int id;
	private String name;
	private String email;

	@OneToMany(targetEntity = product.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cpm", referencedColumnName = "id")
	
	private List<product>products;
		
	
}
