package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
//    private var titles = List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupDataBinding()
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
//        recyclerView =
    }
}

class ViewModel {
    var name = "たっつぁん"
}

