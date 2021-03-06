package IDCC.controller;

import IDCC.bean.Account;
import IDCC.bean.Achievement;
import IDCC.service.AchievementServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

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
    private AchievementServiceImpl achievementService;

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
}
