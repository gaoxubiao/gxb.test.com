package com.gxb.controller;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;


@Controller
@RequestMapping("/fileUpload")
public class FileUploadController {

	
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	public String upload(HttpServletRequest req)throws Exception{
		MultipartHttpServletRequest mreq=(MultipartHttpServletRequest) req;
		MultipartFile mfile=mreq.getFile("file");
		String fileName=mfile.getOriginalFilename();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		FileOutputStream fout=new FileOutputStream(req.getSession().getServletContext().getRealPath("/")
				+"upload/"+sdf.format(new Date())+fileName.substring(fileName.lastIndexOf('.')));
		fout.write(mfile.getBytes());
		fout.flush();
		fout.close();
		return "fileUp";
	}
}
