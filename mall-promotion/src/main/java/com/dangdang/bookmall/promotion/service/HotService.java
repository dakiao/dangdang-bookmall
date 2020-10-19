package com.dangdang.bookmall.promotion.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dangdang.common.utils.PageUtils;
import com.dangdang.bookmall.promotion.entity.HotEntity;

import java.util.Map;

/**
 * 
 *
 * @author zengyuzhi
 * @email shbyku@gmail.com
 * @date 2020-10-17 20:59:11
 */
public interface HotService extends IService<HotEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
