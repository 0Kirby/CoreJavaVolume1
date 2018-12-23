package cp5;

public enum Size {
	SMALL("S"), MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
	
	private String abbreviation;

	private Size (String abbreviation)
	{
		this.setAbbreviation(abbreviation);
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	
	
}