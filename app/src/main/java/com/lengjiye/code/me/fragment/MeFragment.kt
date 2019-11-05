package com.lengjiye.code.me.fragment

import com.lengjiye.base.fragment.BaseFragment
import com.lengjiye.code.R
import com.lengjiye.code.application.CodeApplication
import com.lengjiye.code.databinding.FragmentMeBinding
import com.lengjiye.code.me.viewmodel.MeViewModel

/**
 * @Author: lz
 * @Date: 2019-11-05
 * @Description:
 */
class MeFragment : BaseFragment<FragmentMeBinding, MeViewModel>() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_me
    }

    override fun getViewModel(): MeViewModel {
        return MeViewModel(CodeApplication.instance)
    }

    override fun bindViewModel() {
        getBinding().viewModel = mViewModel
    }

    override fun getBinding(): FragmentMeBinding {
        return mBinding
    }
}