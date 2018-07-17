package package1;

public enum Civilite {
	
	MADAME, MONSIEUR;
	
	@Override
	public String toString() {
		return this == MADAME ? "Madame" : "Monsieur";
	}

}
