package vn.truongdx.DoXuanTruong_DemoJPA.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column(name="id")
	private Long id;
}
