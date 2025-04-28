package vn.truongdx.DoXuanTruong_DemoJPA.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import vn.truongdx.DoXuanTruong_DemoJPA.Repositories.CustomerRepository;

@Controller
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/customer/all")
	public String getAll() {
		customerRepository.count();		
		return null;
	}
}