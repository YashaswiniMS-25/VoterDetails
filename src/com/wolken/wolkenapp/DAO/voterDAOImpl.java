package com.wolken.wolkenapp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wolken.wolkenapp.Connect;
import com.wolken.wolkenapp.DTO.VoterDTO;

public class voterDAOImpl  implements VoterDAO{
	
	Connection con=null;

	

	public void add(VoterDTO voterdto) throws SQLException  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
			try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=Yashu@25101999");)
			{
		try(PreparedStatement ps=con.prepareStatement("insert into wolken.voter_table values( ?,?,?)");)
				{
					ps.setInt(1,voterdto.getAge());
					ps.setString(2,voterdto.getName());
					ps.setString(3, voterdto.getPlace());
					ps.executeUpdate();
					ps.close();
				}
		
		
		
	}
		
		}

	@Override
	public void update(int age, String name) throws SQLException {
		// TODO Auto-generated method stub
		try(PreparedStatement ps=con.prepareStatement("update table wolken.voter_table set age=? where name=?");){
			ps.setInt(1, age);
			ps.setString(2, name);
			ps.executeUpdate();
			ps.close();
		}
		
	}

	@Override
	public void delete(String place) throws SQLException {
		// TODO Auto-generated method stub
		try(PreparedStatement ps=con.prepareStatement("delete from table wolken.voter_table where place=?");)
		{
			ps.setString(1, place);
			ps.executeUpdate();
			ps.close();
		}
	}

	@Override
	public void get() throws SQLException {
		// TODO Auto-generated method stub
		try(PreparedStatement ps=con.prepareStatement("select * from wolken.prison_table");){
			try(ResultSet rs=ps.executeQuery();){
				
				while(rs.next()) {
					String name=rs.getString("name");
					int age=rs.getInt("age");
					String place=rs.getString("place");
					System.out.println(name+" "+age+" "+place+" " );
					
				}
				rs.close();
				
			}
			ps.close();
			
		}
		
	}
	
	

}
