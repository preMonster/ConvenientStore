package com.cqut.reward.service.goods;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cqut.reward.dao.base.EntityDao;
import com.cqut.reward.dao.base.SearchDao;
import com.cqut.reward.entity.employee.Employee;
import com.cqut.reward.entity.goods.Goods;
import com.cqut.reward.service.base.SearchService;
import com.cqut.reward.service.employee.IEmployeeService;
import com.cqut.reward.tool.util.EntityIDFactory;

@Service("goodsService")
public class GoodsService extends SearchService implements IGoodsService{
	@Resource(name="entityDao")
	EntityDao entityDao;

	@Resource(name="searchDao")
	SearchDao searchDao;
	@Override
	public String getBaseEntityName() {
		// TODO Auto-generated method stub
		return "goods";
	}

	@Override
	public String getBasePrimaryKey() {
		// TODO Auto-generated method stub
		return "goods.ID";
	}

	@Override
	public List<Map<String, Object>> getGoodsByStoreID(String storeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getGoodsByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String addGoods(Goods goods) {
		// TODO Auto-generated method stub
		int result = entityDao.save(goods);
		return result + "";
	}
	@Override
	public String updGoods(Goods goods) {
		// TODO Auto-generated method stub

		/*if(ID == null  || ID.equals("")){
			return "false";
		}*/

		return entityDao.updatePropByID( goods,goods.getID())==1?"true":"false";
	}
	@Override
	public String delGoods(String id) {
		// TODO Auto-generated method stub
		if(id == null || id.isEmpty()){
			return 0+"";
		}
		int result = entityDao.deleteByID(id, Goods.class);
		return result+"";
	}
	
	
}
