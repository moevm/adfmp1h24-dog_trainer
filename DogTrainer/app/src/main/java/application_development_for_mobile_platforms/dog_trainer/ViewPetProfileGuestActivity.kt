package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import android.os.Bundle

class ViewPetProfileGuestActivity : ToolbarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pet_profile_guest)

        initToolbar()
    }

    override fun onBackPressed() {
        val intent = Intent(this@ViewPetProfileGuestActivity, ViewListPetsGuestActivity ::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }
}