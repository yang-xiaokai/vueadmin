package com.vueadmin.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 我的公众号：MarkerHub
 * @since 2021-05-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysMenu extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer parentId;

    private String name;

    private String path;

    private String perms;

    private String component;

    private Integer type;

    private String icon;

    @TableField("orderNum")
    private Integer orderNum;

    private Integer status;


}
