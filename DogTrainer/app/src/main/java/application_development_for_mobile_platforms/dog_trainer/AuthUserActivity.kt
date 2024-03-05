package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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
        signInButton = findViewById(R.id.signInButton)
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

    override fun onBackPressed() {
        AlertDialog.Builder(this).apply {
            setTitle("Подтверждение")
            setMessage("Вы уверены, что хотите выйти из приложения?")

            setPositiveButton("Да") { _, _ ->
                super.onBackPressed()
            }

            setNegativeButton("Нет"){_, _ ->
                // if user press no, then return the activity
                Toast.makeText(this@AuthUserActivity, "Thank you",
                    Toast.LENGTH_LONG).show()
            }
            setCancelable(true)
        }.create().show()
    }
}