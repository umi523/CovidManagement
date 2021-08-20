package com.example.covidmanagement.Victim;

import java.util.Date;

public class Victim {
    private long id;
    private String name;
    private int age;
    private String identity;
    private String country;
    private String state;
    private String city;
    private String continent;
    private String gender;
    private String covidVariant;
    private String description;
    private Date positiveDate;
    private Date negativeDate;
    private boolean isAlive;
    private boolean hasRecovered;

    public Victim(){

    }

    public Victim(String name, int age, String identity, String country, String state, String city, String continent, String gender, String covidVariant, String description, Date positiveDate, Date negativeDate, boolean isAlive, boolean hasRecovered) {
        this.name = name;
        this.age = age;
        this.identity = identity;
        this.country = country;
        this.state = state;
        this.city = city;
        this.continent = continent;
        this.gender = gender;
        this.covidVariant = covidVariant;
        this.description = description;
        this.positiveDate = positiveDate;
        this.negativeDate = negativeDate;
        this.isAlive = isAlive;
        this.hasRecovered = hasRecovered;
    }

    @Override
    public String toString() {
        return "Victim{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", identity='" + identity + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", continent='" + continent + '\'' +
                ", gender='" + gender + '\'' +
                ", covidVariant='" + covidVariant + '\'' +
                ", description='" + description + '\'' +
                ", positiveDate=" + positiveDate +
                ", negativeDate=" + negativeDate +
                ", isAlive=" + isAlive +
                ", hasRecovered=" + hasRecovered +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCovidVariant() {
        return covidVariant;
    }

    public void setCovidVariant(String covidVariant) {
        this.covidVariant = covidVariant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPositiveDate() {
        return positiveDate;
    }

    public void setPositiveDate(Date positiveDate) {
        this.positiveDate = positiveDate;
    }

    public Date getNegativeDate() {
        return negativeDate;
    }

    public void setNegativeDate(Date negativeDate) {
        this.negativeDate = negativeDate;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isHasRecovered() {
        return hasRecovered;
    }

    public void setHasRecovered(boolean hasRecovered) {
        this.hasRecovered = hasRecovered;
    }
}