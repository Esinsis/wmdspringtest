package com.wmd.springtest.validation.requestdomain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author wengmd
 * @date 19-1-15 下午5:14
 */
public class ValidInst implements Serializable {
    @Size(min = 3, max = 5)
    private String id;
    @NotBlank
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
