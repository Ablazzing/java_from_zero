package oop.enumeration;

public class CountryOld {
    private String name;
    private long peopleCount;
    private String language;
    public static final CountryOld ARGENTINA = new CountryOld("Аргентина", 47_000_00l, "испанский");

    public CountryOld(String name, long peopleCount, String language) {
        this.name = name;
        this.peopleCount = peopleCount;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public long getPeopleCount() {
        return peopleCount;
    }

    public String getLanguage() {
        return language;
    }
}
