package com.example.mybatisgeneratordemo.mapper;

import com.example.mybatisgeneratordemo.model.Message;
import com.example.mybatisgeneratordemo.model.MessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface MessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    long countByExample(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    int deleteByExample(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    @Delete({
        "delete from message",
        "where msg_id = #{msgId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer msgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    @Insert({
        "insert into message (msg_id, msg_text, ",
        "msg_summary)",
        "values (#{msgId,jdbcType=INTEGER}, #{msgText,jdbcType=VARCHAR}, ",
        "#{msgSummary,jdbcType=VARCHAR})"
    })
    int insert(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    int insertSelective(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    List<Message> selectByExampleWithRowbounds(MessageExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    List<Message> selectByExample(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "msg_id, msg_text, msg_summary",
        "from message",
        "where msg_id = #{msgId,jdbcType=INTEGER}"
    })
    @ResultMap("com.example.mybatisgeneratordemo.mapper.MessageMapper.BaseResultMap")
    Message selectByPrimaryKey(Integer msgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    @Update({
        "update message",
        "set msg_text = #{msgText,jdbcType=VARCHAR},",
          "msg_summary = #{msgSummary,jdbcType=VARCHAR}",
        "where msg_id = #{msgId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Message record);
}