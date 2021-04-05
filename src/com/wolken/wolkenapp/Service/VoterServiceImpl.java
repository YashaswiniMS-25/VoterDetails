package com.wolken.wolkenapp.Service;

import com.wolken.wolkenapp.DTO.VoterDTO;

import java.sql.SQLException;

import com.wolken.wolkenapp.DAO.VoterDAO;
import com.wolken.wolkenapp.DAO.voterDAOImpl;

public class VoterServiceImpl implements VoterService{
	VoterDAO voterdao=new voterDAOImpl();
	VoterDTO voterdto=new VoterDTO();
	 public void validate(VoterDTO voterdto) {
		 try {
		 if(voterdto.getName().length()<50) {
			 try {
				voterdao.add(voterdto);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
		 else {
			 System.out.println("not valid");
		 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
	public void validateAndUpdate(int age, String name) {
		// TODO Auto-generated method stub
		
		if(age>18) {
			try {
				voterdao.update(age,name);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	public void valiadteAndDelete(String place) {
		// TODO Auto-generated method stub
		if(place!=null) {
			try {
				voterdao.delete(place);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	public void getall() {
		// TODO Auto-generated method stub
		try {
			voterdao.get();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 

}
