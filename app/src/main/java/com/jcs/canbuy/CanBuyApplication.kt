package com.jcs.canbuy

import android.app.Application
import com.jcs.canbuy.data.database.CanBuyDatabase
import com.jcs.canbuy.repository.ProductRepository
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

/**
 * Created by Jardson Costa on 05/11/2021.
 */

@HiltAndroidApp
class CanBuyApplication : Application() {
}