package com.dangdang.bookmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dangdang.common.utils.PageUtils;
import com.dangdang.common.utils.Query;

import com.dangdang.bookmall.order.dao.ReasonDao;
import com.dangdang.bookmall.order.entity.ReasonEntity;
import com.dangdang.bookmall.order.service.ReasonService;


@Service("reasonService")
public class ReasonServiceImpl extends ServiceImpl<ReasonDao, ReasonEntity> implements ReasonService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ReasonEntity> page = this.page(
                new Query<ReasonEntity>().getPage(params),
                new QueryWrapper<ReasonEntity>()
        );

        return new PageUtils(page);
    }

}