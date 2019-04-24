package com.webservice.webservicedemo.controller;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONArray;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.webservice.webservicedemo.model.User;
import com.webservice.webservicedemo.model.attributes.Email;
import com.webservice.webservicedemo.model.attributes.Name;
import com.webservice.webservicedemo.service.UserService;
import com.webservice.webservicedemo.service.UserServiceImpl;

import processing.data.JSONObject;

import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Path("user")
public class UserController {
	
	String[] array = new String[10];
	 UserService userService = new UserServiceImpl();
	public UserController() {
	}
	
	ObjectMapper objectMapper = new ObjectMapper();
	
/*	public UserController(UserService userService) {
		this.userService=userService;
	}*/
	
	
	@POST
	public String add(String userjson) {
	
		User user = null;
		Name name = new Name();
		List<Email> emailList = new ArrayList<>();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		org.json.JSONObject jsonObject = new org.json.JSONObject(userjson);
		
		 try {
			 
			 Object jsonname = jsonObject.get("name");
			 
				org.json.JSONObject nameObject = new org.json.JSONObject(jsonname.toString());
				
				
				name.setFormatted(nameObject.getString("formatted"));
				name.setFamilyName(nameObject.getString("familyName"));
				name.setGivenName(nameObject.getString("givenName"));
				name.setMiddleName(nameObject.getString("middleName"));
				name.setHonorificPrefix(nameObject.getString("honorificPrefix"));
				name.setHonorificSuffix(nameObject.getString("honorificSuffix"));
				
				Object jsonemails = jsonObject.get("emails");

				
				int id=0;
				JSONArray emailsObject = new JSONArray(jsonemails.toString());
				Object Emails[] = new Object[100];
			
				
				while(!emailsObject.isNull(id)) {
				Emails[id] = new Object();
				
				Emails[id]=emailsObject.get(id);
				id++;
				
				}
				
				for(int i=0;i<id;i++) {
					
					Email email = new Email();
					org.json.JSONObject emailObject = new org.json.JSONObject(Emails[i].toString());
					email.setType(emailObject.getString("type"));
					email.setValue(emailObject.getString("value"));
					
					emailList.add(email);
				}
				
				
				
			user = objectMapper.readValue(userjson, User.class);
			user.setName(name);
			user.setEmails(emailList);
			 
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		 System.out.println("User --->"+user);
		userService.createUser(user);
		return "User Added -->\n"+user.toString();
	}
	

	@GET
	@Path("/{id}")
	public String display(@PathParam("id")String id) {
		User user = userService.findUser(id);
		return user.toString();
	}
	
	@DELETE
	@Path("/{id}")
	public String deleteUser(@PathParam("id")String id) {
		userService.deleteUser(id);
		return "User"+id+" Deleted";
	}
	
	@PUT
	@Path("/{id}")
	public String updateUser(String userjson,@PathParam("id")String id) {
		
		User user = null;
	
	
		Name name = new Name();
		List<Email> emailList = new ArrayList<>();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		org.json.JSONObject jsonObject = new org.json.JSONObject(userjson);
		
		 try {
			 
			 
			
			 Object jsonname = jsonObject.get("name");
			 
				org.json.JSONObject nameObject = new org.json.JSONObject(jsonname.toString());
				
				
				name.setFormatted(nameObject.getString("formatted"));
				name.setFamilyName(nameObject.getString("familyName"));
				name.setGivenName(nameObject.getString("givenName"));
				name.setMiddleName(nameObject.getString("middleName"));
				name.setHonorificPrefix(nameObject.getString("honorificPrefix"));
				name.setHonorificSuffix(nameObject.getString("honorificSuffix"));
				
				Object jsonemails = jsonObject.get("emails");

				
				int ArrayId=0;
				JSONArray emailsObject = new JSONArray(jsonemails.toString());
				Object Emails[] = new Object[100];
			
				
				while(!emailsObject.isNull(ArrayId)) {
				Emails[ArrayId] = new Object();
				
				Emails[ArrayId]=emailsObject.get(ArrayId);
				ArrayId++;
				
				}
				
				
				for(int i=0;i<ArrayId;i++) {
					Email email = new Email();
					org.json.JSONObject emailObject = new org.json.JSONObject(Emails[i].toString());
					email.setType(emailObject.getString("type"));
					email.setValue(emailObject.getString("value"));
					
					emailList.add(email);
				}
				
				
				
			user = objectMapper.readValue(userjson, User.class);
			user.setName(name);
			user.setEmails(emailList);
			 
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		 
		  userService.updateUser(id,user);
		  return "User "+id+" Updated";
		
	}
	
}
