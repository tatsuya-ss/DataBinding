package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private var titles = listOf<String>("卵", "米", "刺身", "醤油")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupDataBinding()
        setupRecyclerView()
    }

    private fun setupDataBinding() {
        // アクティビティのコンテンツビューを指定されたレイアウトに設定し、バインディングを返す
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(
            this, R.layout.activity_main
        )
        // ViewModelのインスタンスを作成し、xmlファイルで決めた名前に渡す
        binding.viewModel = ViewModel()
    }

    private fun setupRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = RecyclerViewAdapter(titles)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}

class ViewModel {
    var name = "たっつぁん"
}

