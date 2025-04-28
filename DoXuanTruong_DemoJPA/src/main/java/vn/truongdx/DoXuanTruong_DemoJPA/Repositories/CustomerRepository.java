package vn.truongdx.DoXuanTruong_DemoJPA.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.truongdx.DoXuanTruong_DemoJPA.Models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
