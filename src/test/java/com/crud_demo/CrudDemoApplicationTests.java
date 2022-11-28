package com.crud_demo;

import java.util.Optional;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crud_demo.entity.Registration;
import com.crud_demo.repository.StudentCrud;
@SpringBootTest
class CrudDemoApplicationTests {

	@Autowired
	private StudentCrud repo;
	
	
//	@Test
//	void saveOne() {
//		Registration reg = new Registration();
//		reg.setName("rani");
//		reg.setCity("chichcal");
//		reg.setEmail("rani@gmail.com");
//		reg.setMobile("87788");
//		repo.save(reg);
//	}
//	
//	@Test
//	void deleteOne() {
//		repo.deleteById("rani");
//	}

//	@Test
//	void updateOne() {
//		Registration reg = new Registration();
//		reg.setId("rani"); (yaha problem hai)
//		reg.setName("rani");
//		reg.setCity("chichcal");
//		reg.setEmail("rani@gmail.com");
//		reg.setMobile("00000");
//		repo.save(reg);
//	}
	
//	@Test
//	void getOne() {
//		Optional<Registration> f = repo.findById("vivek");
//		Registration r = f.get();
//		System.out.println(r.getName());
//		System.out.println(r.getCity());
//		System.out.println(r.getEmail());
//		System.out.println(r.getMobile());
//	}

	
	
	
	
	

}
