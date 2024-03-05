package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class ViewUsersListActivity : ToolbarActivity() {
    private lateinit var viewUserButtonFirst: Button
    private lateinit var viewUserButtonSecond: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_users_list)

        initToolbar()
        addListenerToViewUserButtonFirst()
        addListenerToViewUserButtonSecond()
    }

    private fun addListenerToViewUserButtonFirst() {
        viewUserButtonFirst = findViewById(R.id.button1)
        viewUserButtonFirst.setOnClickListener {
            val intent = Intent(this@ViewUsersListActivity, ViewUserGuestModeActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun addListenerToViewUserButtonSecond() {
        viewUserButtonSecond = findViewById(R.id.button2)
        viewUserButtonSecond.setOnClickListener {
            val intent = Intent(this@ViewUsersListActivity, ViewUserGuestModeActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this@ViewUsersListActivity, ViewUserMeActivity ::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }
}