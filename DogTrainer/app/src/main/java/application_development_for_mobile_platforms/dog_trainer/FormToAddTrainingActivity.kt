package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FormToAddTrainingActivity : ToolbarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_to_add_training)

        initToolbar()
    }

    override fun onBackPressed() {
        val intent = Intent(this@FormToAddTrainingActivity, UserTrainingActivity ::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }
}