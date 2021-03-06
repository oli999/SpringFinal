package com.gura.spring07.file.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.gura.spring07.file.dto.FileDto;

public interface FileService {
	public void getList(HttpServletRequest request);
	public void removeFileInfo(int num, HttpServletRequest request, 
			HttpServletResponse response);
	public void saveFile(FileDto dto, HttpServletRequest request);
	public void getFileData(ModelAndView mView, int num);
	public void addDownCount(int num);
}











