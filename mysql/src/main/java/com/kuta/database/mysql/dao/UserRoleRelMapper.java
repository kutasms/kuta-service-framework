/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.database.mysql.dao;

import com.kuta.database.mysql.pojo.UserRoleRelExample;
import com.kuta.database.mysql.pojo.UserRoleRelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_UserRoleRel
     * @date 2021-03-24 18:00:39
     */
    long countByExample(UserRoleRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_UserRoleRel
     * @date 2021-03-24 18:00:39
     */
    int deleteByExample(UserRoleRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_UserRoleRel
     * @date 2021-03-24 18:00:39
     */
    int deleteByPrimaryKey(UserRoleRelKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_UserRoleRel
     * @date 2021-03-24 18:00:39
     */
    int insert(UserRoleRelKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_UserRoleRel
     * @date 2021-03-24 18:00:39
     */
    int insertSelective(UserRoleRelKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_UserRoleRel
     * @date 2021-03-24 18:00:39
     */
    List<UserRoleRelKey> selectByExample(UserRoleRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_UserRoleRel
     * @date 2021-03-24 18:00:39
     */
    int updateByExampleSelective(@Param("record") UserRoleRelKey record, @Param("example") UserRoleRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_UserRoleRel
     * @date 2021-03-24 18:00:39
     */
    int updateByExample(@Param("record") UserRoleRelKey record, @Param("example") UserRoleRelExample example);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table BS_UserRoleRel
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<UserRoleRelKey> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_UserRoleRel
     * @date 2021-03-24 18:00:39
     */
    int batchUpdate(@Param("recordList") List<UserRoleRelKey> recordList);
}