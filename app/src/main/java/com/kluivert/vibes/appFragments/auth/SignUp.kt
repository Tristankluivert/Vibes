package com.kluivert.vibes.appFragments.auth

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.google.firebase.auth.FirebaseUser
import com.kluivert.vibes.R
import com.kluivert.vibes.activity.MainActivity
import com.kluivert.vibes.databinding.FragmentPlayScreenBinding
import com.kluivert.vibes.databinding.FragmentSignUpBinding
import com.kluivert.vibes.utils.AppUtils
import com.kluivert.vibes.utils.FirebaseUtils.firebaseAuth


class SignUp : Fragment() {

    lateinit var userEmail: String
    lateinit var userName : String
    lateinit var userPassword: String
    lateinit var createAccountInputsArray: Array<EditText>

    private var _binding : FragmentSignUpBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onStart() {
        super.onStart()
        val user: FirebaseUser? = firebaseAuth.currentUser
        user?.let {
         //   startActivity(Intent(this, MainActivity::class.java))
         //   AppUtils.
        }
    }

    private fun registerUser(){
        val name = binding.edname.text.toString()
        val email = binding.edmail.text.toString()
        val password = binding.edpassword.text.toString()



        if (name.isEmpty()){
            binding.edname.requestFocus()
            binding.edname.error = "Please enter a name"
        }else if(TextUtils.isEmpty(email) || android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.edmail.requestFocus()
            binding.edmail.error = "Please enter a name"
        }


    }


}