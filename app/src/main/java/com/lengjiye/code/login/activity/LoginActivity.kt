package com.lengjiye.code.login.activity

import com.lengjiye.base.BaseActivity
import com.lengjiye.code.R
import com.lengjiye.code.databinding.ActivityLoginBinding
import com.lengjiye.code.login.viewmodel.LoginViewModel

/**
 * @Author: lz
 * @Date: 2019-11-05
 * @Description:
 */
class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>() {

    override fun getLayoutId(): Int {
        return R.layout.activity_login
    }

    override fun getViewModel(): LoginViewModel {
        return LoginViewModel(application)
    }

    override fun bindViewModel() {
        getBinding().viewModel = mViewModel
    }

    /**
     * 获取 mBinding
     */
    override fun getBinding(): ActivityLoginBinding {
        return mBinding
    }
}
