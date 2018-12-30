package com.tistory.deque.kotlinmvvmsample.di

import com.tistory.deque.kotlinmvvmsample.MainSearchRecyclerViewAdapter
import com.tistory.deque.kotlinmvvmsample.model.DataModel
import com.tistory.deque.kotlinmvvmsample.model.DataModelImpl
import com.tistory.deque.kotlinmvvmsample.model.service.KakaoSearchService
import com.tistory.deque.kotlinmvvmsample.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


var retrofitPart = module {
    single<KakaoSearchService> {
        Retrofit.Builder()
            .baseUrl("https://dapi.kakao.com")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(KakaoSearchService::class.java)
    }
}

var adapterPart = module {
    factory {
        MainSearchRecyclerViewAdapter()
    }
}

var modelPart = module {
    factory<DataModel> {
        DataModelImpl(get())
    }
}

var viewModelPart = module {
    viewModel {
        MainViewModel(get())
    }
}

var myDiModule = listOf(retrofitPart, adapterPart, modelPart, viewModelPart)