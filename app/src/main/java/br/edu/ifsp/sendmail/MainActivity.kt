package br.edu.ifsp.sendmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.edu.ifsp.sendmail.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val amb: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(amb.root)
    }
}