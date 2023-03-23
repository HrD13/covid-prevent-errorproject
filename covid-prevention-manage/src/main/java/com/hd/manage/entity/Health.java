package com.hd.manage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author hd
 * @since 2023-01-30
 */
@ApiModel(value = "Health对象", description = "")
public class Health implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("学生id")
    private Long stuId;

    @ApiModelProperty("当前位置")
    private String location;

    @ApiModelProperty("健康状态：0：健康，1：疑似：有发烧、感冒、咳嗽等症状，2：阳性")
    private Boolean health;

    @ApiModelProperty("是否在校：0：在校；1：离校")
    private Boolean isLeave;

    @ApiModelProperty("疫苗接种状态：0：已完成三针接种，1：已接种一针/二针，2：未接种")
    private Boolean vaccine;

    @ApiModelProperty("逻辑删除: 0：未删除，1：已删除")
    private Boolean isDeleted;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public Boolean getHealth() {
        return health;
    }

    public void setHealth(Boolean health) {
        this.health = health;
    }
    public Boolean getIsLeave() {
        return isLeave;
    }

    public void setIsLeave(Boolean isLeave) {
        this.isLeave = isLeave;
    }
    public Boolean getVaccine() {
        return vaccine;
    }

    public void setVaccine(Boolean vaccine) {
        this.vaccine = vaccine;
    }
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Health{" +
            "id=" + id +
            ", stuId=" + stuId +
            ", location=" + location +
            ", health=" + health +
            ", isLeave=" + isLeave +
            ", vaccine=" + vaccine +
            ", isDeleted=" + isDeleted +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
