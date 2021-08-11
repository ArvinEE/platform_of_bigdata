package IDCC.service;

import IDCC.bean.Device;
import IDCC.bean.DeviceExample;
import IDCC.mapper.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DeviceServiceImpl implements DeviceService{
    @Autowired
    private DeviceMapper deviceMapper;

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
        List<Device> devices = deviceMapper.selectByExample(new DeviceExample());
        int []num = new int[4];
        for (Device device: devices) {
            String name = device.getDeviceName();
            char ch = name.charAt(name.length()-1);
            switch (ch){
                case '车':
                    num[0] += device.getDeviceNum();
                    break;
                case '机':
                    num[1] += device.getDeviceNum();
                    break;
                case '狗':
                    num[2] += device.getDeviceNum();
                    break;
                case '蛛':
                    num[3] += device.getDeviceNum();
                    break;
            }
        }
        map.put("无人车", num[0]);
        map.put("无人机", num[1]);
        map.put("四足机械狗", num[2]);
        map.put("四足蜘蛛", num[3]);
        return map;
    }
}
