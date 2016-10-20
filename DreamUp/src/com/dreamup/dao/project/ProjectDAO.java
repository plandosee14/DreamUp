package com.dreamup.dao.project;

import java.util.List;

import com.dreamup.dto.project.ProjectDTO;

public class ProjectDAO {
	public boolean insertBacic(ProjectDTO project){
	return false;
	}
	public boolean insertStory(ProjectDTO project){
		return false;
	}
	public boolean insertProfile(ProjectDTO project){
		return false;
	}
	public boolean insertAccount(ProjectDTO project){
		return false;
	}
	public ProjectDTO selectTempProject(int ptNo){
		return null;
	}
	public boolean updateTempProject(ProjectDTO project){
		return false;
	}
	public boolean deleteTempProject(int ptNo){
		return false;
	}
	public boolean insertProject(ProjectDTO project){
		return false;
	}
	public boolean deleteProject(ProjectDTO project){
		return false;
	}
	public ProjectDTO selectProject(int pNo){
		return null;
	}
	public List<ProjectDTO> selectNewProject(){
		return null;
	}
	public List<ProjectDTO> selectPopProject(){
		return null;
	}
	public List<ProjectDTO> selectProjectById(String id){
		return null;
	}
	public List<ProjectDTO> selectCatagoryProject(String catagory){
		return null;
	}
}
