package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Person;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class test
 */
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");  
        response.setCharacterEncoding("utf-8"); 
        response.setStatus(200);
        PrintWriter out = response.getWriter();
        String s = "{"+"\"firstName\""+":"+"\"Tom\""+"}";

        Person p = new Person();
        p.setAge(19);
        p.setName("Jack");
        p.setSex("man");
        JSONObject json = JSONObject.fromObject(p);
        String js = json.toString();
        out.print(js);
        out.close();
	}

}
