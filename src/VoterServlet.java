import java.io.IOException;

import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.wolken.wolkenapp.DAO.VoterDAO;
import com.wolken.wolkenapp.DAO.voterDAOImpl;
import com.wolken.wolkenapp.DTO.VoterDTO;
//import com.wolken.wolkenapp.Service.VoterService;
import com.wolken.wolkenapp.Service.VoterServiceImpl;
@WebServlet(urlPatterns="/vote",loadOnStartup=+999)
public class VoterServlet extends HttpServlet{
	
	
	
	public VoterServlet() {
		System.out.println("constructor");
	}
@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	String name=req.getParameter("nm");
	String pl=req.getParameter("place");
	String age1=req.getParameter("age");
	int age=Integer.parseInt(age1);
	
	
    PrintWriter printwriter=res.getWriter();
	
	printwriter.print("Welcome  "+name+age);
	//VoterDAO voterdao=new voterDAOImpl();
	VoterServiceImpl voterservice=new VoterServiceImpl();
	VoterDTO voterdto=new VoterDTO();
	
	voterdto.setName(name);
   voterdto.setAge(age);
   voterdto.setPlace(pl);
   voterservice.validate(voterdto);
   //Scanner scan=new Scanner(System.in);
   
	/*
	 * System.out.println("enter the name to update"); String name1=scan.next();
	 * System.out.println("enter the age "); int age11=scan.nextInt();
	 */
   
   
   
	/*
	 * voterservice.validateAndUpdate(age11,name1);
	 * 
	 * System.out.println("enter the place to  delete"); String place=scan.next();
	 * voterservice.valiadteAndDelete(place); voterservice.getall();
	 */
	
   
   
   
   
	
	printwriter.flush();
	printwriter.close();
	
	
	}
	
	

}
