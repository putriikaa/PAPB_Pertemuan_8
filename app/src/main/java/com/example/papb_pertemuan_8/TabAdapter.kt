package com.example.papb_pertemuan_8

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabAdapter (fm :FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> MateriFragment()
            2 -> QuizFragment()
            else -> throw IllegalArgumentException("Invalid tab position")
        }
    }
        override fun getPageTitle(position: Int): CharSequence?{
            return when (position) {
                0 -> "Home"
                1 -> "Materi"
                2 -> "Quiz"
                else -> null
            }
        }
}