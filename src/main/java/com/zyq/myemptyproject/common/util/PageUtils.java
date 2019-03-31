package com.zyq.myemptyproject.common.util;

import org.springframework.data.domain.Page;

import java.util.HashMap;
import java.util.Map;

/**
 * 分页工具类
 * @author zhngyq
 * @date  2019/03/31
 */
public final class PageUtils {

    private PageUtils() {
    }

    /**
     * 将分页的元素转换成map，包括以下元素
     * items：分页数据
     * currentPage：当前页数
     * pageSize：每页数量
     * offset：偏移量
     * beginNumber：当前页开始的元素量
     * endNumber：当前页结束的元素量
     * hasPrevious：是否有前一页
     * hasNext：是否有后一页
     * totalPage:总页数
     * totalNumber: 总数据量
     *
     * @param page
     * @return
     */
    public static final Map<String, ?> pageAttributeToMap(Page<?> page) {
        // 偏移量 就是（当前页-1）*页面，前面有多少条数据
        Integer offset = (page.getPageable().getPageNumber() - 1) * page.getSize();
        Map<String, Object> map = new HashMap();
        // 分页数据
        map.put("items", page.getContent());
        // 当前页数
        map.put("currentPage", page.getPageable().getPageNumber());
        // 每页数量
        map.put("pageSize", page.getSize());
        // 偏移量
        map.put("offset", offset);
        // 当前页开始的元素量
        map.put("beginNumber", (offset + 1));
        // 当前页结束的元素量
        map.put("endNumber", (offset + page.getContent().size() + 1));
        // 是否有前一页
        map.put("hasPrevious", page.hasPrevious());
        // 是否有后一页
        map.put("hasNext", page.hasNext());
        // 总页数
        map.put("totalPage", page.getTotalPages());
        // 总数据量
        map.put("totalNumber", page.getTotalElements());
        return map;
    }
}
