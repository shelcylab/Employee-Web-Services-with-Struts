/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.actions;

import interfaces.Employee;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import my.forms.EmpDetailsForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import services.EmployeeDetailServiceService;
import services.IEmployeeDetailService;

/**
 *
 * @author shelc
 */
public class EmpDetailsAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "employeeListing";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        EmpDetailsForm empDetailsForm = (EmpDetailsForm)form;
        empDetailsForm.setEmployeeList(AllDetails());

        return mapping.findForward(SUCCESS);
    }

    private static List<Employee> AllDetails() {
        EmployeeDetailServiceService service = new EmployeeDetailServiceService();
        IEmployeeDetailService port = service.getEmployeeDetailServicePort();
        return port.getEmployeeDetails();
    }
}
