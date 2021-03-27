package com.example.holamundo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.holamundo.databinding.ActivityRecycleviewExampleBinding
import androidx.recyclerview.widget.RecyclerView

class recycleview_exampleActivity: AppCompatActivity() {

    companion object {
        val TAG: String = recycleview_exampleActivity::class.java.simpleName.toString()
    }

    private lateinit var binding: ActivityRecycleviewExampleBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecycleviewExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }


}