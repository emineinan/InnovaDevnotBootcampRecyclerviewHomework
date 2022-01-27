package com.example.recyclerviewhomework.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerviewhomework.Category
import com.example.recyclerviewhomework.CategoryAdapter
import com.example.recyclerviewhomework.R
import com.example.recyclerviewhomework.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private val categoryList = ArrayList<Category>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.recyclerViewCategory.layoutManager =
            StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)

        setCategories()
        setAdapter()

        return binding.root
    }

    private fun setAdapter() {
        val adapter = CategoryAdapter(requireContext(), categoryList)
        binding.recyclerViewCategory.adapter = adapter
    }

    private fun setCategories() {
        val category1 = Category(1, "temel_gida", "Temel Gıda")
        val category2 = Category(1, "atistirmalik", "Atıştırmalık")
        val category3 = Category(1, "cay_kahve", "Çay, Kahve")
        val category4 = Category(1, "soguk_icecek", "Soğuk İçecek")
        val category5 = Category(1, "konserve", "Konserve, Sos")
        val category6 = Category(1, "sut_kahvaltilik", "Süt, Kahvaltılık")
        val category7 = Category(1, "meyve_sebze", "Meyve, Sebze")
        val category8 = Category(1, "temizlik", "Temizlik")
        val category9 = Category(1, "kagit_urunleri", "Kağıt Ürünleri")
        val category10 = Category(1, "mutfak_sarf", "Mutfak Sarf")
        val category11 = Category(1, "bebek", "Bebek, Oyuncak")
        val category12 = Category(1, "kozmetik_bakim", "Kozmetik, Bakım")
        val category13 = Category(1, "saglik_vitamin", "Sağlık, Vitamin")
        val category14 = Category(1, "petshop", "Petshop")
        val category15 = Category(1, "ofis_kirtasiye", "Ofis, Kırtasiye")
        categoryList.add(category1)
        categoryList.add(category2)
        categoryList.add(category3)
        categoryList.add(category4)
        categoryList.add(category5)
        categoryList.add(category6)
        categoryList.add(category7)
        categoryList.add(category8)
        categoryList.add(category9)
        categoryList.add(category10)
        categoryList.add(category11)
        categoryList.add(category12)
        categoryList.add(category13)
        categoryList.add(category14)
        categoryList.add(category15)
    }
}