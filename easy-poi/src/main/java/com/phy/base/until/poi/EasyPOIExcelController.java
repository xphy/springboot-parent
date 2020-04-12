package com.phy.base.until.poi;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/5 15:13
 * @description：easy POI导入导出excel
 * @modified By：
 * @version: 1$
 */
@RestController
//@Api(value="多sheet数据导入及导出",tags="多sheet数据导入及导出")
@RequestMapping("/easyPoi")
@Slf4j
public class EasyPOIExcelController {

    @GetMapping("/exportExcel")
    public void export(HttpServletResponse response) {
        System.out.println(1);
        // 模拟从数据库获取需要导出的数据
        List<ExcelBean> listAll = new ArrayList();
        List<ExcelBean> list = Lists.newArrayList();
        ExcelBean user = new ExcelBean();

        // 导出操作
        EasyPoiUtil.exportExcel(listAll,  "easypoi导出功能", "导出sheet1", ExcelBean.class,"",response);
//        ExcelUtils.exportExcel(personList, "easypoi导出功能", "导出sheet1", User.class, "测试user.xls", response);

    }
    @PostMapping("/importExcel")
    public String importExcel2(@RequestParam("file") MultipartFile file) {
        ImportParams importParams = new ImportParams();
        // 数据处理
        importParams.setHeadRows(1);
        importParams.setTitleRows(1);
        // 需要验证
        importParams.setNeedVerfiy(false);

        try {
            ExcelImportResult<ExcelBean> result = ExcelImportUtil.importExcelMore(file.getInputStream(), ExcelBean.class,
                    importParams);
            List<ExcelBean> userList = result.getList();
            for (ExcelBean User : userList) {
                 System.out.println(User);
                log.info("从Excel导入数据到数据库的详细为 ：{}", JSONObject.toJSONString(User));
                //TODO 将导入的数据做保存数据库操作
            }
            log.info("从Excel导入数据一共 {} 行 ", userList.size());
        } catch (IOException e) {
            log.error("导入失败：{}", e.getMessage());
        } catch (Exception e1) {
            log.error("导入失败：{}", e1.getMessage());
        }
        return "导入成功";
    }


}
