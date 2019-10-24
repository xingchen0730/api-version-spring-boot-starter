Spring boot 项目 Rest API版本管理工具

采用在 url 中直接注明版本的方式调用后台对应版本接口
eg：`http://server:port/api/{version}/xxx`


Controller 代码示例

```java
@RestController
@ApiVersion
public class TestControllerV1 {

    @GetMapping("/{version}/user")
    @ApiVersion(2.1)
    public String getUser() {
        return "2.1";
    }
    
    @GetMapping("/{version}/user")
    public String getUser00() {
        return "1";
    }
}

```

1. 支持在类、方法或者接口方法上使用 `ApiVersion` 注解，优先使用距离最近的，默认版本为 1.0
2. url 上的版本只支持大版本调用，例如 v1，v2
3. 注解上的版本说明支持小版本，小版本注解支持主要是为了后台代码内部功能升级，不允许同一大版本存在多个小版本接口
4. 前台调用必须指定存在的版本，如果对应版本接口不存在，则抛出 404 






