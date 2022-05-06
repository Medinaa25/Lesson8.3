package com.example.lesson83

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import java.time.temporal.ValueRange


fun Fragment.navigate(action : Int, bundle : Bundle? = null){
    NavHostFragment.findNavController(this).navigate(action,bundle)

}

/*fun Context.launchFragment(action: Int){
    findNavController(this).navigate(action)*/


fun Context.showToast(text: CharSequence){
    Toast.makeText(this,text, Toast.LENGTH_SHORT).show()}

