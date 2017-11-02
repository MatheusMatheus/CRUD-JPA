package br.com.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "pertence_a_classe")
public abstract class EntidadeAutent {
	@Id
	@GeneratedValue
	protected long id;
	abstract long getId();
	
}
