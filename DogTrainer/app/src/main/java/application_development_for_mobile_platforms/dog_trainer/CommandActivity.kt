package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CommandActivity : ToolbarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_command)

        initToolbar()
    }

    override fun onBackPressed() {
        val intent = Intent(this@CommandActivity, CatalogCommandActivity ::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }
}