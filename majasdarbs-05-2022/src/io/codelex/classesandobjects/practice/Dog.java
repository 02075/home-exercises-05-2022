package io.codelex.classesandobjects.practice;

import java.util.Objects;

public class Dog {
    String name;
    String gender;
    String father = "unknown";
    String mother = "unknown";
    public Dog(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
    public boolean sameMother(Dog dog){
        if (Objects.equals(this.mother, dog.mother)){
            return true;
        } else {
            return false;
        }
    }
    public void setMotherNFather(Dog dgm, Dog dgf){
        this.mother = dgm.name;
        this.father = dgf.name;
    }
    public String parentsName(){
        return this.mother + " " + this.father;
    }

    public String tooString(){
        return this.name + ": " + this.gender + ", Mother: " + this.mother + ", father: " + this.father;
    }
}
