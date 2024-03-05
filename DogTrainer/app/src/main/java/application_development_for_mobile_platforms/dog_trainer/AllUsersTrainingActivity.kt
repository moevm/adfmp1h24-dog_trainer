package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import android.os.Bundle

class AllUsersTrainingActivity : ToolbarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_users_training)

        initToolbar()
    }

    override fun onBackPressed() {
        val intent = Intent(this@AllUsersTrainingActivity, ViewUserMeActivity ::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }
}