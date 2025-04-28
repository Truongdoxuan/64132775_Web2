package vn.truongdx.Example_ConnectMySQL.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.truongdx.Example_ConnectMySQL.Models.SanPham;

public interface ISanPham extends JpaRepository<SanPham, Long> {
	
}