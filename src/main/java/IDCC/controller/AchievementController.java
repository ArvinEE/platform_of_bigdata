package IDCC.controller;

import IDCC.bean.Achievement;
import IDCC.bean.Mygroup;
import IDCC.service.AchievementService;
import IDCC.service.DeviceService;
import IDCC.service.GroupService;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
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
 * @description: 控制成果信息的操作
 * @author: Peng Chong
 * @time: 2020/12/10 16:35
 */
@Controller
@Api(value = "成果信息操作控制层")
@RequestMapping("/achievement")

public class AchievementController {
    @Autowired
    private AchievementService achievementService;
    @Autowired
    private GroupService groupService;
    @Autowired
    private DeviceService deviceService;

    /**
     * @description: 控制增加单条成果信息
     * @return: SUCCESS/FAILE
     * @author: Peng Chong
     * @time: 2020/12/10 16:41
     */
    @PostMapping("/addAchievement")
    @ApiOperation(value = "增加单条成果信息",notes = "18：:20 已测试")
    @ResponseBody
    public String addAchievement(@ModelAttribute Achievement achievement, HttpServletRequest httpServletRequest){
        if(achievementService.addAchievement(achievement) == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 删除单条成果信息
     * @return: SUCCESS/FAILE
     * @author: Peng Chong
     * @time: 2020/12/10 16:48
     */
    @PostMapping("/delAchievement")
    @ApiOperation(value = "删除单条成果信息",notes = "未测试")
    @ResponseBody
    public String delAchievement(int achievementId){
        if (achievementService.delAchievement(achievementId) == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 查找单条成果信息
     * @return: SUCCESS/FAILE
     * @author: Peng Chong
     * @time: 2020/12/10 16:50
     */
    @GetMapping("/searchAchievement")
    @ApiOperation(value = "查找单条成果信息",notes = "未测试")
    @ResponseBody
    public String searchAchievement(int achievementId, HttpServletRequest httpServletRequest){
        Achievement achievement = achievementService.searchAchievement(achievementId);
        if (achievement != null){
            HttpSession session = httpServletRequest.getSession();
            session.setAttribute("achievement",achievement);
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 修改单条成果信息
     * @return: SUCCESS/FAILE
     * @author: Peng Chong
     * @time: 2020/12/10 16:55
     */
    @PostMapping("/updateAchievement")
    @ApiOperation(value = "修改单条成果信息",notes = "未测试")
    @ResponseBody
    public String updateAchievement(@ModelAttribute Achievement achievement, HttpServletRequest httpServletRequest){
        if (achievementService.updateAchievement(achievement) == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 控制模糊查找成果信息（根据Id）
     * @return: SUCCESS/FAILE
     * @author: Peng Chong
     * @time: 2020/12/23 17:56
     */
    @GetMapping("/searchAchievementByExample")
    @ApiOperation(value = "模糊查找成果信息",notes = "未测试")
    @ResponseBody
    public List searchAchievementByExample(int condition, Model model){
        List<Achievement> achievementList = new ArrayList<>();
        achievementList = achievementService.searchAchievementByExample(condition);
        return achievementList;
    }

    /**
     * @description: 软、硬件成果数量统计
     * @param: 无
     * @return: 软件、硬件成果数量（json格式）
     * @author: Lai ZhouHao
     * @time: 2021/8/11 15:24
    **/
    @GetMapping("/countNumOfSoftwareAndDevice")
    @ApiOperation(value = "软、硬件成果统计",notes = "未测试")
    @ResponseBody
    public String countNumOfSoftwareAndDevice() throws JsonProcessingException {
        Map<String, Integer> map = new HashMap<>();
        List<Achievement> achievements = achievementService.searchAchievementByExample();
        map = deviceService.countAllDeviceNum();
        map.put("软件平台", achievements.size());
        return JSONObject.toJSONString(map);
    }

    /**
     * @description: 统计各著作成果数量及总数
     * @return: json
     * @author: Peng Chong
     * @time: 2021/8/11 19:25
     */
    @GetMapping("/countByWriting")
    @ApiOperation(value = "统计各著作成果数量及总数",notes = "未测试")
    @ResponseBody
    public String countByWriting(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();
        countMap = achievementService.countByWriting();
        String json = JSONObject.toJSONString(countMap);
        return json;
    }

    /**
     * @description: 统计论文和授权专利总数
     * @return: json
     * @author: Peng Chong
     * @time: 2021/8/11 19:25
     */
    @GetMapping("/countPaperAndPatent")
    @ApiOperation(value = "统计论文和授权专利总数",notes = "未测试")
    @ResponseBody
    public String countPaperAndPatent(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();

        countMap = achievementService.countPaperAndPatent();
        String json = JSONObject.toJSONString(countMap);
        return json;
    }

    /**
     * @description: 统计各团队论文数
     * @return: json
     * @author: Peng Chong
     * @time: 2021/8/11 20:52
     */
    @GetMapping("/countPaperByGroup")
    @ApiOperation(value = "统计各团队论文数",notes = "未测试")
    @ResponseBody
    public String countPaperByGroup(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();

        countMap = achievementService.countPaperByGroup();
        String json = JSONObject.toJSONString(countMap);
        return json;
    }

    /**
     * @description: 统计各团队授权专利数
     * @return: json
     * @author: Peng Chong
     * @time: 2021/8/11 20:52
     */
    @GetMapping("/countPatentByGroup")
    @ApiOperation(value = "统计各团队授权专利数",notes = "未测试")
    @ResponseBody
    public String countPatentByGroup(){

        Map<String,Integer> countMap = new HashMap<String, Integer>();

        countMap = achievementService.countPatentByGroup();
        String json = JSONObject.toJSONString(countMap);
        return json;
    }
}
