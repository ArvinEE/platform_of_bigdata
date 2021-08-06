package IDCC;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

    public static void main(String[] args) throws JsonProcessingException {
        //1、创建对象
        User user = new User("zmy",20,"male");
        //2、创建jackson的核心对象 ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
        System.out.println(json);
    }
}
