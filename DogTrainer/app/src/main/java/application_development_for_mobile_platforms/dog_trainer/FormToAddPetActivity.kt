package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import android.os.Bundle

class FormToAddPetActivity : ToolbarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_to_add_pet)

        initToolbar()
    }

    override fun onBackPressed() {
        val intent = Intent(this@FormToAddPetActivity, ViewListPetsActivity ::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }
}