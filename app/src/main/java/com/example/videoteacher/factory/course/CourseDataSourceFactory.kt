package com.olm.magtapp.data.factory.course

import androidx.paging.DataSource
import com.example.videoteacher.datasource.CourseOfflineDataSource
import com.example.videoteacher.datasource.network.CourseService
import com.example.videoteacher.model.Course
import kotlinx.coroutines.CoroutineScope

class CourseDataSourceFactory
    (
    val query:String,
    val service: CourseService?,
    val scope: CoroutineScope,
    val offline: CourseOfflineDataSource
): DataSource.Factory<Int, Course>() {
    override fun create(): DataSource<Int, Course> = CourseDataSourceOnline(query,service!!,scope, offline)

}
