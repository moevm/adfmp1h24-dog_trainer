package application_development_for_mobile_platforms.dog_trainer

import android.os.Bundle

class ViewUserGuestModeActivity : ToolbarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_user_guest_mode)

        initToolbar()
    }
}