package com.tistory.deque.kotlinmvvmsample.di

import com.tistory.deque.kotlinmvvmsample.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

var viewModelPart = module {
    viewModel {
        MainViewModel()
    }
}

var myDiModule = listOf(viewModelPart)