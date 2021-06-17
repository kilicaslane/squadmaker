package com.squadmaker.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.squadmaker.db.usersignup;
import com.squadmaker.entities.signupform;
import com.squadmaker.entities.user;

/**
 * Servlet implementation class signupservlet
 */
@WebServlet("/signupservlet")
public class signupservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signupservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	response.getWriter().append("Served at: ").append(request.getContextPath());
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		user user = (user) session.getAttribute("logUser");
	    if(user==null){
	        response.sendRedirect("index.jsp");
	    }
	    int tier;
		String username = com.squadmaker.entities.user.getUsername();
		String ign = com.squadmaker.entities.user.getIgn();
		int li = com.squadmaker.entities.user.getLi();
		int druid = isStrNull(request.getParameter("druid"));
		int hfb = isStrNull(request.getParameter("hfb"));
		int ctank = isStrNull(request.getParameter("ctank"));
		int qfb = isStrNull(request.getParameter("qfb"));
		int boonc = isStrNull(request.getParameter("boonc"));
		int qchrono = isStrNull(request.getParameter("qchrono"));
		int alacren = isStrNull(request.getParameter("alacren"));
		int banner = isStrNull(request.getParameter("banner"));
		int powerdps = isStrNull(request.getParameter("powerdps"));
		int condidps = isStrNull(request.getParameter("condidps"));
		int special = isStrNull(request.getParameter("special"));
		int tuesday = isStrNull(request.getParameter("tuesday"));
		int thursday = isStrNull(request.getParameter("thursday"));
		int saturday = isStrNull(request.getParameter("saturday"));
		tier = tierCalc(li);
		signupform sup = new signupform();
		sup.setUsername(username);
		sup.setIgn(ign);
		sup.setTier(tier);
		sup.setDruid(druid);
		sup.setHfb(hfb);
		sup.setCtank(ctank);
		sup.setQfb(qfb);
		sup.setBoonc(boonc);
		sup.setQchrono(qchrono);
		sup.setAlacren(alacren);
		sup.setBanner(banner);
		sup.setPowerdps(powerdps);
		sup.setCondidps(condidps);
		sup.setSpecialrole(special);
	
		if(tuesday == 0 && thursday == 0 && saturday == 0) {
			request.setAttribute("alertMsg", "choose a training day");
			RequestDispatcher rd=request.getRequestDispatcher("/signupform.jsp");  
			rd.include(request, response);
		}
		try {
			if(tuesday != 0) {
				String tday1 = "tuesday";
				usersignup.inserttrainee(sup, tday1);
			}
			if(thursday != 0) {
				String tday2 = "thursday";
				usersignup.inserttrainee(sup, tday2);
			}
			if(saturday != 0) {
				String tday3 = "saturday";
				usersignup.inserttrainee(sup, tday3);
			}
		}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		response.sendRedirect("welcome.jsp");
		}
int isStrNull(String str) {
	if(str == null) {
		return 0;
	}else {
		return 1;
	}
}
int tierCalc(int li) {
	int tier=(li)/100;	
	return tier;
}

}
	


