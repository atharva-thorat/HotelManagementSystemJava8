package enums;

public enum COUNTRY {
    USA("English"), SPAIN("Spanish"), GERMANY("German"), FRANCE("French"), CHINA("Chinese");

    String language;

    COUNTRY(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }
}
