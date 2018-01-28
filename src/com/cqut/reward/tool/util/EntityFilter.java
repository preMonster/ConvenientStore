package com.cqut.reward.tool.util;

import com.cqut.reward.entity.base.Entity;

public class EntityFilter implements ClassFilter{

	@Override
	public boolean accept(Class clazz) {
		return clazz.getSuperclass().equals(Entity.class);
	}

}
