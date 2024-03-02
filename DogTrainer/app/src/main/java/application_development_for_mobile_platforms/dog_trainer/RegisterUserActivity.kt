package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class RegisterUserActivity : AppCompatActivity() {
    private lateinit var signInButton: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        addListenerToSignInButton()
    }

    private fun addListenerToSignInButton() {
        signInButton = findViewById(R.id.addTrainingButton)
        signInButton.setOnClickListener {
            val intent = Intent(this@RegisterUserActivity, AuthUserActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }
}