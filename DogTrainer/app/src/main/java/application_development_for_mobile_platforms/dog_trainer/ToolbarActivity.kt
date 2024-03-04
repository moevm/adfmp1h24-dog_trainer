package application_development_for_mobile_platforms.dog_trainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

open class ToolbarActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var toolbar: Toolbar

    protected fun initToolbar() {
        drawerLayout = findViewById(R.id.drawerLayout)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        navigationView = findViewById(R.id.navigationView)

        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navigationView.setNavigationItemSelectedListener { menuItem ->
            drawerLayout.closeDrawers()
            when (menuItem.itemId) {
                R.id.userMe -> {
                    val intent = Intent(this@ToolbarActivity, ViewUserMeActivity ::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.userPets -> {
                    val intent = Intent(this@ToolbarActivity, ViewListPetsActivity ::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.userTrainings -> {
                    val intent = Intent(this@ToolbarActivity, UserTrainingActivity ::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.userAchievements -> {
                    val intent = Intent(this@ToolbarActivity, UserMeAchievementsActivity ::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.commandDirectory -> {
                    val intent = Intent(this@ToolbarActivity, CatalogCommandActivity ::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.allUsersTraining -> {
                    val intent = Intent(this@ToolbarActivity, AllUsersTrainingActivity ::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.usersList -> {
                    val intent = Intent(this@ToolbarActivity, ViewUsersListActivity ::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.about -> {
                    val intent = Intent(this@ToolbarActivity, AboutActivity ::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.logout -> {
                    val intent = Intent(this@ToolbarActivity, AuthUserActivity ::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                else -> false
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        drawerLayout = findViewById(R.id.drawerLayout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            drawerLayout.openDrawer(GravityCompat.START)
        }
        return true
    }
}