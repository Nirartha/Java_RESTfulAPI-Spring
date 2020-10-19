package com.main.Springboot.Dao;

//import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.main.Springboot.Model.MemberAccountJPA;

public interface MemberRepository {//extends JpaRepository<MemberAccountJPA, Long> {
	
//	List<MemberAccountJPA> findAll();
	
//	@Query(value = "SELECT id, account, email, password, address, cellphone FROM memberaccount WHERE email = ?1 and password = ?2", nativeQuery = true)
//	List<MemberAccountJPA> findMemberAccount(String email, String password);
}
