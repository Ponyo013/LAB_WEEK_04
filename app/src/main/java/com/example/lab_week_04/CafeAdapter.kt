package com.example.lab_week_04

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)

class CafeAdapter(
    private val context: Context,   // add this
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    private val cafeDescriptions = listOf(
        R.string.starbucks_desc,
        R.string.janjijiwa_desc,
        R.string.kopikenangan_desc,
    )

    override fun getItemCount(): Int = TABS_FIXED.size

    override fun createFragment(position: Int): Fragment {
        val description = context.getString(cafeDescriptions[position])
        return CafeDetailFragment.newInstance(description)
    }
}
