package com.example.oshqozon

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.ItemTouchHelper.*
import androidx.recyclerview.widget.RecyclerView
import com.example.oshqozon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var list: MutableList<Ovqat_data>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val background = ColorDrawable(Color.RED)

        list = mutableListOf<Ovqat_data>()
        list.add(Ovqat_data("Salad", "12450 recipes", R.drawable.burger))
        list.add(Ovqat_data("Burger", "12450 recipes", R.drawable.burger2))
        list.add(Ovqat_data("Salad", "12450 recipes", R.drawable.burger))
        list.add(Ovqat_data("Burger", "12450 recipes", R.drawable.burger2))
        list.add(Ovqat_data("Salad", "12450 recipes", R.drawable.burger))
        list.add(Ovqat_data("Burger", "12450 recipes", R.drawable.burger2))
        list.add(Ovqat_data("Salad", "12450 recipes", R.drawable.burger))
        list.add(Ovqat_data("Burger", "12450 recipes", R.drawable.burger2))
        list.add(Ovqat_data("Salad", "12450 recipes", R.drawable.burger))
        list.add(Ovqat_data("Burger", "12450 recipes", R.drawable.burger2))
        list.add(Ovqat_data("Salad", "12450 recipes", R.drawable.burger))
        list.add(Ovqat_data("Burger", "12450 recipes", R.drawable.burger2))
        list.add(Ovqat_data("Salad", "12450 recipes", R.drawable.burger))
        list.add(Ovqat_data("Burger", "12450 recipes", R.drawable.burger2))
        list.add(Ovqat_data("Salad", "12450 recipes", R.drawable.burger))
        list.add(Ovqat_data("Burger", "12450 recipes", R.drawable.burger2))

        val adapter = Ovqat_Adapter(this, list)

        val ItemTiuchHelpAdapter = object : ItemTouchHelper.Callback(){
            override fun getMovementFlags(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder
            ): Int {
                val dragFlags = UP or DOWN or LEFT or RIGHT
                val swipeFlags = START or END
                return makeMovementFlags(dragFlags, swipeFlags)
            }

            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                adapter.onItemMove(viewHolder.adapterPosition, target.adapterPosition)
                return true
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                adapter.onItemDismiss(viewHolder.adapterPosition)
            }

            override fun onChildDraw(
                c: Canvas,
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                dX: Float,
                dY: Float,
                actionState: Int,
                isCurrentlyActive: Boolean
            ) {
                val itemView = viewHolder.itemView

            }

        }

        val itemTouch = ItemTouchHelper(ItemTiuchHelpAdapter)
        itemTouch.attachToRecyclerView(binding.rv)

        binding.rv.adapter = adapter

    }
}