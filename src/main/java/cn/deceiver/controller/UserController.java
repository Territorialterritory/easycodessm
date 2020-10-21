package cn.deceiver.controller;

import cn.deceiver.entity.User;
import cn.deceiver.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-10-21 19:44:03
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

    /**
     * 分页
     * @param offset
     * @param limit
     * @return
     */
    @GetMapping("/limit/{offset}/{limit}")
    public List<User> limit(@PathVariable("offset")int offset,@PathVariable("limit") int limit){
        return userService.queryAllByLimit(offset, limit);
    }

    /**
     * @PostMapping("/insert")：利用postman测试
     * 添加数据
     * @param user
     * @return
     */
    @GetMapping("/insert")
    public User insert(User user){
        return userService.insert(user);
    }

    /**
     * @PutMapping("/update")：利用postman测试
     * 修改数据
     * @param user
     * @return
     */
    @GetMapping("/update")
    public User update(User user){
        return userService.update(user);
    }

    /**
     * @DeleteMapping("/delete")
     * 删除数据
     * @param id
     * @return
     */
    @GetMapping("/delete/{id}")
    public Boolean delete(@PathVariable("id") int id){
        return userService.deleteById(id);
    }
}