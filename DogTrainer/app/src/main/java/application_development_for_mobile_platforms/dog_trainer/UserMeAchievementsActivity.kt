package application_development_for_mobile_platforms.dog_trainer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class UserMeAchievementsActivity : ToolbarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_me_achievements)

        initToolbar()
    }
}