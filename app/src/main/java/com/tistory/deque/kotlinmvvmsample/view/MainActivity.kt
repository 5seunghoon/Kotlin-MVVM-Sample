package com.tistory.deque.kotlinmvvmsample.view

import com.tistory.deque.kotlinmvvmsample.R
import com.tistory.deque.kotlinmvvmsample.base.BaseKotlinActivity
import com.tistory.deque.kotlinmvvmsample.databinding.ActivityMainBinding
import com.tistory.deque.kotlinmvvmsample.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseKotlinActivity<ActivityMainBinding, MainViewModel>() {
    override val layoutResourceId: Int
        get() = R.layout.activity_main
    override val viewModel: MainViewModel by viewModel()

    override fun initStartView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initDataBinding() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initAfterBinding() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
