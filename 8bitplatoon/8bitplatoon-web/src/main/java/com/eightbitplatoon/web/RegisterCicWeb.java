package com.eightbitplatoon.web;

import com.eightbitplatoon.ejb.EntityFacadeRemote;
import com.eightbitplatoon.model.CicEntity;
import com.eightbitplatoon.model.CicWeb;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pc
 */
@WebServlet(name = "RegisterCicWeb", urlPatterns = {"/RegisterCicWeb"})
public class RegisterCicWeb extends HttpServlet {

    @EJB
    private EntityFacadeRemote cic;
    /**
     * register communication in the database
     *
     * @param request
     * @param response
     * @throws IOException
     */
    private void registerCIC(HttpServletRequest request, HttpServletResponse response) throws IOException ,ParseException{
        response.setContentType("text/html;charset=UTF-8");

        //get the parameter values from post 
        String entityName = request.getParameter("entityName");
        String emailAddress = request.getParameter("emailAddress");
        String cicType = request.getParameter("cicType");
        String cicSubject = request.getParameter("cicSubject");
        String cicBody = request.getParameter("cicBody");
        String crcSystem = request.getParameter("crcSystem");
        String timestamp = request.getParameter("timestamp");

        //convert and format timestamp from string to Date
        Date cictimeStamp = new SimpleDateFormat("yyyy-MM-dd").parse(timestamp);

        //Declare and initialize CIC objects
        CicEntity cicEntity = new CicEntity();
        CicWeb cicWeb = new CicWeb();
        Set<CicWeb> communication = new HashSet<CicWeb>();

        try {
            cicWeb.setCictype(cicType);
            cicWeb.setSubject(cicSubject);
            cicWeb.setBody(cicBody);
            cicWeb.setSourcesystem(crcSystem);
            cicWeb.setCictimestamp(cictimeStamp);
            communication.add(cicWeb);
            cicEntity.setEntityname(entityName);
            cicEntity.setEmailaddress(emailAddress);
            cicEntity.setCicCollection(communication);
        } catch (Exception ex) {
            Logger.getLogger(RegisterCicWeb.class.getName()).log(Level.SEVERE, "Exception" + ex, ex);
        }
        PrintWriter out = response.getWriter();
        try {
            new CiCFactory().getCIC().RegisterCic(cicEntity,cic);
            out.println("Communication is registered successfully");
        } catch (Exception exception) {
            out.println("Oops ! Something went wrong, try again later");
            Logger.getLogger(RegisterCicWeb.class.getName()).log(Level.SEVERE, exception.getMessage(), "++++++++++++++++" + exception);
        } finally {
            out.close();
        }

    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.text.ParseException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        registerCIC(request, response);
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
        }
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
