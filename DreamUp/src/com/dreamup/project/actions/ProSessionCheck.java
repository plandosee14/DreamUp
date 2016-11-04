package com.dreamup.project.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.project.dao.ProjectDAO;

public class ProSessionCheck extends Action{
   @Override
   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
         HttpServletResponse response) throws Exception {
      
      ActionForward forward;
      if(request.getSession().getAttribute("login_id")==null){
         forward = mapping.findForward("fail");
      }else{
         ProjectDAO dao = new ProjectDAO();
         int cnt = dao.selectProjectIng((String)(request.getSession().getAttribute("login_id")));
         
         if(cnt>0){
            forward = mapping.findForward("profail");            
         }else{
            
            forward = mapping.findForward("scs");
         }
         
         
      }
      
      return forward;
   }

}