package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class ViewUserGuestModeActivity : ToolbarActivity() {
    private lateinit var usersListButton: Button
    private lateinit var userAchievements: Button
    private lateinit var userPets: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_user_guest_mode)

        initToolbar()
        addListenerToUsersListButton()
        addListenerToUserAchievementsButton()
        addListenerToUserPetsButton()
    }

    private fun addListenerToUsersListButton() {
        usersListButton = findViewById(R.id.buttonToUsers)
        usersListButton.setOnClickListener {
            val intent = Intent(this@ViewUserGuestModeActivity, ViewUsersListActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun addListenerToUserAchievementsButton() {
        userAchievements = findViewById(R.id.buttonUsersAchievements)
        userAchievements.setOnClickListener {
            val intent = Intent(this@ViewUserGuestModeActivity, UserAchievementsActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun addListenerToUserPetsButton() {
        userPets = findViewById(R.id.buttonUsersPet)
        userPets.setOnClickListener {
            val intent = Intent(this@ViewUserGuestModeActivity, ViewListPetsGuestActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this@ViewUserGuestModeActivity, ViewUsersListActivity ::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }
}