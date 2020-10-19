package com.dangdang.bookmall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dangdang.bookmall.order.entity.BookinfoEntity;
import com.dangdang.bookmall.order.service.BookinfoService;
import com.dangdang.common.utils.PageUtils;
import com.dangdang.common.utils.R;



/**
 * 
 *
 * @author zengyuzhi
 * @email shbyku@gmail.com
 * @date 2020-10-17 20:58:04
 */
@RestController
@RequestMapping("order/bookinfo")
public class BookinfoController {
    @Autowired
    private BookinfoService bookinfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("order:bookinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bookinfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("order:bookinfo:info")
    public R info(@PathVariable("id") Long id){
		BookinfoEntity bookinfo = bookinfoService.getById(id);

        return R.ok().put("bookinfo", bookinfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("order:bookinfo:save")
    public R save(@RequestBody BookinfoEntity bookinfo){
		bookinfoService.save(bookinfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("order:bookinfo:update")
    public R update(@RequestBody BookinfoEntity bookinfo){
		bookinfoService.updateById(bookinfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("order:bookinfo:delete")
    public R delete(@RequestBody Long[] ids){
		bookinfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}