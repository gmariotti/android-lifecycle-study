package com.mariotti.developer.studyapplicationlifecycle

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView

abstract class SingleFragmentActivity : AppCompatActivity() {

	protected open val TAG = "SingleFragmentActivity"
	protected open val layoutResId: Int = R.layout.activity_fragment
	protected lateinit var activityNameTextView: TextView

	protected abstract fun createFragment(): Fragment;

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(layoutResId)

		Log.d(TAG, "onCreate")

		activityNameTextView = findViewById(R.id.activity_name_text_view) as TextView
		activityNameTextView.text = TAG

		// set the fragment
		val fragmentManager = supportFragmentManager
		var fragment: Fragment? = fragmentManager.findFragmentById(R.id.fragment_container)

		if (fragment == null) {
			fragment = createFragment()
			fragmentManager.beginTransaction().add(R.id.fragment_container, fragment).commit()
		}
	}

	override fun onStart() {
		super.onStart()

		Log.d(TAG, "onStart")
	}

	override fun onResume() {
		super.onResume()

		Log.d(TAG, "onResume")
	}

	override fun onPause() {
		super.onPause()

		Log.d(TAG, "onPause")
	}

	override fun onStop() {
		super.onStop()

		Log.d(TAG, "onStop")
	}

	override fun onDestroy() {
		super.onDestroy()

		Log.d(TAG, "onDestroy")
	}
}
