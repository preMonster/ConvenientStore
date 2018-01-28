package com.cqut.reward.controller.goods;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqut.reward.entity.goods.Goods;
import com.cqut.reward.service.goods.IGoodsService;
import com.cqut.reward.service.role.IRoleService;

@Controller
@RequestMapping("/goodsController")
public class GoodsController {
	@Resource(name="goodsService")
	IGoodsService service;
	
	
	@RequestMapping("/add")  
    @ResponseBody  
	public String addGoods(Goods goods){
		return service.addGoods(goods);
	}
	@RequestMapping("/del")  
    @ResponseBody  
	public String delGoods(String id){
		return service.delGoods(id);
	}
	@RequestMapping("/upd")  
    @ResponseBody  
	public String updGoods(Goods goods){
		return service.updGoods(goods);
	}
	@RequestMapping("/getGoodsByStoreID")  
    @ResponseBody  	
	public String getGoodsByStoreID(String storeID) {
		List<Map<String, Object>> goods = service.getGoodsByStoreID(storeID);
		return JSONArray.fromObject(goods).toString();
	}
	
	@RequestMapping("/getGoodsByID")  
    @ResponseBody  	
	public String getGoodsByID(String id) {
		return JSONArray.fromObject(service.getGoodsByID(id)).toString();
	}
}
