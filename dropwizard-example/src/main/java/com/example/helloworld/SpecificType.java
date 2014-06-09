package com.example.helloworld;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("specificComplexType")
@JsonSubTypes.Type(value = SpecificType.class)
public class SpecificType implements ComplexType{

    private String setting1;
    private String setting2;

    @JsonProperty
    public String getSetting1() {
        return setting1;
    }

    @JsonProperty
    public void setSetting1(String setting1) {
        this.setting1 = setting1;
    }

    @JsonProperty
    public String getSetting2() {
        return setting2;
    }

    @JsonProperty
    public void setSetting2(String setting2) {
        this.setting2 = setting2;
    }
}
