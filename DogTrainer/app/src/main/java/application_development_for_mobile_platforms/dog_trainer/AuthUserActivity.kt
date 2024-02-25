package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class AuthUserActivity : AppCompatActivity() {
    private lateinit var signInButton: AppCompatButton
    private lateinit var signUpButton: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth_user)

        addListenerToSignInButton()
        addListenerToSignUpButton()
    }

    private fun addListenerToSignInButton() {
        signInButton = findViewById(R.id.singInButton)
        signInButton.setOnClickListener {
            val intent = Intent(this@AuthUserActivity, ViewUserMeActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun addListenerToSignUpButton() {
        signUpButton = findViewById(R.id.signUpButton)
        signUpButton.setOnClickListener {
            val intent = Intent(this@AuthUserActivity, RegisterUserActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }
}