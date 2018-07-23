package com.kajie88.bootexplore.controller;

import com.kajie88.base.dao.UserMapper;
import com.kajie88.base.dto.req.BaseReqDTO;
import com.kajie88.base.dto.resp.BaseRespDTO;
import com.kajie88.bootexplore.learntest.LearnTest;
import com.kajie88.user.domain.UserDomain;
import com.kajie88.user.service.UserService;
import com.kajie88.util.excel.ReadWriteExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author kajie
 * Date: 2018/5/18 0018
 * Time: 9:49
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private LearnTest lt;
    @Autowired
    private UserService userService;
    @RequestMapping("showParam")
    public String testInter(){
        UserDomain userDomain = new UserDomain();
        userDomain.getPageInfo().setPageNum(1);
        userDomain.getPageInfo().setPageSize(5);
        List<UserDomain> userList = userService.getUserList(userDomain);
//        int number = 1/0;
//        throw new CommonException(CommonError.SYSTEM_ERROR,"111");
        return "name:"+lt.getName()+";pwd:"+lt.getPwd();
    }
    @RequestMapping("readExcel")
    public BaseRespDTO<Object> readExcel(@RequestBody BaseReqDTO<Map<String, String>> reqDTO){
//        int a = 1/0;
        File f = new File("D://test.xls");
        try {
            Map<String,Object> list = ReadWriteExcel.readExcel(f,0);
            System.out.println(list.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        BaseRespDTO<Object> respDTO = new BaseRespDTO<>();
        respDTO.setData("hello word222");
        return respDTO;
    }

    @RequestMapping(value = "receiveExcel")
    public BaseRespDTO<Object> changeUserPhone(HttpServletRequest request, MultipartFile file) throws Exception {
//        int a = 1/0;

        String filename = file.getOriginalFilename();
        String filesuff = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);

//        File f = new File("/workspaces/temp/temp." + filename);
        File f = new File("D://temp." + filename);
        file.transferTo(f);
        Map<String,Object> list = ReadWriteExcel.readExcel(f,0);
        BaseRespDTO<Object> respDTO = new BaseRespDTO<>();
        respDTO.setData(list);
        return respDTO;
    }
}
