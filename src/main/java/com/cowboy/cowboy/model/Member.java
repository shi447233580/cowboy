package com.cowboy.cowboy.model;

public class Member {
    private Integer id;

    private String name;

    private String description;

    private Integer age;

    private String hobby;

    private String heightWeight;

    private String face;

    private String style;

    private String character;

    private String tobaccoAlcohol;

    private String food;

    private String similarArtists;

    private String skill;

    private String selfIntroduction;

    private String storeReviews;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getHeightWeight() {
        return heightWeight;
    }

    public void setHeightWeight(String heightWeight) {
        this.heightWeight = heightWeight == null ? null : heightWeight.trim();
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face == null ? null : face.trim();
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character == null ? null : character.trim();
    }

    public String getTobaccoAlcohol() {
        return tobaccoAlcohol;
    }

    public void setTobaccoAlcohol(String tobaccoAlcohol) {
        this.tobaccoAlcohol = tobaccoAlcohol == null ? null : tobaccoAlcohol.trim();
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food == null ? null : food.trim();
    }

    public String getSimilarArtists() {
        return similarArtists;
    }

    public void setSimilarArtists(String similarArtists) {
        this.similarArtists = similarArtists == null ? null : similarArtists.trim();
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill == null ? null : skill.trim();
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction == null ? null : selfIntroduction.trim();
    }

    public String getStoreReviews() {
        return storeReviews;
    }

    public void setStoreReviews(String storeReviews) {
        this.storeReviews = storeReviews == null ? null : storeReviews.trim();
    }
}