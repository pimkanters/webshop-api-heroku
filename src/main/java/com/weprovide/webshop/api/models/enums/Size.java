package com.weprovide.webshop.api.models.enums;

public enum Size {
    XS("KIDS"),
    S("30-35"),
    M("36-40"),
    L("41-46"),
    XL("47-51");

    private final String text;

    Size(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}