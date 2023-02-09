package oving2.Person;
import java.util.Date;
import java.text.*;
import java.util.Calendar;


/*
 * DEL 1
 */
public class Person {
    private String name;
    private String email;
    private Date birth;
    private char gender;


    public void setName(String name){
        String[] splitName = name.split(" ", 2);
        if (splitName.length > 1) {
            this.name = name;
        } else {throw new IllegalArgumentException("Invalid name -> Must have first and lastname");}

    };

    public void setEmail(String email) {
        String[] splitEmail = email.split("[.]",2);
        if (email.contains("@") && email.contains(".") && splitEmail[1].length() > 1) {
            this.email = email;
        } else {throw new IllegalArgumentException("Invalid email!");}
    };

    
    public void setGender(char gender) {
        gender = Character.toUpperCase(gender);
        if (gender == 'M' || gender == 'F' || gender == '\0') {
            this.gender = gender;
        } else {throw new IllegalArgumentException("Invalid gender!");}
    };


    // https://www.tutorialspoint.com/how-to-compare-two-dates-in-java
        public void setBirthday(String bdayString) {
            SimpleDateFormat sdformat = new SimpleDateFormat("dd-MM-yyyy");
            sdformat.setLenient(false);
            
            Date today = new Date();
            
            try{
                Date bday = sdformat.parse(bdayString);
                if (today.after(bday)) {
                    this.birth = bday;
                    // System.out.println("ok man go ahead");
            } else {
                System.out.println("Invalid birthday! You cannot be born in the future!");}
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid date! (use dd-MM-yyyy)");
            }        
        };

        public String getString() {
            return "Name: " + this.name + "\nEmail: " + this.email + "\nBirthday: " + this.birth + "\nGender: " +this.gender; 
    }
    public static void main(String[] args) {
        Person me = new Person();
        me.setBirthday("11-09-2000");
        me.setGender('m');
        me.setName("jp dragic");
        me.setEmail("helloworld@ntnu.no");

        // Print getString:
        System.out.println(me.getString());
}}




/*
 * __ DEL 2 __
 * 
 * Foreslå en alternativ innkapsling av navnet. Hint: del opp.
 * - Man kan dele navn opp i feks firstName og lastName.
 * 
 * Foreslå to alternative strategier for å kapsle inn tilstand som er koblet slik navn og e-post 
 * - Hva?? 
 */