package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import android.os.Bundle
import android.view.View

class CatalogCommandActivity : ToolbarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog_command)

        initToolbar()
    }

    fun onImageClick(view: View) {
        val intent = Intent(this@CatalogCommandActivity, CommandActivity ::class.java)
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        val intent = Intent(this@CatalogCommandActivity, ViewUserMeActivity ::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }
}