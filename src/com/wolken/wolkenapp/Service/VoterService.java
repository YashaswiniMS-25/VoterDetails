package com.wolken.wolkenapp.Service;

import com.wolken.wolkenapp.DTO.VoterDTO;

public interface VoterService {
	public void validate(VoterDTO voterdto);
	public void validateAndUpdate(int age,String name);
	public void valiadteAndDelete(String place);
	public void getall();
}
