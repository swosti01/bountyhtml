
package controller;

import Hashing.HashPassword;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.employee;
import userservice.userservice;

@WebServlet(name = "myservlet", urlPatterns = {"/users"})
public class myservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String page = request.getParameter("page");
        
        if(page.equalsIgnoreCase("registerpage")){ 
            employee em = new employee();
            em.setFullname(request.getParameter("Fullname"));
            em.setWorkemail(request.getParameter("Workemail"));
            em.setPassword( HashPassword.hashThisPass(request.getParameter("Password")));
//            em.setPassword(request.getParameter("Password"));
            em.setDepartment(request.getParameter("Department"));
            em.setPost(request.getParameter("Post"));
            em.setPhonenumber(request.getParameter("Phonenumber"));
            em.setAddress(request.getParameter("Address"));
            new userservice().insertuser(em);
        }
         if(page.equalsIgnoreCase("insert")){
            String name = request.getParameter("Workemail");
//            String password = request.getParameter("password");    
            String password = HashPassword.hashThisPass(request.getParameter("Password"));
            employee emp = new userservice().getUser(name, password);
            if(emp != null){
                HttpSession sess = request.getSession();
                sess.setAttribute("Workemail",name);
                
                RequestDispatcher rd2 = request.getRequestDispatcher("pages/dashboard.jsp");
                rd2.forward(request,response);
            }
            else{
                out.println("incorrecnt password");
                RequestDispatcher rd3 = request.getRequestDispatcher("index.jsp");
                rd3.forward(request,response);
            }
        }
       
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

   

}
