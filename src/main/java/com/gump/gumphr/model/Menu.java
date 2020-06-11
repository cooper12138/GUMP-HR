package com.gump.gumphr.model;

import lombok.Data;

import java.util.List;

/**
 * @author gump(zzc)
 * @version 1.0
 * @date 2020/6/11 23:19
 */
@Data
public class Menu {

    private Integer id;

    private String url;

    private String path;

    private String component;

    private String name;

    private List<Role> roleList;
}
