package application_development_for_mobile_platforms.dog_trainer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class EditPetProfileActivity : ToolbarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_pet_profile)

        initToolbar()
    }
}