package cn.deceiver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-10-21 19:44:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 697449617120182796L;

    private Integer id;

    private String name;

    private String pass;

    private String gender;

    private String addr;

    private Integer type;
}