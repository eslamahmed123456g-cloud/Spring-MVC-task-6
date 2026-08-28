package main.com.myApp.model;

import javax.validation.constraints.*;

public class UserData {

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
   private String firstName ;
    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String lastName ;
    @Min(value = 18 ,message = "this app for Adults")
    @Max(value = 60,message = "the maximun age is 60.")
    private Integer age;
    @Pattern(regexp = "^(.+)@(\\S+)$",message = "please enter a valid email address")
    private String email;
    @VaildEgyptionNumber(message = "please enter a vaild Egyption phone number")
    private String phone;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
