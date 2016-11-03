package com.wenhao.edu.web.boss.base;


import com.wenhao.edu.faced.user.entity.PmsUser;

public interface UserLoginedAware {

	/**
	 * 取得登录的用户
	 * 
	 * @return
	 */
    PmsUser getLoginedUser();
}
