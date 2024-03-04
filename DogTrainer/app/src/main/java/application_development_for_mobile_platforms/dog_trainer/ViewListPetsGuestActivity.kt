package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class ViewListPetsGuestActivity : ToolbarActivity() {
    private lateinit var petFirst: Button
    private lateinit var petSecond: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_list_pets_guest)

        initToolbar()
        addListenerToPetFirstButton()
        addListenerToPetSecondButton()
    }

    private fun addListenerToPetFirstButton() {
        petFirst = findViewById(R.id.button1)
        petFirst.setOnClickListener {
            val intent = Intent(this@ViewListPetsGuestActivity, ViewPetProfileGuestActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun addListenerToPetSecondButton() {
        petSecond = findViewById(R.id.button2)
        petSecond.setOnClickListener {
            val intent = Intent(this@ViewListPetsGuestActivity, ViewPetProfileGuestActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }
}