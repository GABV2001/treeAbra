package edu.ni.abra.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import edu.ni.abra.repository.TreeRepository
import edu.ni.abra.retrofit.TreeNetworkMapper
import edu.ni.abra.retrofit.TreeRetrofit
import edu.ni.abra.room.CacheMapper
import edu.ni.abra.room.TreeDao
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object RepositoryModule {
    @Singleton
    @Provides
    fun provideCatRepository(
        treeDao: TreeDao,
        treeRetrofit: TreeRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: TreeNetworkMapper
    ): TreeRepository {
        return TreeRepository(treeDao, treeRetrofit, cacheMapper, networkMapper)
    }
}