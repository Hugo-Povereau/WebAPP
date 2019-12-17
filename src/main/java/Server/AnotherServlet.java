/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Reb
 */
public class AnotherServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @SuppressWarnings("empty-statement")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int count;;
        if(request.getSession().getAttribute("count") == null){
            count = 0;
        }
        else{
            count = (Integer) request.getSession().getAttribute("count");
        }
        request.getSession().setAttribute("count", ++count);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Page de connexion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Conectez vous</h1>");
            out.println("<form method=\"post\" action=\"Accueil\">\n" +
"   <p>\n" +
"       <label for=\"pseudo\">Votre pseudo :</label>\n" +
"       <input type=\"text\" name=\"pseudo\" id=\"pseudo\" required />\n" +
"       \n" +
"       <br />\n" +
"       <label for=\"pass\">Votre mot de passe :</label>\n" +
"       <input type=\"password\" name=\"pass\" id=\"pass\" required />\n" +
"       \n" +
"   </p>\n" +
"<input type=\"submit\" value=\"Envoyer\" action=\"Accueil\"/>" +
"</form>");
            out.println("</body>");
            out.println("</html>");
            out.println("Vous avez accédé à cette page " + request.getSession().getAttribute("count") + " fois.");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        processRequest(request, response);
	String message = "Transmission de variables";
	request.setAttribute( "test", message );
	this.getServletContext().getRequestDispatcher( "/WEB-INF/test.jsp" ).forward( request, response );
	
        
        
}

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
