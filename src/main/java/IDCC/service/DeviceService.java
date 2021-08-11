package IDCC.service;

import java.util.Map;

public interface DeviceService {
    //统计所有硬件设备数量
    public Map<String, Integer> countAllDeviceNum();
}
