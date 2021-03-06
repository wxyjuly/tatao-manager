package com.kuangkee.search.pojo;

import java.util.Date;

public class UserSearchLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_search_log.log_id
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    private Integer logId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_search_log.user_id
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_search_log.brand_id
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    private Integer brandId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_search_log.brand_name
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    private String brandName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_search_log.original_content
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    private String originalContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_search_log.search_content
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    private String searchContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_search_log.user_name
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_search_log.phone
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_search_log.status
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_search_log.is_match
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    private String isMatch;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_search_log.longitude
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    private String longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_search_log.latitude
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    private String latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_search_log.ip
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_search_log.create_time
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_search_log.update_time
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_search_log.log_id
     *
     * @return the value of tb_user_search_log.log_id
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_search_log.log_id
     *
     * @param logId the value for tb_user_search_log.log_id
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_search_log.user_id
     *
     * @return the value of tb_user_search_log.user_id
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_search_log.user_id
     *
     * @param userId the value for tb_user_search_log.user_id
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_search_log.brand_id
     *
     * @return the value of tb_user_search_log.brand_id
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_search_log.brand_id
     *
     * @param brandId the value for tb_user_search_log.brand_id
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_search_log.brand_name
     *
     * @return the value of tb_user_search_log.brand_name
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_search_log.brand_name
     *
     * @param brandName the value for tb_user_search_log.brand_name
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_search_log.original_content
     *
     * @return the value of tb_user_search_log.original_content
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public String getOriginalContent() {
        return originalContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_search_log.original_content
     *
     * @param originalContent the value for tb_user_search_log.original_content
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public void setOriginalContent(String originalContent) {
        this.originalContent = originalContent == null ? null : originalContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_search_log.search_content
     *
     * @return the value of tb_user_search_log.search_content
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public String getSearchContent() {
        return searchContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_search_log.search_content
     *
     * @param searchContent the value for tb_user_search_log.search_content
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public void setSearchContent(String searchContent) {
        this.searchContent = searchContent == null ? null : searchContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_search_log.user_name
     *
     * @return the value of tb_user_search_log.user_name
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_search_log.user_name
     *
     * @param userName the value for tb_user_search_log.user_name
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_search_log.phone
     *
     * @return the value of tb_user_search_log.phone
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_search_log.phone
     *
     * @param phone the value for tb_user_search_log.phone
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_search_log.status
     *
     * @return the value of tb_user_search_log.status
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_search_log.status
     *
     * @param status the value for tb_user_search_log.status
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_search_log.is_match
     *
     * @return the value of tb_user_search_log.is_match
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public String getIsMatch() {
        return isMatch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_search_log.is_match
     *
     * @param isMatch the value for tb_user_search_log.is_match
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public void setIsMatch(String isMatch) {
        this.isMatch = isMatch == null ? null : isMatch.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_search_log.longitude
     *
     * @return the value of tb_user_search_log.longitude
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_search_log.longitude
     *
     * @param longitude the value for tb_user_search_log.longitude
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_search_log.latitude
     *
     * @return the value of tb_user_search_log.latitude
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_search_log.latitude
     *
     * @param latitude the value for tb_user_search_log.latitude
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_search_log.ip
     *
     * @return the value of tb_user_search_log.ip
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_search_log.ip
     *
     * @param ip the value for tb_user_search_log.ip
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_search_log.create_time
     *
     * @return the value of tb_user_search_log.create_time
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_search_log.create_time
     *
     * @param createTime the value for tb_user_search_log.create_time
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_search_log.update_time
     *
     * @return the value of tb_user_search_log.update_time
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_search_log.update_time
     *
     * @param updateTime the value for tb_user_search_log.update_time
     *
     * @mbggenerated Sat Jan 06 16:55:39 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}