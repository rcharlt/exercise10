package com.company;
import java.util.*;
//Rylee Charlton, 3/20/19, Exercise 10


//og class contact
class Contact{
    String name;
    String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void display(){
        System.out.println("Name: "+ name + ", Email: "+ email);
    }


}
//this is the collection class that is implementing from the contact class
class Collection implements Iterable<Contact>{
    List<Contact> contacts = new ArrayList<>();
    @Override
    public Iterator<Contact> iterator() {
        return this.contacts.iterator();
    }

    public void addContact(Contact con){
        contacts.add(con);
    }

    public void seeContact(){
        for(Contact contact: contacts) {
            contact.display();
        }
    }
}
class Main {

    public static void main(String[] args) {
	    Contact bob = new Contact("Bob", "bob@gmail.com");
	    Contact arthur = new Contact("Arthur ","aneuman1@cscc.edu");
        Collection collection = new Collection();
        collection.addContact(bob);// pushing bob into the addContact method
        collection.addContact(arthur);

        collection.seeContact();

    }
}
