package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatButton

class RegisterUserActivity : AppCompatActivity() {
    private lateinit var signInButton: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        addListenerToSignInButton()
    }

    private fun addListenerToSignInButton() {
        signInButton = findViewById(R.id.signInButton)
        signInButton.setOnClickListener {
            val intent = Intent(this@RegisterUserActivity, AuthUserActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this@RegisterUserActivity, AuthUserActivity ::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }
}