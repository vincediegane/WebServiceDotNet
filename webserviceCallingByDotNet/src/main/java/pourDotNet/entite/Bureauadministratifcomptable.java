package pourDotNet.entite;
// Generated 2 avr. 2018 22:14:16 by Hibernate Tools 4.3.1.Final

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

/**
 * Bureauadministratifcomptable generated by hbm2java
 */
@Entity
@Table(name = "bureauadministratifcomptable")
public class Bureauadministratifcomptable implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numbac;
	private Crb crb;
	private String libelle;
	private String adresse;
	private Set<Bureauutilisateur> bureauutilisateurs = new HashSet<Bureauutilisateur>(0);
	private Set<Demandedeconsommation> demandedeconsommations = new HashSet<Demandedeconsommation>(0);

	public Bureauadministratifcomptable() {
	}

	public Bureauadministratifcomptable(String numbac, Crb crb) {
		this.numbac = numbac;
		this.crb = crb;
	}

	public Bureauadministratifcomptable(String numbac, Crb crb, String libelle, String adresse,
			Set<Bureauutilisateur> bureauutilisateurs, Set<Demandedeconsommation> demandedeconsommations) {
		this.numbac = numbac;
		this.crb = crb;
		this.libelle = libelle;
		this.adresse = adresse;
		this.bureauutilisateurs = bureauutilisateurs;
		this.demandedeconsommations = demandedeconsommations;
	}

	@Id

	@Column(name = "numbac", unique = true, nullable = false, length = 254)
	public String getNumbac() {
		return this.numbac;
	}

	public void setNumbac(String numbac) {
		this.numbac = numbac;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numcrb", nullable = false)
	public Crb getCrb() {
		return this.crb;
	}

	public void setCrb(Crb crb) {
		this.crb = crb;
	}

	@Column(name = "libelle", length = 254)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Column(name = "adresse", length = 254)
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bureauadministratifcomptable")
	public Set<Bureauutilisateur> getBureauutilisateurs() {
		return this.bureauutilisateurs;
	}

	public void setBureauutilisateurs(Set<Bureauutilisateur> bureauutilisateurs) {
		this.bureauutilisateurs = bureauutilisateurs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bureauadministratifcomptable")
	public Set<Demandedeconsommation> getDemandedeconsommations() {
		return this.demandedeconsommations;
	}

	public void setDemandedeconsommations(Set<Demandedeconsommation> demandedeconsommations) {
		this.demandedeconsommations = demandedeconsommations;
	}

}
