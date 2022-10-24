package com.qingge.springboot.service;

import com.qingge.springboot.common.Result;
import com.qingge.springboot.controller.dto.UserDTO;
import com.qingge.springboot.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 用户基本信息表 服务类
 * </p>
 *
 * @author 青哥哥
 * @since 2022-10-03
 */
public interface IUserService extends IService<User> {

    UserDTO login(UserDTO userDTO);

    User register(UserDTO userDTO);

}
