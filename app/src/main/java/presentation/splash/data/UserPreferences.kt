package presentation.splash.data

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import jakarta.inject.Inject
import javax.inject.Singleton


@Singleton
class UserPreferences @Inject constructor (
    @ApplicationContext private val context: Context){
    private val prefs = context.getSharedPreferences("user_prefs", Context.MODE_PRIVATE)

    fun hasSeenWelcome(): Boolean {
        return prefs.getBoolean("has_seen_welcome", false)
    }

    fun setHasSeenWelcome(){
        prefs.edit().putBoolean("has_seen_welcome", true).apply()
    }
}