package IDCC.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DeviceServiceImpl implements DeviceService{
    /**
     * @description: 统计所有硬件设备信息
     * @param: None
     * @return: Map<String, Integer>
     * @author: Lai ZhouHao
     * @time: 2021/8/11 16:14
    **/
    @Override
    public Map<String, Integer> countAllDeviceNum() {
        Map<String, Integer> map = new HashMap();

        return null;
    }
}
