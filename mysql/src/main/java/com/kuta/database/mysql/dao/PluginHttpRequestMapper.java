/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.database.mysql.dao;

import com.kuta.database.mysql.pojo.PluginHttpRequest;
import com.kuta.database.mysql.pojo.PluginHttpRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginHttpRequestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-03-24 18:00:39
     */
    long countByExample(PluginHttpRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-03-24 18:00:39
     */
    int deleteByExample(PluginHttpRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-03-24 18:00:39
     */
    int deleteByPrimaryKey(Long phrid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-03-24 18:00:39
     */
    int insert(PluginHttpRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-03-24 18:00:39
     */
    int insertSelective(PluginHttpRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-03-24 18:00:39
     */
    List<PluginHttpRequest> selectByExample(PluginHttpRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-03-24 18:00:39
     */
    PluginHttpRequest selectByPrimaryKey(Long phrid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-03-24 18:00:39
     */
    int updateByExampleSelective(@Param("record") PluginHttpRequest record, @Param("example") PluginHttpRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-03-24 18:00:39
     */
    int updateByExample(@Param("record") PluginHttpRequest record, @Param("example") PluginHttpRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-03-24 18:00:39
     */
    int updateByPrimaryKeySelective(PluginHttpRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-03-24 18:00:39
     */
    int updateByPrimaryKey(PluginHttpRequest record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table BS_Plugin_Http_Request
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<PluginHttpRequest> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-03-24 18:00:39
     */
    int batchUpdate(@Param("recordList") List<PluginHttpRequest> recordList);
}