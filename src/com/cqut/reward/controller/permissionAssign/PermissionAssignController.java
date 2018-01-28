package com.cqut.reward.controller.permissionAssign;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqut.reward.service.permissionAssign.IPermissionAssignService;
import com.cqut.reward.entity.base.BootstrapTreeNode;
import com.cqut.reward.service.module.IModuleService;
import com.cqut.reward.service.role.IRoleService;


/**
 * @author zx 
 * 权限分配
 */
@Controller
@RequestMapping("/permissionAssignController")
public class PermissionAssignController{
	
	@Resource(name="permissionAssignService")
	IPermissionAssignService service;
	
	@Resource(name="roleService")
	IRoleService roleService;
	
	@Resource(name="moduleService")
	IModuleService moduleService;
	
	/**
	 * 读取权限树一级菜单
	 * @param userID
	 * @return
	 */
	/*@RequestMapping("/getChiefMenu")  
	@ResponseBody
	public String getChiefMenu(HttpServletRequest request){
		Object userIDObj = request.getSession().getAttribute("USERID");
		if(userIDObj==null){
			return null;
		} else {
			return "";
			return JSONArray.fromObject(service.getChiefMenu(userIDObj.toString())).toString();
		}
	}
	*/
	/**
	 * 读取权限树菜单 
	 *  wangzhijun
	 * @param operatorCode
	 * @param level
	 * @return   
	 */
	@RequestMapping("/getPermissionModule")  
	@ResponseBody
	public String getPermissionModule(HttpServletRequest request, String level) {
		//Object userIDObj = request.getSession().getAttribute("USERID");
		   System.out.println("jin xin dao ctroller");

		String  userIDObj = "20170220xiji";
		String  loginName = "";
		
		userIDObj = (String)request.getSession().getAttribute("EMPLOYEEID");
		loginName = (String)request.getSession().getAttribute("LOGINNAME");
		 if(userIDObj==null){
		
			System.out.println("=====================================");
			System.out.println("未登录账号或者为注入账号");
			System.out.println("未登录账号或者为注入账号");
			System.out.println("=====================================");

			return null;
			
		} else {
			
				return JSONArray.fromObject(service.getPermissionModule(userIDObj.toString(), level , loginName)).toString();
			
			
		}
	}
	
	/**
	 * 权限分配
	 * @return
	 */
	@RequestMapping("/getRoleTree")  
	@ResponseBody	
	public String getRoleTree(){
		return JSONArray.fromObject(roleService.getRoleTree().getNodes()).toString();
	}
	
	@RequestMapping("/getModuleTree")  
	@ResponseBody	
	public String getModuleTree(){
		return JSONArray.fromObject(moduleService.getModuleTree()).toString();
	}
	
	/*@RequestMapping("/getSelectPermission")  
	@ResponseBody	
	public String getSelectPermission(String roleId,String moduleCode){
		
		List<Map<String,Object>> ens = service.findPermissionAssignsByCondition(new String[]{"permissionCode"}, "ownerCode = '"+roleId+"' AND permissionCode = '"+moduleCode+"'");

		return ens.size()==0?"0":"1";
		
	}*/
	
	/*@RequestMapping("/addPermission")  
	@ResponseBody	
	public String addPermission(String modulecode,String roleId,boolean isLeaf){
		System.out.println("\n\n\n开始了吗"+modulecode+"=="+roleId);
		return String.valueOf(service.addPermission(modulecode, roleId,isLeaf));
	}
	@RequestMapping("/delPermission")  
	@ResponseBody	
	public String delPermission(String modulecode,String roleId,boolean isLeaf){
		return String.valueOf(service.delPermission(modulecode, roleId,isLeaf));
	}*/
	/**
	 * 删除角色对应的模块
	 * @author wzj
	 * @date 2016年12月24日 下午5:30:50
	 * @param roleID
	 * @param moduleID
	 */
	@RequestMapping("/deletePermission")  
	@ResponseBody	
	public String deletePermission(String roleID,String moduleID){
		return service.deletePermission(roleID,moduleID);
	}
	/**
	 * 新增角色对应的模块
	 * @author wzj
	 * @date 2016年12月24日 下午5:31:08
	 * @param roleID
	 * @param moduleID
	 */
	@RequestMapping("/addPermission")  
	@ResponseBody	
	public String addPermission(String roleID,String moduleID){
	return  service.addPermission(roleID,moduleID);
	}
	
}
