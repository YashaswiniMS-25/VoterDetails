package com.wolken.wolkenapp.DAO;

import java.sql.SQLException;

import com.wolken.wolkenapp.DTO.VoterDTO;

public interface VoterDAO {

	void add(VoterDTO voterdto) throws SQLException;

	void update(int age, String name) throws SQLException;

	void delete(String place) throws SQLException;

	void get() throws SQLException;

	

}
