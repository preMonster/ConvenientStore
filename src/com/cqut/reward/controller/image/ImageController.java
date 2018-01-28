package com.cqut.reward.controller.image;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping("/imageController")
public class ImageController {
	
	@RequestMapping(value="/upload",method=RequestMethod.POST)   
    @ResponseBody  	
	public String upload(@RequestParam(value="file",required=false) MultipartFile[] file,  
            HttpServletRequest request) {
		 MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
	        // 根据前台的name名称得到上传的文件
	    List<MultipartFile> attachs = multipartRequest.getFiles("file");
	    
		int length = file.length;
        for(int i = 0;i<file.length;i++){
        	uploadOneImage(file[i]);
        }
        
        return "{\"result\":\"200\"}";
	}
    //上传一张图片
	public void uploadOneImage(MultipartFile file){
		//获得物理路径webapp所在路径  
	    // String pathRoot = request.getSession().getServletContext().getRealPath(""); 
		//项目所在路径 
		String projectPath = "D:\\PROJECT\\myeclipse\\dingding1\\reward\\WebRoot";
		String path="";  
		if(!file.isEmpty()){  
            //生成uuid作为文件名称  
            String uuid = UUID.randomUUID().toString().replaceAll("-","");  
            //获得文件类型（可以判断如果不是图片，禁止上传）  
            String contentType=file.getContentType();  
            //获得文件后缀名称  
            String imageName=contentType.substring(contentType.indexOf("/")+1); 
            //jpeg格式 img 读取不了 改成jpg
            if(imageName.equals("jpeg")){
            	imageName = "jpg";
            }
            path="/uploadImg/"+uuid+"."+imageName;  
            try {
				file.transferTo(new File(projectPath+path));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
        }  
        System.out.println(path);  
	}
}
