package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import android.os.Bundle

class FormToAddCommandActivity : ToolbarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_to_add_command)

        initToolbar()
    }
    override fun onBackPressed() {
        val intent = Intent(this@FormToAddCommandActivity, EditPetProfileActivity ::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }
}