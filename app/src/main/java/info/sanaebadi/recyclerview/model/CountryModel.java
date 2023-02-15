package info.sanaebadi.recyclerview.model;

public class CountryModel {
    private String imageUrl;
    private String countryName;
    private String countryLanguage;
    private String countryPopulation;
    private String countryCurrency;


    public CountryModel(String imageUrl, String countryName, String countryLanguage, String countryPopulation, String countryCurrency) {
        this.imageUrl = imageUrl;
        this.countryName = countryName;
        this.countryLanguage = countryLanguage;
        this.countryPopulation = countryPopulation;
        this.countryCurrency = countryCurrency;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryLanguage() {
        return countryLanguage;
    }

    public void setCountryLanguage(String countryLanguage) {
        this.countryLanguage = countryLanguage;
    }

    public String getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(String countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public String getCountryCurrency() {
        return countryCurrency;
    }

    public void setCountryCurrency(String countryCurrency) {
        this.countryCurrency = countryCurrency;
    }
}
