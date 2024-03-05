package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class ViewListPetsActivity : ToolbarActivity() {
    private lateinit var viewFirstPet: Button
    private lateinit var viewSecondPet: Button
    private lateinit var addPet: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_list_pets)

        initToolbar()
        addListenerAddPetButton()
        addListenerViewFirstPetButton()
        addListenerViewSecondPetButton()
    }

    private fun addListenerViewFirstPetButton() {
        viewFirstPet = findViewById(R.id.viewFirstPet)
        viewFirstPet.setOnClickListener {
            val intent = Intent(this@ViewListPetsActivity, EditPetProfileActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun addListenerViewSecondPetButton() {
        viewSecondPet = findViewById(R.id.viewSecondPet)
        viewSecondPet.setOnClickListener {
            val intent = Intent(this@ViewListPetsActivity, EditPetProfileActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun addListenerAddPetButton() {
        addPet = findViewById(R.id.addPetButton)
        addPet.setOnClickListener {
            val intent = Intent(this@ViewListPetsActivity, FormToAddPetActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this@ViewListPetsActivity, ViewUserMeActivity ::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }
}