package pourDotNet.entite;
// Generated 2 avr. 2018 22:14:16 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "article")
public class Article implements java.io.Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String numart;
	private Comptebudgetaire comptebudgetaire;
	private Lignedeconsommation lignedeconsommation;
	private String description;
	private BigDecimal prixunitaire;
	private Integer quantitestock;
	private Set<Lignedeconsommation> lignedeconsommations = new HashSet<Lignedeconsommation>(0);

	public Article() {
	}

	public Article(String numart, Comptebudgetaire comptebudgetaire) {
		this.numart = numart;
		this.comptebudgetaire = comptebudgetaire;
	}

	public Article(String numart, Comptebudgetaire comptebudgetaire, Lignedeconsommation lignedeconsommation,
			String description, BigDecimal prixunitaire, Integer quantitestock,
			Set<Lignedeconsommation> lignedeconsommations) {
		this.numart = numart;
		this.comptebudgetaire = comptebudgetaire;
		this.lignedeconsommation = lignedeconsommation;
		this.description = description;
		this.prixunitaire = prixunitaire;
		this.quantitestock = quantitestock;
		this.lignedeconsommations = lignedeconsommations;
	}

	@Id

	@Column(name = "numart", unique = true, nullable = false, length = 254)
	public String getNumart() {
		return this.numart;
	}

	public void setNumart(String numart) {
		this.numart = numart;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numcb", nullable = false)
	public Comptebudgetaire getComptebudgetaire() {
		return this.comptebudgetaire;
	}

	public void setComptebudgetaire(Comptebudgetaire comptebudgetaire) {
		this.comptebudgetaire = comptebudgetaire;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numlc")
	public Lignedeconsommation getLignedeconsommation() {
		return this.lignedeconsommation;
	}

	public void setLignedeconsommation(Lignedeconsommation lignedeconsommation) {
		this.lignedeconsommation = lignedeconsommation;
	}

	@Column(name = "description", length = 254)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "prixunitaire", precision = 131089, scale = 0)
	public BigDecimal getPrixunitaire() {
		return this.prixunitaire;
	}

	public void setPrixunitaire(BigDecimal prixunitaire) {
		this.prixunitaire = prixunitaire;
	}

	@Column(name = "quantitestock")
	public Integer getQuantitestock() {
		return this.quantitestock;
	}

	public void setQuantitestock(Integer quantitestock) {
		this.quantitestock = quantitestock;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "article")
	public Set<Lignedeconsommation> getLignedeconsommations() {
		return this.lignedeconsommations;
	}

	public void setLignedeconsommations(Set<Lignedeconsommation> lignedeconsommations) {
		this.lignedeconsommations = lignedeconsommations;
	}

}
