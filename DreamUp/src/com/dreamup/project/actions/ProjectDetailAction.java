package com.dreamup.project.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.member.dao.MemberDAO;
import com.dreamup.member.dto.MemberDTO;
import com.dreamup.project.dao.ProjectDAO;
import com.dreamup.project.dao.ProjectListDAO;
import com.dreamup.project.dto.ProjectDTO;
import com.dreamup.project.dto.ProjectListDTO;
import com.dreamup.reward.dao.RewardDAO;
import com.dreamup.reward.dto.RewardDTO;

public class ProjectDetailAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int pro_no = Integer.parseInt(request.getParameter("pro_no"));

		ProjectDAO dao = new ProjectDAO();
		ProjectDTO project = dao.selectProject(pro_no);
		request.setAttribute("project", project );
		
		MemberDTO member = new MemberDTO();
		member = dao.selectProjectRegister(pro_no);
		request.setAttribute("member", member);
		
		ProjectListDAO proDetailDAO = new ProjectListDAO();
		ProjectListDTO proDetail = new ProjectListDTO();
		proDetail = proDetailDAO.projcetData(pro_no);
		request.setAttribute("proDetail", proDetail);
		
		RewardDAO rdao = new RewardDAO();
		RewardDTO reward = new RewardDTO();
		List<RewardDTO> rewardList;
		rewardList = rdao.selectProReward(pro_no);
		request.setAttribute("rewardList", rewardList);
		
		return mapping.findForward("scs");
	}

}
