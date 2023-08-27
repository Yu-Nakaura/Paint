package app.nakaura.chloe.paint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.nakaura.chloe.paint.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        binding.clearButton.setOnClickListener {
            binding.myView.clearCanvas()
        }
    }
}