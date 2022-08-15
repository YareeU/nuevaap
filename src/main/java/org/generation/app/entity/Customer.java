package org.generation.app.entity;

import lombok.Data;
//import javax.persistence.*;

 
@Entity
@Data
@Table(name="customer_data")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCustomer;
	@Column(name="first_name")
	private String firstName;
	private String lastName;

}
