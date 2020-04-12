package com.phy.base.until.poi;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/5 14:39
 * @description：excel的bean类
 * @modified By：
 * @version: 1$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExcelBean {
    private String uid;
    @Excel(name = "登陆名",orderNum = "0")
    private String userName;
    @Excel(name = "性名",orderNum = "0")
    private String loginName;
    @Excel(name = "密码",orderNum = "0")
    private String pwd;
    @Excel(name = "状态",orderNum = "0")
    private Integer state;
//    @Excel(name = "生日", exportFormat = "yyyy-MM-dd", orderNum = "2")
//    private Date birthday;
}
