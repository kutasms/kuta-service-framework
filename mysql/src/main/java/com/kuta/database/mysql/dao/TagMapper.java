/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.database.mysql.dao;

import com.kuta.database.mysql.pojo.Tag;
import com.kuta.database.mysql.pojo.TagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Tag
     * @date 2021-03-24 18:00:39
     */
    long countByExample(TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Tag
     * @date 2021-03-24 18:00:39
     */
    int deleteByExample(TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Tag
     * @date 2021-03-24 18:00:39
     */
    int deleteByPrimaryKey(Long tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Tag
     * @date 2021-03-24 18:00:39
     */
    int insert(Tag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Tag
     * @date 2021-03-24 18:00:39
     */
    int insertSelective(Tag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Tag
     * @date 2021-03-24 18:00:39
     */
    List<Tag> selectByExample(TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Tag
     * @date 2021-03-24 18:00:39
     */
    Tag selectByPrimaryKey(Long tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Tag
     * @date 2021-03-24 18:00:39
     */
    int updateByExampleSelective(@Param("record") Tag record, @Param("example") TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Tag
     * @date 2021-03-24 18:00:39
     */
    int updateByExample(@Param("record") Tag record, @Param("example") TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Tag
     * @date 2021-03-24 18:00:39
     */
    int updateByPrimaryKeySelective(Tag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Tag
     * @date 2021-03-24 18:00:39
     */
    int updateByPrimaryKey(Tag record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table BS_Tag
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<Tag> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Tag
     * @date 2021-03-24 18:00:39
     */
    int batchUpdate(@Param("recordList") List<Tag> recordList);
}