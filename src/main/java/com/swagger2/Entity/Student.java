package com.swagger2.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@ApiModel(description = "All details about the Student. ")
public class Student {
    @Id
    @ApiModelProperty(notes = "Student unique ID")
    private int id;
    @ApiModelProperty(notes = "Student name")
    private String name;
    @ApiModelProperty(notes = "Student Email")
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
