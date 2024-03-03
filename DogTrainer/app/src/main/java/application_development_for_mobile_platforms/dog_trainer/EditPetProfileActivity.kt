package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class EditPetProfileActivity : ToolbarActivity() {
    private lateinit var addPetCommandButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_pet_profile)

        initToolbar()
        addListenerToAddPetCommandButton()
    }

    private fun addListenerToAddPetCommandButton() {
        addPetCommandButton = findViewById(R.id.addPetCommandButton)
        addPetCommandButton.setOnClickListener {
            val intent = Intent(this@EditPetProfileActivity, FormToAddCommandActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }
}