package com.cqut.reward.controller.excel;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqut.reward.tool.excel.ExportExel;

@Controller
@RequestMapping("/excelController")
public class ExcelController {
	
	@RequestMapping("/exportExcel")  
    @ResponseBody  	
	public String exportExcel(HttpServletResponse response) {
		try {
			ExportExel.export(response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "sucess";
	}
}
