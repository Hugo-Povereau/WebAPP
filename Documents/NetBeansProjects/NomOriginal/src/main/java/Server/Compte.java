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
public class Compte extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Page de Connexion</title>");
            out.println("<link href=\"http://fr.allfont.net/allfont.css?fonts=commercial-script-bt\" rel=\"stylesheet\" type=\"text/css3\" />");
            out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n" +
"    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n" +
"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n" +
"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>");   
            out.println("</head>");
            out.println("<body>");
            out.println("  <style >\n" +
"      html{\n" +
"        background:r#fff;\n" +
"        background-repeat: no-repeat;\n" +
"        height:100%;\n" +
 "       left:40%;\n" +
"      }\n" +
"/* STRUCTURE */\n" +
"\n" +
".wrapper {\n" +
"  display: flex;\n" +
"  align-items: center;\n" +
"  flex-direction: column;\n" + 
"  justify-content: center;\n" +
"  width: 100%;\n" +
"  min-height: 100%;\n" +
"  padding: 20px;\n" +
"}\n" +
"\n" +
"#formContent {\n" +
"  -webkit-border-radius: 10px 10px 10px 10px;\n" +
"  border-radius: 10px 10px 10px 10px;\n" +
"  background: #fff, 0.1;\n" +
"  padding: 30px;\n" +
"  width: 90%;\n" +
"  max-width: 450px;\n" +
"  position: relative;\n" +
"  padding: 0px;\n" +
"  -webkit-box-shadow: 0 30px 60px 0 rgba(0,0,0,0.3);\n" +
"  box-shadow: 0 30px 60px 0 rgba(0,0,0,0.3);\n" +
"  text-align: center;\n" +
"}\n" +
"\n" +
"#formFooter {\n" +
"  background-color: #f6f6f6;\n" +
"  border-top: 1px solid #dce8f1;\n" +
"  padding: 25px;\n" +
"  text-align: center;\n" +
"  -webkit-border-radius: 0 0 10px 10px;\n" +
"  border-radius: 0 0 10px 10px;\n" +
"}\n" +
"\n" +
"/* TABS */\n" +
"h2.inactive {\n" +
"  color: #cccccc;\n" +
"}\n" +
"\n" +
"h2.active {\n" +
"  color: #0d0d0d;\n" +
"  border-bottom: 2px solid #5fbae9;\n" +
"}\n" +
"\n" +
"/* FORM TYPOGRAPHY*/\n" +
"\n" +
"input[type=button], input[type=submit], input[type=reset]  {\n" +
"  background-color: #56baed;\n" +
"  border: none;\n" +
"  color: white;\n" +
"  padding: 15px 80px;\n" +
"  text-align: center;\n" +
"  text-decoration: none;\n" +
"  display: inline-block;\n" +
"  text-transform: uppercase;\n" +
"  font-size: 13px;\n" +
"  -webkit-box-shadow: 0 10px 30px 0 rgba(95,186,233,0.4);\n" +
"  box-shadow: 0 10px 30px 0 rgba(95,186,233,0.4);\n" +
"  -webkit-border-radius: 5px 5px 5px 5px;\n" +
"  border-radius: 5px 5px 5px 5px;\n" +
"  margin: 5px 20px 40px 20px;\n" +
"  -webkit-transition: all 0.3s ease-in-out;\n" +
"  -moz-transition: all 0.3s ease-in-out;\n" +
"  -ms-transition: all 0.3s ease-in-out;\n" +
"  -o-transition: all 0.3s ease-in-out;\n" +
"  transition: all 0.3s ease-in-out;\n" +
"}\n" +
"\n" +
"input[type=button]:hover, input[type=submit]:hover, input[type=reset]:hover  {\n" +
"  background-color: #39ace7;\n" +
"}\n" +
"\n" +
"input[type=button]:active, input[type=submit]:active, input[type=reset]:active  {\n" +
"  -moz-transform: scale(0.95);\n" +
"  -webkit-transform: scale(0.95);\n" +
"  -o-transform: scale(0.95);\n" +
"  -ms-transform: scale(0.95);\n" +
"  transform: scale(0.95);\n" +
"}\n" +
"\n" +
"input[type=text] {\n" +
"  background-color: #f6f6f6;\n" +
"  border: none;\n" +
"  color: #0d0d0d;\n" +
"  padding: 15px 32px;\n" +
"  text-align: center;\n" +
"  text-decoration: none;\n" +
"  display: inline-block;\n" +
"  font-size: 16px;\n" +
"  margin: 5px;\n" +
"  width: 85%;\n" +
"  border: 2px solid #f6f6f6;\n" +
"  -webkit-transition: all 0.5s ease-in-out;\n" +
"  -moz-transition: all 0.5s ease-in-out;\n" +
"  -ms-transition: all 0.5s ease-in-out;\n" +
"  -o-transition: all 0.5s ease-in-out;\n" +
"  transition: all 0.5s ease-in-out;\n" +
"  -webkit-border-radius: 5px 5px 5px 5px;\n" +
"  border-radius: 5px 5px 5px 5px;\n" +
"}\n" +
"\n" +
"input[type=text]:focus {\n" +
"  background-color: #fff;\n" +
"  border-bottom: 2px solid #5fbae9;\n" +
"}\n" +
"\n" +
"input[type=text]:placeholder {\n" +
"  color: #cccccc;\n" +
"}\n" +
"\n" +
"/* ANIMATIONS */\n" +
"\n" +
"/* Simple CSS3 Fade-in-down Animation */\n" +
".fadeInDown {\n" +
"  -webkit-animation-name: fadeInDown;\n" +
"  animation-name: fadeInDown;\n" +
"  -webkit-animation-duration: 1s;\n" +
"  animation-duration: 1s;\n" +
"  -webkit-animation-fill-mode: both;\n" +
"  animation-fill-mode: both;\n" +
"}\n" +
"\n" +
"@-webkit-keyframes fadeInDown {\n" +
"  0% {\n" +
"    opacity: 0;\n" +
"    -webkit-transform: translate3d(0, -100%, 0);\n" +
"    transform: translate3d(0, -100%, 0);\n" +
"  }\n" +
"  100% {\n" +
"    opacity: 1;\n" +
"    -webkit-transform: none;\n" +
"    transform: none;\n" +
"  }\n" +
"}\n" +
"@keyframes fadeInDown {\n" +
"  0% {\n" +
"    opacity: 0;\n" +
"    -webkit-transform: translate3d(0, -100%, 0);\n" +
"    transform: translate3d(0, -100%, 0);\n" +
"  }\n" +
"  100% {\n" +
"    opacity: 1;\n" +
"    -webkit-transform: none;\n" +
"    transform: none;\n" +
"  }\n" +
"}\n" +
"\n" +
"/* Simple CSS3 Fade-in Animation */\n" +
"@-webkit-keyframes fadeIn { from { opacity:0; } to { opacity:1; } }\n" +
"@-moz-keyframes fadeIn { from { opacity:0; } to { opacity:1; } }\n" +
"@keyframes fadeIn { from { opacity:0; } to { opacity:1; } }\n" +
"\n" +
".fadeIn {\n" +
"  opacity:0;\n" +
"  -webkit-animation:fadeIn ease-in 1;\n" +
"  -moz-animation:fadeIn ease-in 1;\n" +
"  animation:fadeIn ease-in 1;\n" +
"\n" +
"  -webkit-animation-fill-mode:forwards;\n" +
"  -moz-animation-fill-mode:forwards;\n" +
"  animation-fill-mode:forwards;\n" +
"\n" +
"  -webkit-animation-duration:1s;\n" +
"  -moz-animation-duration:1s;\n" +
"  animation-duration:1s;\n" +
"}\n" +
"\n" +
".fadeIn.first {\n" +
"  -webkit-animation-delay: 0.4s;\n" +
"  -moz-animation-delay: 0.4s;\n" +
"  animation-delay: 0.4s;\n" +
"}\n" +
"\n" +
".fadeIn.second {\n" +
"  -webkit-animation-delay: 0.6s;\n" +
"  -moz-animation-delay: 0.6s;\n" +
"  animation-delay: 0.6s;\n" +
"}\n" +
"\n" +
".fadeIn.third {\n" +
"  -webkit-animation-delay: 0.8s;\n" +
"  -moz-animation-delay: 0.8s;\n" +
"  animation-delay: 0.8s;\n" +
"}\n" +
"\n" +
".fadeIn.fourth {\n" +
"  -webkit-animation-delay: 1s;\n" +
"  -moz-animation-delay: 1s;\n" +
"  animation-delay: 1s;\n" +
"}\n" +
"\n" +
"/* Simple CSS3 Fade-in Animation */\n" +
".underlineHover:after {\n" +
"  display: block;\n" +
"  left: 0;\n" +
"  bottom: -10px;\n" +
"  width: 0;\n" +
"  height: 2px;\n" +
"  background-color: #56baed;\n" +
"  content: \"\";\n" +
"  transition: width 0.2s;\n" +
"}\n" +
"\n" +
".underlineHover:hover {\n" +
"  color: #0d0d0d;\n" +
"}\n" +
"\n" +
".underlineHover:hover:after{\n" +
"  width: 100%;\n" +
"}\n" +
"/* OTHERS */\n" +
"\n" +
"*:focus {\n" +
"    outline: none;\n" +
"} \n" +
"\n" +
"#icon {\n" +
"  width:20%;\n" +
"}\n" +
"\n" +
"      .navbar .dropdown-toggle, .navbar .dropdown-menu a {\n" +
"          cursor: pointer;\n" +
"      }\n" +
"\n" +
"      .navbar .dropdown-item.active, .navbar .dropdown-item:active {\n" +
"          color: inherit;\n" +
"          text-decoration: none;\n" +
"          background-color: inherit;\n" +
"      }\n" +
"\n" +
"      .navbar .dropdown-item:focus, .navbar .dropdown-item:hover {\n" +
"          color: #16181b;\n" +
"          text-decoration: none;\n" +
"          background-color: #f8f9fa;\n" +
"      }\n" +
"\n" +
"      @media (min-width: 767px) {\n" +
"          .navbar .dropdown-toggle:not(.nav-link)::after {\n" +
"              display: inline-block;\n" +
"              width: 0;\n" +
"              height: 0;\n" +
"              margin-left: .5em;\n" +
"              vertical-align: 0;\n" +
"              border-bottom: .3em solid transparent;\n" +
"              border-top: .3em solid transparent;\n" +
"              border-left: .3em solid;\n" +
"          }\n" +
"      }\n" +
"\n" +
"\n" +
"    </style>");
            out.println("<script src=\"http://code.jquery.com/jquery.js\"></script>");
            out.println("<script>\n" +
"\n" +
"        $('.navbar .dropdown-item').on('click', function (e) {\n" +
"       var $el = $(this).children('.dropdown-toggle');\n" +
"       var $parent = $el.offsetParent(\".dropdown-menu\");\n" +
"       $(this).parent(\"li\").toggleClass('open');\n" +
"\n" +
"       if (!$parent.parent().hasClass('navbar-nav')) {\n" +
"           if ($parent.hasClass('show')) {\n" +
"               $parent.removeClass('show');\n" +
"               $el.next().removeClass('show');\n" +
"               $el.next().css({\"top\": -999, \"left\": -999});\n" +
"           } else {\n" +
"               $parent.parent().find('.show').removeClass('show');\n" +
"               $parent.addClass('show');\n" +
"               $el.next().addClass('show');\n" +
"               $el.next().css({\"top\": $el[0].offsetTop, \"left\": $parent.outerWidth() - 4});\n" +
"           }\n" +
"           e.preventDefault();\n" +
"           e.stopPropagation();\n" +
"       }\n" +
"   });\n" +
"\n" +
"   $('.navbar .dropdown').on('hidden.bs.dropdown', function () {\n" +
"       $(this).find('li.dropdown').removeClass('show open');\n" +
"       $(this).find('ul.dropdown-menu').removeClass('show open');\n" +
"   });\n" +
"    </script>");
            
            out.println("<script type=\"text/javascript\" >\n" +
"    function reponse() {\n" +
"  var login = document.getElementById(\"login\").value;\n" +
"  var password = document.getElementById(\"password\").value;\n" +
"  if (login == \"Contact\" || password == \"Code\") {\n" +
"   var identifiant = 1;\n" +
"    }\n" +         
"  else if (login == \"Admin\" || password == \"Admin\") {\n" +
"   window.location.href=\"Server/Admin.java\"; \n" +
"    }\n" +           
"   window.location.href=\"Server/Accueil.java\"; \n" + 
"}\n" +
"  </script>");
            out.println(" <header>\n" +
"      <div class=\"navbar navbar-expand-md navbar-dark bg-dark mb-4\" role=\"navigation\">\n" +
"    <a class=\"navbar-brand\" href=\"Accueil\">Champo'zin</a>\n" +
"    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"        <span class=\"navbar-toggler-icon\"></span>\n" +
"    </button>\n" +
"    <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n" +
"        <ul class=\"navbar-nav mr-auto\">\n" +
"\n" +
"            <li class=\"nav-item active\">\n" +
"                <a class=\"nav-link\" href=\"Panier\"> <span class=\"sr-only\">(current)</span>\n" +
"                <img src=\"images/Panier.png\" width=\"30\" height=\"30\" class=\"d-inline-block align-top\" alt=\"\">\n" +
"                Panier</a>\n" +
"            </li>\n" + 
"\n" +              
"            <li class=\"nav-item active\">\n" +
"                <a class=\"nav-link\" href=\"Compte\"> <span class=\"sr-only\">(current)</span>\n" +
"                <img src=\"images/Compte.png\" width=\"30\" height=\"30\" class=\"d-inline-block align-top\" alt=\"\">\n" +
"                Compte</a>\n" +
"            </li>\n" +                
"        </ul>\n" +
"\n" +
"    </div>\n" +
"    <form class=\"form-inline mt-2 mt-md-0\">\n" +
"        <input id=\"ecrit\" class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Rechercher un produit \" aria-label=\"Search\">\n" +
"        <button  id= \"cherche_bon_mot\" class=\"btn btn-dark my-2 my-sm-0\" type=\"button\">Search</button>\n" +
"    </form>\n" +
"    </div>\n" +
"\n" +
"  		</header>");
            out.println("<div class=\"wrapper fadeInDown\">\n" +
"  <div id=\"formContent\">\n" +
"    <!-- Tabs Titles -->\n" +
"\n" +
"    <!-- Icon -->\n" +
"    <div class=\"fadeIn first\">\n" +
"      <img src=\"images/Compte.png\" id=\"icon\" alt=\"User Icon\" />\n" +
"    </div>\n" +
"\n" +
"    <!-- Login Form -->\n" +
"    <form>\n" +
"      <input type=\"text\" id=\"login\" class=\"fadeIn second\" name=\"login\" placeholder=\"login\">\n" +
"      <input type=\"text\" id=\"password\" class=\"fadeIn third\" name=\"login\" placeholder=\"password\">\n" +
"      <input type=\"submit\" class=\"fadeIn fourth\" value=\"Log In\" onclick=\"reponse()\">\n" +
"    </form>\n" +
"\n" +
"  </div>\n" +
"                </div>");

            out.println("</body>");
            out.println("</html>");
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
