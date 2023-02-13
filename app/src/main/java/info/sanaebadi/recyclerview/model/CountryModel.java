package info.sanaebadi.recyclerview.model;

public class CountryModel {
    private String imageUrl;
    private String countryName;

    public CountryModel() {
    }

    public CountryModel(String imageUrl, String countryName) {
        this.imageUrl = imageUrl;
        this.countryName = countryName;
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
}
