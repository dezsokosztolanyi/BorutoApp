package com.kosztolanyi.borutoapp.di

import android.content.Context
import androidx.room.Room
import com.kosztolanyi.borutoapp.data.local.BorutoDatabase
import com.kosztolanyi.borutoapp.util.Constants.BORUTO_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context, BorutoDatabase::class.java, BORUTO_DATABASE).build()
}