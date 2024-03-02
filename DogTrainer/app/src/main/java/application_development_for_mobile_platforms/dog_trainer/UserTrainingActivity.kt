package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class UserTrainingActivity : ToolbarActivity() {
    private lateinit var addTrainingButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_training)

        initToolbar()
        addListenerToAddTrainingButton()
    }

    private fun addListenerToAddTrainingButton() {
        addTrainingButton = findViewById(R.id.addTrainingButton)
        addTrainingButton.setOnClickListener {
            val intent = Intent(this@UserTrainingActivity, FormToAddTrainingActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }
}