package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import android.os.Bundle

class ViewUserMeActivity : ToolbarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_user_me)

        initToolbar()
    }

    override fun onBackPressed() {
        val intent = Intent(this@ViewUserMeActivity, AuthUserActivity ::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }
}
