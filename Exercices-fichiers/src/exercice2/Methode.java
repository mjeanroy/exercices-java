package exercice2;

public class Methode {
	private String metPackage;
	private String metClass;
	private String metMethode;
	
	public Methode(String metPackage, String metClass, String metMethode) {
		this.metPackage = metPackage;
		this.metClass = metClass;
		this.metMethode = metMethode;
	}

	public String getMetPackage() {
		return metPackage;
	}

	public void setMetPackage(String metPackage) {
		this.metPackage = metPackage;
	}

	public String getMetClass() {
		return metClass;
	}

	public void setMetClass(String metClass) {
		this.metClass = metClass;
	}

	public String getMetMethode() {
		return metMethode;
	}

	public void setMetMethode(String metMethode) {
		this.metMethode = metMethode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((metMethode == null) ? 0 : metMethode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Methode other = (Methode) obj;
		if (metMethode == null) {
			if (other.metMethode != null)
				return false;
		} else if (!metMethode.equals(other.metMethode))
			return false;
		return true;
	}
	
	
	
	
}
