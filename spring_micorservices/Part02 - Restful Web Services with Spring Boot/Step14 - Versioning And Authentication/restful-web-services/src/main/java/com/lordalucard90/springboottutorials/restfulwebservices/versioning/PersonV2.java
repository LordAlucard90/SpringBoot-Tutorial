package com.lordalucard90.springboottutorials.restfulwebservices.versioning;

public class PersonV2 {
    private Name name;

    protected PersonV2() {}

    public PersonV2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
