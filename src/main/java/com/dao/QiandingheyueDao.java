package com.dao;

import com.entity.QiandingheyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QiandingheyueView;

/**
 * 签订合约 Dao 接口
 *
 * @author 
 */
public interface QiandingheyueDao extends BaseMapper<QiandingheyueEntity> {

   List<QiandingheyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
