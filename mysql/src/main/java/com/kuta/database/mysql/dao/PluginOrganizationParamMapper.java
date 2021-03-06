/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.database.mysql.dao;

import com.kuta.database.mysql.pojo.PluginOrganizationParam;
import com.kuta.database.mysql.pojo.PluginOrganizationParamExample;
import com.kuta.database.mysql.pojo.PluginOrganizationParamKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginOrganizationParamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-03-24 18:00:39
     */
    long countByExample(PluginOrganizationParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-03-24 18:00:39
     */
    int deleteByExample(PluginOrganizationParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-03-24 18:00:39
     */
    int deleteByPrimaryKey(PluginOrganizationParamKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-03-24 18:00:39
     */
    int insert(PluginOrganizationParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-03-24 18:00:39
     */
    int insertSelective(PluginOrganizationParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-03-24 18:00:39
     */
    List<PluginOrganizationParam> selectByExample(PluginOrganizationParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-03-24 18:00:39
     */
    PluginOrganizationParam selectByPrimaryKey(PluginOrganizationParamKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-03-24 18:00:39
     */
    int updateByExampleSelective(@Param("record") PluginOrganizationParam record, @Param("example") PluginOrganizationParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-03-24 18:00:39
     */
    int updateByExample(@Param("record") PluginOrganizationParam record, @Param("example") PluginOrganizationParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-03-24 18:00:39
     */
    int updateByPrimaryKeySelective(PluginOrganizationParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-03-24 18:00:39
     */
    int updateByPrimaryKey(PluginOrganizationParam record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table BS_Plugin_Org_Param
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<PluginOrganizationParam> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-03-24 18:00:39
     */
    int batchUpdate(@Param("recordList") List<PluginOrganizationParam> recordList);
}