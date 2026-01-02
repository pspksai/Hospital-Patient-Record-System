package com.hospital;

public class Patient {

    private int patientId;
    private String name;
    private int age;
    private String gender;
    private String bloodGroup;
    private String ailment;

    public Patient( String name, int age, String gender, String bloodGroup, String ailment) {
       
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.ailment = ailment;
    }

    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getAilment() {
        return ailment;
    }


//===== Setters (for Update Patient Info) =====

public void setName(String name) {
 this.name = name;
}

public void setAge(int age) {
 this.age = age;
}

public void setGender(String gender) {
 this.gender = gender;
}

public void setBloodGroup(String bloodGroup) {
 this.bloodGroup = bloodGroup;
}

public void setAilment(String ailment) {
 this.ailment = ailment;
}
