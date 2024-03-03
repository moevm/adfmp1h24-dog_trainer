package application_development_for_mobile_platforms.dog_trainer

import android.os.Bundle

class FormToAddPetActivity : ToolbarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_to_add_pet)

        initToolbar()
    }
}