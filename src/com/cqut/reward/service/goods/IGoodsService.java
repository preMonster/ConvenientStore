package com.cqut.reward.service.goods;

import java.util.List;
import java.util.Map;

import com.cqut.reward.entity.goods.Goods;

public interface IGoodsService {
	public List<Map<String, Object>> getGoodsByStoreID(String storeID);
	public Map<String, Object> getGoodsByID(String id);
	public String addGoods(Goods goods);
	public String delGoods(String id);
	public String updGoods(Goods goods);
}
