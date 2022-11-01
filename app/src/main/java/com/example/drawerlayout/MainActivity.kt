package com.example.drawerlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import com.example.drawerlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //액션바대신에 툴바로 대체
        setSupportActionBar(binding.toolbar)
        //ActionBarDrawerToggle버튼
        toggle = ActionBarDrawerToggle(this, binding.drawerLayout,R.string.drawer_open, R.string.drawer_close)
        //업버튼 활성화
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //토글 싱크
        toggle.syncState()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       //이벤트가 토글버튼에서 발생하면
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}