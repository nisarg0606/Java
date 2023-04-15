package assign1;

import java.io.Serializable;

public class Aircraft implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int year;
    private String country;

    public Aircraft(String name, int year, String country) {
        this.name = name;
        this.year = year;
        this.country = country;
    }

    public Aircraft(String[] info) {
        name = info[0];
        year = Integer.parseInt(info[1]);
        country = info[2];
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }
}
