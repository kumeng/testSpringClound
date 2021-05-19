package fistpac.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/test")
@Api("类注解")
public class fisrtSwaggerConroller {
	
	/**
	 *  - @ApiParam()用于参数说明 
      - @ApiModel()用于实体类 
      - @ApiModelProperty用于实体类属性 
	 * @return
	 */
	
    @ApiOperation(value="方法注解",notes = "第一个测试api")
    @PostMapping(value = "/hello")
    public Object hello()
    {
    	JSONObject obj1 = new JSONObject();
    	obj1.put("key", "第三方 ");
    	return obj1;
    }
}
