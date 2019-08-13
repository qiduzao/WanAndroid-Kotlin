package com.lengjiye.codelibrarykotlin.home.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lengjiye.base.recycleview.BaseAdapter
import com.lengjiye.base.recycleview.BaseViewHolder
import com.lengjiye.codelibrarykotlin.R
import com.lengjiye.codelibrarykotlin.databinding.ItemHomeBinding
import com.lengjiye.codelibrarykotlin.home.model.HomeModel

class HomeFragmentAdapter constructor(context: Context, models: MutableList<HomeModel>?) :
    BaseAdapter<HomeModel, HomeFragmentAdapter.HomeModelHolder>(context, models) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeModelHolder {
        val binding = DataBindingUtil.inflate<ItemHomeBinding>(
            mLayoutInflater, R.layout.item_home, parent, false
        )
        return HomeModelHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeModelHolder, position: Int, item: HomeModel?) {
        item?.let {
            holder.binding.tvText.text = item.title
        }
    }

    class HomeModelHolder(binding: ItemHomeBinding) : BaseViewHolder<ItemHomeBinding>(binding)
}