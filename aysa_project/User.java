package aysa_project;

import java.util.ArrayList;
import java.util.List;

public class User{
    private String name;
    private String dob;
    private int age;
    private String username;
    private String password;
    private List<Contact> contacts;

    public User(String name, int age, String dob, String username, String password){
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.username = username;
        this.password = password;
        this.contacts = new ArrayList<Contact>();
    }

    public void addContact(String name, String email, String phone){
        Contact contact = new Contact(name, email, phone);
        contacts.add(contact);
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
    
    public String getDOB() {
        return dob;
    }
    
    public void setDOB(String dob) {
        this.dob = dob;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsersame(){
        return username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public String getUserInformation(String username, String password){
        if(this.username.equals(username) && this.password.equals(password))
            return this.name + ", " + this.age + ", " + this.dob;
        else
            return "Invalid username or password, please try again.";
    }

    public List<Contact> getContacts(String username, String password){
        if(this.username.equals(username) && this.password.equals(password))
            return this.contacts;
        else
            return null;
    }
}