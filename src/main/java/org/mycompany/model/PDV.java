package org.mycompany.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

public class PDV {

	private long id;
	private long latitude;
	private long longitude;
	private String cp;
	private String pop;
	private Adresse adresse;
	private Ville ville;
	private Horaires horaires;
	private Services services;
	private Rupture rupture;
	private List<Prix> prix;
	private Fermeture fermeture;

	@Override
	public String toString() {
		return "PDV [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", cp=" + cp + ", pop=" + pop
				+ ", adresse=" + adresse + ", ville=" + ville + ", horaires=" + horaires + ", services=" + services
				+ ", rupture=" + rupture + ", prix=" + prix + ", fermeture=" + fermeture + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getLatitude() {
		return latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getPop() {
		return pop;
	}

	public void setPop(String pop) {
		this.pop = pop;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public Horaires getHoraires() {
		return horaires;
	}

	public void setHoraires(Horaires horaires) {
		this.horaires = horaires;
	}

	public Services getServices() {
		return services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

	public Rupture getRupture() {
		return rupture;
	}

	public void setRupture(Rupture rupture) {
		this.rupture = rupture;
	}

	public List<Prix> getPrix() {
		return prix;
	}

	public void setPrix(List<Prix> prix) {
		this.prix = prix;
	}

	public Fermeture getFermeture() {
		return fermeture;
	}

	public void setFermeture(Fermeture fermeture) {
		this.fermeture = fermeture;
	}

}
