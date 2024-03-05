package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import android.os.Bundle

class UserAchievementsActivity : ToolbarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_achievements)

        initToolbar()
    }

    override fun onBackPressed() {
        val intent = Intent(this@UserAchievementsActivity, ViewUserGuestModeActivity ::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }
}