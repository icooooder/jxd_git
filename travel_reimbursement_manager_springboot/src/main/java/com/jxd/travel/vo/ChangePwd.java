package com.jxd.travel.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ChangePwd
 * @Description TODO
 * @Author LiJian
 * @Date 2023/2/5
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChangePwd {
    private Integer uid;
    private String oldPwd;
    private String newPwd;
    private String confirmPwd;
}
