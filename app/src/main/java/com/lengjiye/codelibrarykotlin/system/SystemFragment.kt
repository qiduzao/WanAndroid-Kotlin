package com.lengjiye.codelibrarykotlin.system

import com.lengjiye.base.BaseFragment
import com.lengjiye.codelibrarykotlin.R
import com.lengjiye.codelibrarykotlin.databinding.FragmentHomeTestBinding
import com.lengjiye.codelibrarykotlin.home.viewmodel.HomeViewMode
import com.lengjiye.tools.LogTool

class SystemFragment : BaseFragment<FragmentHomeTestBinding, HomeViewMode>() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_home_test
    }

    override fun getViewModel(): HomeViewMode {
        return HomeViewMode(getBaseActivity().application)
    }

    override fun bindViewModel() {
        getBinding().viewModel = mViewModel
    }

    override fun getBinding(): FragmentHomeTestBinding {
        return mBinding
    }
}