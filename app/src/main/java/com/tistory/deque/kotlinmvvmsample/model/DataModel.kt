package com.tistory.deque.kotlinmvvmsample.model

import com.tistory.deque.kotlinmvvmsample.model.enum.KakaoSearchSortEnum
import com.tistory.deque.kotlinmvvmsample.model.response.ImageSearchResponse
import io.reactivex.Single

interface DataModel {
    fun getData(query:String, sort: KakaoSearchSortEnum, page:Int, size:Int): Single<ImageSearchResponse>
}