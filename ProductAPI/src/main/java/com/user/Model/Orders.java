package com.user.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderID;
	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;
	@OneToOne(cascade = CascadeType.ALL)
	private Payment payment;
	private String orderDate;
	private String shipDate;
	private String deliveryDate;
	private Integer total_order_amount;
}
