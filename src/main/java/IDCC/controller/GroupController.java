package IDCC.controller;

import IDCC.bean.Mygroup;
import IDCC.service.GroupService;
import IDCC.service.GroupServiceImpl;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 控制团队信息的操作
 * @author: Peng Chong
 * @time: 2020/12/10 18:48
 */
@Controller
@Api(value = "团队信息操作控制层")
@RequestMapping("/group")

public class GroupController {
    @Autowired
    private GroupService groupService;

    /**
     * @description: 控制增加单条团队信息
     * @return: SUCCESS/FAILE
     * @author: Peng Chong
     * @time: 2020/12/10 18:51
     */
    @PostMapping("/addGroup")
    @ApiOperation(value = "增加单条团队信息",notes = "未测试")
    @ResponseBody
    public String addGroup(@ModelAttribute Mygroup mygroup, HttpServletRequest httpServletRequest){
        if(groupService.addGroup(mygroup) == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 删除单条团队信息
     * @return: SUCCESS/FAILE
     * @author: Peng Chong
     * @time: 2020/12/10 18:56
     */
    @PostMapping("/delGroup")
    @ApiOperation(value = "删除单条团队信息",notes = "未测试")
    @ResponseBody
    public String delGroup(int groupId){
        if (groupService.delGroup(groupId) == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 查找单条团队信息
     * @return: SUCCESS/FAILE
     * @author: Peng Chong
     * @time: 2020/12/10 18:57
     */
    @GetMapping("/searchGroup")
    @ApiOperation(value = "查找单条团队信息",notes = "未测试")
    @ResponseBody
    public String searchGroup(int groupId, HttpServletRequest httpServletRequest){
        Mygroup group = groupService.searchGroup(groupId);
        if (group != null){
            HttpSession session = httpServletRequest.getSession();
            session.setAttribute("group",group);
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 修改单条团队信息
     * @return: SUCCESS/FAILE
     * @author: Peng Chong
     * @time: 2020/12/10 18:58
     */
    @PostMapping("/updateGroup")
    @ApiOperation(value = "修改单条团队信息",notes = "未测试")
    @ResponseBody
    public String updateGroup(@ModelAttribute Mygroup group, HttpServletRequest httpServletRequest){
        if (groupService.updateGroup(group) == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 控制模糊查找团队信息（根据Id）
     * @return: SUCCESS/FAILE
     * @author: Peng Chong
     * @time: 2020/12/23 18:40
     */
    @GetMapping("/searchGroupByExample")
    @ApiOperation(value = "模糊查找团队信息",notes = "未测试")
    @ResponseBody
    public List searchAchievementByExample(int condition, Model model){
        List<Mygroup> groupsList = new ArrayList<>();
        groupsList = groupService.searchGroupByExample(condition);
        return groupsList;
    }

    /**
     * @description: 获取所有团队信息
     * @return: List
     * @author: Peng Chong
     * @time: 2021/8/9 16:38
     */
    @GetMapping("/getAllGroups")
    @ApiOperation(value = "获取所有团队信息",notes = "未测试")
    @ResponseBody
    public List getAllGroups(){
        List<Mygroup> groupsList = new ArrayList<>();
        groupsList = groupService.getAllGroups();
        return groupsList;
    }

    /**
     * @description: 获取各团队规模
     * @return: List
     * @author: Peng Chong
     * @time: 2021/8/10 14:49
     */
    @GetMapping("/getGroupsScale")
    @ApiOperation(value = "获取各团队规模",notes = "未测试")
    @ResponseBody
    public String getGroupsScale(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();

        countMap = groupService.getGroupsScale();
        String json = JSONObject.toJSONString(countMap);
        return json;
    }

}
