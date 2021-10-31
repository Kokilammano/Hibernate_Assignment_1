//Create Hibernate Project for Employ(id,name,mobile,email)

package com.hib_app;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employ {
		@Id
	   private int id;
	   private String name;
	   private int mobile;
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
		public int getMobile() {
			return mobile;
		}
		public void setMobile(int mobile) {
			this.mobile = mobile;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "Employ [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + "]";
		}
}
