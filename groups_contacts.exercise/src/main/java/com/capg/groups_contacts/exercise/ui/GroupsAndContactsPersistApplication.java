package com.capg.groups_contacts.exercise.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.capg.groups_contacts.exercise.models.Contact;
import com.capg.groups_contacts.exercise.models.Group;
import com.capg.groups_contacts.exercise.util.JPAUtil;


public class GroupsAndContactsPersistApplication {

	public static void main(String[] args) {
	    
		Group family  = new Group("FAMILY" ,"This group belongs to Family" ,new  TreeSet<Contact>());
		Group school  = new Group("SCHOOL" ,"This group belongs to School" ,new  TreeSet<Contact>());
		Group college = new Group("COLLEGE","This group belongs to College" ,new TreeSet<Contact>());
		
		
		family.getContact().add(new Contact("Manikanta  ","Nagireddy" ,9999999999L ,"nagireddymani080@gmail.com" 
				,"12/04/1998" ,"Flat NO : 416,Himagiri Saroja Hills Appartment"    ,"Hyderabad , Telangana",family));
		family.getContact().add(new Contact("Ashritha   ","xyz      " ,8888888889L ,"16211a0278@bvrit.ac.in   " 
				,"12/04/1998" ,"Flat NO : 417,Himagiri Saroja Hills Appartment"    ,"Hyderabad , Telangana",family));
		family.getContact().add(new Contact("Ushasri    ","abc      " ,7777777777L ,"16211a0279@bvrit.ac.in   "
				,"12/04/1998" ,"Flat NO : 418,Himagiri Saroja Hills Appartment"    ,"Hyderabad , Telangana",family));
		
		school.getContact().add(new Contact("Ravali     ","pqrstuvw " ,6666666666L ,"16211a0280@bvrit.ac.in   "
				,"12/04/1998" ,"Flat NO : 419,Himagiri Saroja Hills Appartment"    ,"Hyderabad , Telangana",school));
		school.getContact().add(new Contact("Reddy      ","Nagireddy" ,9555555555L ,"16211a0281@bvrit.ac.in   "
				,"12/04/1998" ,"Flat NO : 420, Himagiri Saroja Hills Appartment"   ,"Hyderabad , Telangana",school)); 
		school.getContact().add(new Contact("Manikanta  ","Nagireddy" ,9999999999L ,"nagireddymani080@gmail.com"
				,"12/04/1998" ,"Flat NO : 416,Himagiri Saroja Hills Appartment"    ,"Hyderabad , Telangana",school));
        
        college.getContact().add(new Contact("Ushasri   ","abcdefghi" ,7777777777L ,"16211a0279@bvrit.ac.in   "
        		,"12/04/1998" ,"Flat NO : 418, Himagiri Saroja Hills Appartment"   ,"Hyderabad , Telangana",college));
        college.getContact().add(new Contact("Manikanta" ,"Nagireddy" ,9999999999L ,"nagireddymani080@gmail.com"
        		,"12/04/1998" ,"Flat NO : 416,Himagiri Saroja Hills Appartment"    ,"Hyderabad , Telangana",college));
        
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(family);
		em.persist(college);
		em.persist(school);
		em.getTransaction().commit();
		System.out.println("All Files Saved");
		JPAUtil.shutdown();
	}
    
}
